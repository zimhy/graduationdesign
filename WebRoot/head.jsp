<%@page import="persistance.Plans"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<style type="text/css">
div#container {
	width: 1024px
}

div#header {
	text-align: center;
	background-color: #99bbbb;
}

div#menu {
	background-color: #ffff99;
	height: 200px;
	width: 200px;
	float: left;
}

div#content {
	background-color: #EEEEEE;
	height: 200px;
	width: 824px;
	float: left;
}

div#footer {
	background-color: #99bbbb;
	clear: both;
	text-align: center;
}

h1 {
	margin-bottom: 0;
}

h2 {
	margin-bottom: 0;
	font-size: 18px;
}

ul {
	margin: 0;
}

li {
	list-style: none;
}
</style>
</head>
	<%
		Plans plan = (Plans) session.getAttribute("selectedplan");
	%>
<body>
	<h1><%=plan.getPlanname()%></h1>
	<h2>
		<tr>
			<td>预案编号：<%=plan.getIdplans()%></td>
			<td>预案名：<%=plan.getPlanname()%></td>
		</tr>
	</h2>
</body>


</html>
</html>
