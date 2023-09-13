<!-- The scripting elements provides the ability to insert java code inside the jsp. There are three types of scripting elements:

scriptlet tag
expression tag
declaration tag
 -->

<!--A scriptlet tag is used to execute java source code in JSP. Syntax is as follows: -->
<!--    </%  java source code %>    -->



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="welcome1.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
</body>
</html>