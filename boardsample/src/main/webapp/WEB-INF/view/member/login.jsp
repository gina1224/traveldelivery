<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인페이지</title>
<%@ include file="../include/header.jsp" %>
<script>
	$(document).ready(function(){
		$("#btnLogin").click(function(){
			//태그.val():태그에 입력된 값
			//태그.val("값"): 태그의 값을 변경
			var userId=$("#userId").val();
			var userPw=$("#userPw").val();
			if(userId==""){
				alert("아이디를 입력하세요.");
				$("#userId").focus();//입력포커스 이동
				return; //함수 종료
			}
			if(userPw==""){
				alert("비밀번호를 입력하세요.");
				$("#userPw").focus();
				return;
			}
			//폼 내부의 데이터를 전송할 주소
			document.form1.action="${path}/member/loginCheck.do"
			//제출
			document.form1.submit();
		});
	});
</script>
</head>
<body>
<%@include file="../include/menu.jsp" %>
<br>
<center>
<div>PickME</div>

<hr/>
<h2><text font-color="orage">로그인</text></h2>
	<form name="form1" method="post">
		<table border="1" width="400px">
			<tr>
				<td>아이디</td>
				<td><input name="userId" id="userId"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="userPw" id="userPw"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" id="btnLogin">로그인</button>
				<c:if test="${msg == 'failure'}">
					<div style="color:red">
					아이디 또는 비밀번호가 일치하지 않습니다.
					</div>
				</c:if>
				<c:if test="${msg == 'logout'}">
					<div style="color:red">
					로그아웃되었습니다.
					</div>
				</c:if>
				</td>
			</tr>
		
		</table>
	</form>
</center>
</body>
</html>