<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty uname}"><h4>Name:<c:out value="${uname}"/></h4></c:if>
<h4>Email:<%=request.getAttribute("email") %> </h4>
<h4>College:<%=request.getAttribute("college") %> </h4>
<h4>Department:<%=request.getAttribute("department") %> </h4>
</body>
</html>