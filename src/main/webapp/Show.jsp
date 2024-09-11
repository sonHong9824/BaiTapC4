<%--
    Document   : thanks
    Created on : Aug 28, 2024, 12:05:05?PM
    Author     : ASUS
--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"><!-- comment -->
    <title>Show</title>
    <link rel="stylesheet" href="style/main.css" type="text/css"/>
</head>
<body>
<p> Here is the information that you entered:</p>
<h2>Your information</h2>
<label> Email:</label>
<span> ${user.email}</span><br>
<label>First Name:</label>
<span> ${user.firstName}</span><br>
<label> Last Name:</label>
<span> ${user.lastName}</span><br>
<label> Date of birth:</label>
<span> ${user.date}</span><br>
<h2>How did you hear about us?</h2>
<span> ${user.hear}</span><br>
<h2>Would you like to receive announcements about new CDs and special offers?</h2>
<span> ${user.announ}</span><br>
<h2>Contact </h2>
<span> ${user.contact}</span><br>
<p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>

<form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
</form>

</body>
</html>
