<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MyDiary App</title>
    <link rel="stylesheet" href="<c:url value="/resources/styles/styles.css"/>"/>
</head>
<body>
    <div class="container">
        <header>
            <h2>MyDiary App</h2>
            <div class="user-info">
                <a href="./signout" class="signout">Signout</a>
            </div>
        </header>

        <!-- Add a new div here for "Welcome Santosh" below the header -->
        <div class="welcome-message">
            <h2><p>Welcome <span style="color:red">${user.username}</span></p></h2>
        </div>

        <h3>List of Past Entries</h3>

        <a href="./addentry"><button class="add-entry">Add Entry</button></a>

        <table>
            <thead>
                <tr>
                    <th>Date</th>
                    <th colspan="3">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:if test="${entrieslist.size()==0}">
                   <tr>
                      <td style="font-size:20px ;color:green" colspan="4">User not added any Diary entries till now</td>
                   </tr>
                </c:if>
                <c:forEach items="${entrieslist}" var="e">
                   <tr>
                      <td><fmt:formatDate value="${e.entrydate}" pattern="dd/MM/yyyy"/></td>
                      <td><a href="./viewentrypage?id=${e.id}" class="view">View</a></td>
                      <td><a href="./updateentry?id=${e.id}" class="update">Update</a></td>
                      <td><a href="./deleteentry?id=${e.id}" class="delete">Delete</a></td>
                   </tr>
               </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
