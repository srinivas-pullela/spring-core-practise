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
   <form action="./saveentry" method="post">
    <div class="container">
        <div class="header">
            <span class="title">MyDiary App</span>
        </div>
        <h3><p>Welcome <span style="color:green">${user.username}</span></p></h3>
        <a href="./signout" style="background-color: red; color: white; padding: 8px 12px; border-radius: 5px; text-decoration: none; float: right;margin-top: -40px;">Signout</a>
        <div class="content">
            <div class="form">
                <span class="add-entry">Add Entry</span>
                <label for="date">Date</label>
                <input type="date" id="date" name="entrydate">
                <label for="description">Description</label>
                <textarea id="description" name="description" rows="4"></textarea>
                <input type="hidden" name="userid" value="${user.id}">
                <button class="save-button">Save Entry</button>
            </div>
        </div>
    </div>
  </form>
</body>
</html>
