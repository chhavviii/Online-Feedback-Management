<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback Form</title>
</head>
<body>
 
 <h2>Submit Your Feedback</h2>
 <form action="submitFeedback" method="post">
     Name: <input type="text" name="username" required> <br><br>
     Email: <input type="email" name="email" required><br><br>
     Comments: <br>
     <textarea name="comments" rows ="5" cols="30" required></textarea>
     <br><br>
     <input type="submit" value="Submit">
 </form>


</body>
</html>