<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Read Contents</title>
</head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bo.otstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>

$(document).ready(function(){
	$('#PNAME').keyup(function(){
		if($(this).val().length > $(this).attr('maxlength')){
		alert('10글자 이내로 작성해 주세요.');
		$(this).val($(this).val().substr(0,$(this).attr('maxlength')));
		}
	})
})
</script>

<body>

<center>
<h2>REGISTER PRODUCT</h2>
	<div class="container">
		<form method="post" name="form2" action="update">
		
		 <div class="form-group">
		<label>상품이름: <input type="text" id="PNAME" maxlength="10" name="PNAME"></label><br>
		</div>
		 <div class="form-group">
		<label>상품가격(원): <input type="text" id="PRICE" name="PRICE"></label><br>
		</div>
		 <div class="form-group">
		<label>상품개수: <input type="text" id="COUNT" name="COUNT"></label><br>
		</div>
		
		 <div class="form-group">
		<label>구매자 소속 국가:<select id="fromNATION" name="fromNATION">
		
		   <option value="">국가선택</option>
		   
		   <%int i = 24; %>
		   <c:forEach var="nation" items="${fromNation}">
		   <%if(i == 58) break; %>
		    <option value="<%=i++%>">${nation.CODENAME}</option>
		    </c:forEach>
		    
		 
		</select>
		</label>    
		</div>
		
		 <div class="form-group">
		<label>물품 구매 국가:<select id="toNATION" name="toNATION">
		
		   <option value="">국가선택</option>
		   
		   <%int j = 24; %>
		   <c:forEach var="nation" items="${toNation}">
		   <%if(j == 58) break; %>
		    <option value="<%=i++%>">${nation.CODENAME}</option>
		    </c:forEach>
		</select>
		</label>
		</div>
	
	 <div class="form-group">
		<label>크기:<select id="SIZE" name="SIZE">
			<option value="">크기선택</option>
			<%int k = 58; %>
			<c:forEach var="size" items="${SIZE}">
			<%if (k == 61) break; %>
			<option value="<%=k++ %>">${size.CODENAME}</option>
			</c:forEach>
		</select>
		</label>
	</div>
	
	 <div class="form-group">
		<label>무게:<select id="WEIGHT" name="WEIGHT">
			<option value="">무게선택</option>
			<%int l =  61;%>
			<c:forEach var="weight" items="${WEIGHT}">
			<%if (k == 64) break;%>
			<option value="<%=l++ %>">${weight.CODENAME}</option>
			</c:forEach>
		</select>
		</label>
	</div>
	
	 <div class="form-group">
		<label>url: <input type="text" id="url" name="url"></label><br>
	 </div>
	 
		<input type="submit" class="btn btn-default" value="submit" id="insertUrl"
		accept-charset="utf-8" onsubmit="emulAcceptCharset(this)"/>
		</form>
	
	</div>
</center>
</body>
</html>