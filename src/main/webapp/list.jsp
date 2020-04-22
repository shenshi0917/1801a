<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
  <tr>
    <th> </th>
    <th>ID</th>
    <th>英雄</th>
    <th>阵营</th>
    <th>价格(钻石)</th>
    <th>状态</th>
    <th>上线时间</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${list }" var="h">
  <tr>
    <td> <input type="checkbox"> </td>
    <td>${h.hid }</td>
    <td>${h.hname }</td>
    <td>${h.cname }</td>
    <td>${h.price }</td>
    <td>${h.status }</td>
    <td>${h.uptime }</td>
    <td> 详情 购买 </td>
  </tr>
  </c:forEach>
</table>

</body>
</html>