<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%  String path=request.getContextPath();  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- 引入 css -->
<link href="\resource\css\css.css" rel="stylesheet">
<!-- 引入 js -->
<script type="text/javascript" src="\resource\js\jquery-3.2.1.js"></script>
<script type="text/javascript" src="\resource\js\jqueryvalidate\jquery.validate.js"></script>
<script type="text/javascript" src="\resource\js\jqueryvalidate\localization\messages_zh.js"></script>
<script type="text/javascript" src="\resource\js\jqueryvalidate\additional-methods.js"></script>
</head>
<body>
<form action="list">
	<table>
		<tr>
			<td>编号</td>
			<td>名称</td>
			<td>first_char</td>
			<td>deleted_flag</td>
		</tr>
		<c:forEach items="${list }" var="ll">
			<tr>
				<td>${ll.id }</td>
				<td>${ll.name }</td>
				<td>${ll.first_char }</td>
				<td>${ll.deleted_flag }</td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>