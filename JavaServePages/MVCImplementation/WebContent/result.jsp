<%@page import="com.mvc.deloitte.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result</title>
</head>
<body>
	
	<% 
		Customer c =  new Customer();
		c = (Customer) session.getAttribute("custDetails");
		out.println("Customer id : " + c.getCustomerId()+"<br>");
		out.println("Customer name : "+ c.getCustomerName()+"<br>");
		out.println("Customer address : "+c.getCustomerAddress()+"<br>");
		out.println("Customer bill : " + c.getBillAmount()+"<br>");
		
	%>
	
</body>
</html>