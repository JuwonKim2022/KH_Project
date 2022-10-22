
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="net.kh.jsp.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>
	<%
	DBUtility dbUtility = new DBUtility();
	

	
		int id=dbUtility.getA();
		out.print(id+"<br>");

	%>

<h1>123sd</h1>
</body>
</html>