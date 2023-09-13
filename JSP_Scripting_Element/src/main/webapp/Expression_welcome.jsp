<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
<%= "Welcome "+request.getParameter("uname")+
     java.util.Calendar.getInstance().getTime() %>  
<br>
Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</body>
</html>