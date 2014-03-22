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

<div class="answercontent"> 

<table id="answers">

<tr>
<td class="" id="1">	<input type="radio" value=""  />
</td>
<td class="" id="2">	<input type="radio" value=""  />
</td>
</tr>

<tr>
<td class="" id="3">	<input type="radio" value=""  />
</td>
<td class="" id="4">	<input type="radio" value=""  />
</td>
</tr>

<tr>
<td class="" id="5">	<input type="radio" value=""  />
</td>
<td class="" id="6">	<input type="radio" value="" />
</td>
</tr>

<tr>
<td class="" id="7">	<input type="radio" value=""  />
</td>
<td class="" id="8">	<input type="radio" value=""  />
</td>
</tr>

<tr>
<td class="" id="9">	<input type="radio" value=""  />
</td>
<td class="" id="10">	<input type="radio" value=""  />
</td>
</tr>

</table>


</div>



</div>

</div> 

</div>

</body>
</html>