<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form action="LoginProc" method="post">
<input type="text" name="m_id" required="required" placeholder="아이디">
<input type="password" name="m_pwd" required="required" placeholder="비밀번호">
<input type="submit" value="로그인">
</form>
<a href="joinFrm">회원가입</a>
<p><a href="admin">관리자 로그인</a></p>
</body>
</html>
