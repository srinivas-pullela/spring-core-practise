<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<c:url value="/resources/styles/viewentry.css"/>"/>
    <title>MyDiary App</title>
    <style>
    </style>
</head>
<body>
   <form action="./userhomepage" method="post">
    <div class="container">
        <div class="header">
            <span class="title">MyDiary App</span>
        </div>
        <h3><p>Welcome <span style="color:green">${user.username}</span></p></h3>
        <a href="./signout" style="background-color: red; color: white; padding: 8px 12px; border-radius: 5px; text-decoration: none; float: right;margin-top: -40px;">Signout</a>

        <span class="add-entry">View Details</span>
        <table>
          <tr>
            <td>Date:</td>
            <td>${entry.entrydate}</td>
          </tr>
          <tr>
            <td>Description:</td>
            <td>${entry.description}</td>
          </tr>
        </table>
       <a href="./userhomepage"><button class="save-button">Go to Home</button></a>
    </div>
  </form>
</body>
</html>
