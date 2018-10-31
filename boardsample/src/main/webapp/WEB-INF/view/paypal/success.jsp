<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>게시판</title>
</head>
<body>
Thank you for your payment.
 Your transaction has been completed, 
 and a receipt for your purchase has been emailed to you. 
 You may log into your account at www.paypal.com
  to view details of this transaction.

	<div class="container">
		<jsp:include page="../include/header.jsp" />
		<table class="table table-bordered">
			<thead>
				<tr>
					<th class="col-md-1">ID</th>
					<th class="col-md-7">USERID</th>
					<th class="col-md-2">ITEM_NAME</th>
					<th class="col-md-2">PAYAMOUNT</th>
					<th class="col-md-2">PAYFEE</th>
					<th class="col-md-2">PAYSTATUS</th>

					
				</tr>
			</thead>
			<tbody>
				<c:forEach var="payItem" items="${paypalList}">
					<tr>
						<td>${payItem.ID}</td>
						<td>${payItem.USERID}</td>
						<td>${payItem.ITEM_NAME}</td>
						<td>${payItem.PAYAMOUNT}</td>
						<td>${payItem.PAYFEE}</td>
						<td>${payItem.PAYSTATUS}</td>
						
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
