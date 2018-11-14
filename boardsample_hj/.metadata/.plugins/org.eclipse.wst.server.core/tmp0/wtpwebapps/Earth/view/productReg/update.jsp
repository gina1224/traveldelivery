<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 

</head>
<body>
<center>
<h2>${product.pname}</h2>
<h5>개수: ${product.count}</h5>
<h5>가격: ${product.price}원</h5>
<h5>크기: ${product.strSIZE}</h5>
<h5>무게: ${product.strWEIGHT}</h5>
<h5>기존국가: ${product.strFROM_NATION}</h5>
<h5>구입국가: ${product.strTO_NATION }</h5>
<hr>
<h5>쇼핑몰 상품 정보:</h5>
${product.og_title}<br/>
<img src="${product.og_image}" width="500px" height="480px"/><br/>
${product.og_url}<br/>
${product.urlprice}원<br/>
${product.currency}<br/>
</center>
</body>

</html>