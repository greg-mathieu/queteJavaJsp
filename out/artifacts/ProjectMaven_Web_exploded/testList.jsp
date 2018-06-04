<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 04/06/18
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="header.jsp"/>
    <title>Title</title>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<ul class="list-group">
    <c:forEach items="${requestScope.testListValue}" var="currentValue">
        <li class="list-group-item list-group-item-action list-group-item-primary">Name : ${currentValue.name}</li>
        <li class="list-group-item">Email : ${currentValue.email}</li>
        <li class="list-group-item">Login : ${currentValue.login}</li>
        <li class="list-group-item">Id : ${currentValue.id}</li>
        <li class="list-group-item">Avatar URL : ${currentValue.avatarUrl}</li>
        <br/>
    </c:forEach>
</ul>
<jsp:include page="footer.jsp"/>
</body>
</html>
