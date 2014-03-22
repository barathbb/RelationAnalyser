<%@page import="util.AnswerTableGenerator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Test </title>

<link rel="stylesheet" type="text/css" href="css/showtest.css" />

<script type="text/javascript" src="js/jquery.min.js"></script>

<script type="text/javascript" src="js/showtest.js"></script>

</head>

<body>

<div id="all">
 
<div id="questionindex">

<table id="qlinktable">

<% 
for(int i=0; i<10 ; i++) {
%>

<tr class="qlinkrow"><td class="qlinkcell" id="<%=i+1%>"> <span class="qnumber" align="Center"> <%=i+1 %> </span> </td></tr>

<% } %>

</table>

</div> 
 
<div id="questions">

<div class="onequestion">

<div class="questioncontent"></div>

<div class="answercontent"> </div>

<table id="answers">

<%-- <jsp:include page="answersdisplay.jsp"></jsp:include> --%>

<% out.write(AnswerTableGenerator.generateAnswersHTML(10)); %>

</table>

</div>

</div> 

</div>

</body>
</html>