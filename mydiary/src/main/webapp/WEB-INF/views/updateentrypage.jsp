<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
   <form action="./processentryupdate" method="post">
    <div class="container">
        <div class="header">
            <span class="title">MyDiary App</span>
        </div>
        <h3><p>Welcome <span style="color:green">${user.username}</span></p></h3>
        <a href="./signout" style="background-color: red; color: white; padding: 8px 12px; border-radius: 5px; text-decoration: none; float: right;margin-top: -40px;">Signout</a>
        <div class="content">
            <div class="form">
                <span class="add-entry">Update Entry</span>
                
                <label for="date">Date</label>
                <input type="text" name="entrydate" value="<fmt:formatDate value="${entry.entrydate}" pattern="dd/MM/yyyy"/>" readonly>
                
                <label for="description">Description</label>
                <textarea name="description" rows="4">${entry.description}
                </textarea>
                
                <input type="hidden" name="userid" value="${user.id}">
                <input type="hidden" name="id" value="${entry.id}">
                
                <button class="save-button" type="submit">Update Entry</button>
            </div>
        </div>
    </div>
  </form>
</body>
</html>