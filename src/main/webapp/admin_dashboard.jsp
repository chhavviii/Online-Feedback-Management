<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="com.feedback.model.Feedback" %>
<%
    List<Feedback> feedbacks = (List<Feedback>)request.getAttribute("feedbacks");
%>
<html>
<head>
    <title>Admin Dashboard</title>
    <style>
        body { background-color: #23272f; color: #edeef2; font-family: Arial; }
        table { background: #2e323c; color: #edeef2; width: 100%; border-collapse: collapse; }
        th, td { padding: 8px 10px; border: 1px solid #444; }
        th { background: #3b3f48; }
    </style>
</head>
<body>
<h2>Feedback Dashboard</h2>
<form method="get" action="admin">
    <label for="categoryFilter">Filter by Category: </label>
    <select name="category" id="categoryFilter">
        <option value="">All</option>
        <option value="Positive">Positive</option>
        <option value="Negative">Negative</option>
        <option value="General">General</option>
    </select>
    <button type="submit">Apply</button>
</form>
<br>

<table>
    <tr>
        <th>ID</th><th>User</th><th>Email</th><th>Comment</th><th>Status</th><th>Category</th><th>Change Status</th>
    </tr>
    <c:forEach var="fb" items="${feedbacks}">
        <tr>
            <td>${fb.id}</td>
            <td>${fb.username}</td>
            <td>${fb.email}</td>
            <td>${fb.comments}</td>
            <td>${fb.status}</td>
            <td>${fb.category}</td>
            <td>
                <form method="post" action="admin">
                    <input type="hidden" name="action" value="updateStatus"/>
                    <input type="hidden" name="id" value="${fb.id}"/>
                    <select name="status">
                        <option>Pending</option>
                        <option>Addressed</option>
                        <option>Rejected</option>
                    </select>
                    <button type="submit">Update</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
