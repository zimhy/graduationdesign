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

	
	
		</div>

		<div id="footer">Copyright zhangmenghai</div>

	</div>

</body>




</html>
