<%@page import="persistance.Plans"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'showallplans.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
爱上大声大声大声道
<body>

	<br>
	<table border="1">
		<tr class="table_header">
			<td>预案id：</td>
			<td>预案名：</td>
			<td>预案种类：</td>
			<td>预案设计人：</td>
			<td>预案设计单位：</td>

		</tr>
		<%
			Enumeration para =  request.getParameterNames();
			while (para.hasMoreElements()) {
		%>
		<%=para.nextElement()  %>
		<%
			}
		%>
				<%
			Enumeration attri =  request.getAttributeNames();
			while (attri.hasMoreElements()) {
		%>
		<%=attri.nextElement()  %>
		<%
			}
		%>
		<%
			List plans = (List) request.getAttribute("plans");
			Iterator it = plans.iterator();
			Plans plan = null;
			while (it.hasNext()) {
				plan = (Plans) it.next();
		%>
		<tr class="table_header">
			<td><%=plan.getIdplans()%></td>
			<td><a
				href="http://127.0.0.1:8080/test/selectplan.action?idplans=<%=plan.getIdplans()%>"><%=plan.getPlanname()%></a>
			</td>
			<td><%=plan.getPlantype()%></td>
			<td><%=plan.getDesigner()%></td>
			<td><%=plan.getDesigndepartment()%></td>

		</tr>
		<%
			}
		%>
	</table>




</body>
</html>
