<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="contectRoot" value="${pageContext.request.contextPath}" ></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" >
<title>Insert title here</title>
</head>
<body>
	<h1>Expense Tracker</h1>
	<p>${message}</p>
	<a href="${contextRoot}/expense">Add Expense</a>
	
	<c:forEach var="expense" items="${expenses}" >
	<div>
	<h2>${expense.expenses}</h2>
	<p>&#8377;${expense.amount}</p>
	<a href="${contextRoot}/expense/${expense.id}" >Edit</a>
	</div>
	 </c:forEach>

</body>
</html>