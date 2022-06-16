<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>

</head>
<body>
	<form action="joinProc" method="post">
		<fieldset>
			<input type="text" name="m_id" placeholder="아이디" required ><br>
			<input type="text" name="m_name" placeholder="이름" required ><br>
			<input type="password" name="m_pwd" placeholder="비밀번호" required ><br>
			<input type="text" name="m_age" placeholder="나이" required ><br>
			<input type="text" name="m_addr" placeholder="주소" required ><br>
			<input type="submit" value="가입">
		</fieldset>
	</form>
	<a href="./">홈으로가기</a>
</body>
<script type="text/javascript">
var msg = "${msg}";
if(msg != ""){
	alert(msg);
}
</script>
</html>