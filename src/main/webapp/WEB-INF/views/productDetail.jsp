<%@page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Insert title here</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P> name :  ${productVO.name}. </P>
<P> price :  ${productVO.price}. </P>
</body>
</html>
