<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
아이디 : ${info.m_id} <br>
이름 : ${info.m_name} <br>
나이 : ${info.m_age} <br>
주소 : ${info.m_addr} <br>
<a href="update">수정</a>    <a href="deleteProc">삭제</a>
</body>
<script type="text/javascript">
var msg = "${msg}";
if(msg != ""){
	alert(msg);
}
</script>
</html>