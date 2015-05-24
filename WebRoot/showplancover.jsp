<%@page import="persistance.Plans"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<body>
	<%
		Plans plan = (Plans) session.getAttribute("selectedplan");
	%>

	<div id="container">
		<div id="header">
			<jsp:include page="head.jsp" />
		</div>

		<div id="menu">
			<h2>预案查看</h2>
			<ul>
				<li><a href="http://127.0.0.1:8080/test/showplace.jsp">对象概况</a>
				</li>
				<li><a href="http://127.0.0.1:8080/test/showforces.jsp">力量部署
				</li>
				<li><a href="http://127.0.0.1:8080/test/showforces.jsp">灾情设定
				</li>
			</ul>
		</div>

		<div id="content">

			<table border="1">
				<tr class="table_header">
					<td><%=plan.getIdplans()%></td>
					<td>预案名： <a
						href="http://zimhy.mshome.net:8080/test/selectplan.action?idplans=<%=plan.getIdplans()%>"><%=plan.getPlanname()%></a>
					</td>
					<td>预案类型：<%=plan.getPlantype()%></td>
					<td>预案编制人：<%=plan.getDesigner()%></td>
					<td>编制单位：<%=plan.getDesigndepartment()%></td>
				</tr>
			</table>
			<img   src="<%=plan.getImagepath() %>"> 
			
						<table border="1">
				<tr class="table_header">
					<td>预案编号：<%=plan.getIdplans() %>
					</td>
					<td>预案名：<%=plan.getPlanname() %></td>
					</tr>
					<tr>
					<td>预案编制人：<%=plan.getDesigner()%></td>
					<td>编制单位：<%=plan.getDesigndepartment()%></td>
				</tr>
				<tr >
					<td>预案编制日期：<%=plan.getPlandate() %>
					</td>
					<td>预案编制日期：<%=plan.getPlace().getAddress() %>
					</td>

				</tr>
			</table>
		</div>

		<div id="footer">Copyright zhangmenghai</div>

	</div>

</body>




</html>
