<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>测试</title>
</head>

<body>
	<c:forEach items="${user}" varStatus="i" var="item">
		<h2>${item.userName}</h2>
	</c:forEach>
</body>
</html>
