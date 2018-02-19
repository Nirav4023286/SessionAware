<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="verify.action">
<s:textfield name="uname" label="Enter Username"></s:textfield>
<s:textfield name="age" label="Enter Your Age"></s:textfield>
<s:textfield name="contactno" label="Enter Contactno"></s:textfield>
<s:textfield name="country" label="Enter your Country"></s:textfield>
<s:submit value="Go"></s:submit> 
</s:form>
</body>
</html>