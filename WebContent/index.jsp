<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎页面</title> 
<%--  <jsp:include page="base.jsp" />
 --%></head>
<body>

欢迎页面

<!-- <img alt="" src="images/logo.png" > -->
<hr>
<a href="<%=path%>/user/doAddUser"> 添加员工测试</a>
<a href="<%=path%>/user/doAddUser2"> 添加员工测试2</a>

<a href="<%=path%>/user/findListby"> find </a>
</body>
</html>