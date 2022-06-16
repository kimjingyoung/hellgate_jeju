<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateProc" method="post">
		<fieldset>
			<input type="text" name="m_id" value="${info.m_id}"  readonly="readonly" required><br>
			<input type="text" name="m_name" value="${info.m_name}" placeholder="이름" required><br>
			<input type="password" name="m_pwd" value="${info.m_pwd}" placeholder="비밀번호" required><br>
			<input type="text" name="m_age" value="${info.m_age}" placeholder="나이" required><br>
			<input type="text" name="m_addr" value="${info.m_addr}" placeholder="주소" required><br>
			<input type="submit" value="수정">
		</fieldset>
	</form>
	<a href="./"> 홈으로가기 </a>
	
</body>
</html>