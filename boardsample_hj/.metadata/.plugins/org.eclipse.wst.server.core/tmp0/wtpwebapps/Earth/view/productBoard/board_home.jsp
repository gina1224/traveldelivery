<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="../include/header.jsp" %>
<title>Product List</title>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<%int count = 0; %>
<table border="1">
	<tr>
		<th>상품 ID 번호</th>
		<th>상품 이미지</th>
		<th>상품명</th>
		<th>가격</th>
		<th>구매자 소속 국가</th>
		<th>물품 구매 국가</th>
	</tr>
	<c:forEach var="product" items="${list}">
	<tr>
		<td>
			${product.ID}
		</td>
		<td>
			<a href="detail/${product.ID}">
				<img src="${product.og_image}" width="400px" height="380px">
			</a>
		</td>
		<td>
			<a href="detail/${product.ID}">
				${product.pname}
			</a>
		</td>
		<td>
			<fmt:formatNumber value="${product.price}" pattern="###,###,###"/>
		</td>
		<td>
			${product.strFROM_NATION}
		</td>
		<td>
			${product.strTO_NATION} 
		</td>	
	</tr>
	</c:forEach>
</table>

</body>
</html>