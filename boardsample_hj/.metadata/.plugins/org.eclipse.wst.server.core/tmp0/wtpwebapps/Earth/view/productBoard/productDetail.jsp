<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Detail</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
	<h2>상품 상세정보</h2>
	<table border="1">
		<tr>
			<td>
				<img src="${product.og_image}" width="340px" height="300px">
			</td>
			<td>
				<table border="1" style="height: 300px; width:400px;">
				<tr align="center">
					<td>제목</td>
					<td>${product.og_title}</td>
				</tr>
				<tr align="center">
					<td>상품명</td>
					<td>${product.pname}</td>
				</tr>
				<tr ailgn="center">
					<td>가격</td>
					<td><fmt:formatNumber value="${product.price}" pattern="###,###,###"/></td>
				</tr>
				<tr align="center">
					<td>개수</td>
					<td>${product.count}</td>
				</tr>
				<tr align="center">
					<td>크기</td>
					<td>${product.strSIZE}</td>
				</tr>
				<tr ailgn="center">
					<td>무게</td>
					<td>${product.strWEIGHT}</td>
				</tr>
				<tr align="center">
					<td>구매자 소속 국가</td>
					<td>${product.strFROM_NATION}</td>
				</tr>
				<tr align="center">
					<td>물품 구매 국가</td>
					<td>${product.strTO_NATION}</td>
				</tr>	
				<tr align="center">
					<td>물품 쇼핑몰 URL</td>
					<td>${product.og_url}</td>
				</tr>
				<tr align="center">
					<td>물품 쇼핑몰 가격</td>
					<td>${product.urlprice} ${product.currency}</td>
				</tr>
			</table>
			</td>
		</tr>
		<tr align="center">
			<td colspan="2">
				<form name="form1" method="post" action="../paypal/payment">
					<input type="hidden" name="ID" value="${product.ID}"/>
					<input type="submit" value="매칭신청"/>
				</form>
				<a href="list.do">Product List</a>
			</td>
		</tr>		
	</table>
</body>
</html>