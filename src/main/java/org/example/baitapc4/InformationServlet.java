/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package org.example.baitapc4;

import java.time.LocalDate;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "InformationServlet", urlPatterns = {"/InformationServlet"})
public class InformationServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";

        String action = request.getParameter("action");
        if(action == null){
            action = "join";
        }

        if(action.equals("join")){
            url = "/index.html";
        }
        else if(action.equals("add")){
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String date = request.getParameter("date");
            String hear = request.getParameter("idea");
            String[] announA = request.getParameterValues("announcements");
            if(announA == null)
                announA = new String[]{" "};
            String contact = request.getParameter("option");
            String announ ="";
            if(announA.length>0){
                announ = String.join(System.lineSeparator(), announA);
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dob = LocalDate.parse(date, formatter);
            User user = new User(firstName, lastName, email, dob, hear, announ, contact);

            request.setAttribute("user", user);
            url = "/Show.jsp";
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
