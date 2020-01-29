<%@page import="com.minedeed.entiy.Student"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'reg.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form action="/class/student/update.do" method="post">
		id:<input type="text" name=id value="${student.id }" readonly="readonly"> <br />用戶名:<input
			type="text" name="username" value="${student.username }"><br>
		姓名:<input type="text" name="name" value="${student.name }" /><Br>
		密码:<input type="password" name="password" /><Br> 地址:<input
			type="text" name="address" /><Br> 生日:<input type="text"
			name="birthday" /><Br> 手机:<input type="text" name="tel">
		<Br>Email:<input type="text" name="email" /><br> <input
			type="submit" />

	</form>
</body>
</html>
