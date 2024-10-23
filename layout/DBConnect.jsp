<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Connection con = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	try{
		Class.forName("oracle.jdbc.OracleDriver");		
		con = DriverManager.getConnection(url, "system", "1234");
		System.out.println("접속성공");
	} catch(Exception e){
		e.printStackTrace();
	}
%>
</body>
</html>