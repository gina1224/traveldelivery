<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Jumbotron Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css">

    <!-- Custom styles for this template -->
    <!-- <link href="jumbotron.css" rel="stylesheet"> -->

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <!-- <script src="../../assets/js/ie-emulation-modes-warning.js"></script> -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
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

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
      
	        <h1>product read</h1>
	        <p>This is a template for a simple marketing or informational website. It includes a large callout called a jumbotron and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
	        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more &raquo;</a></p>
	      </div>
    	</div>

    <div class="container">
    
	      <div class="row">
		        <div class="col-md-4">
		        1234
		        </div>
	       </div>
       
	      <div class="row">
	        <div class="col-md-8">
				<form method="post" name="form2" action="/update">
				
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
				<label>크기:<select id="SIZE" name="SIZE" class="form-control">
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
			 
				<input type="submit" class="btn btn-warning btn-lg" value="submit" id="insertUrl"
				accept-charset="utf-8" onsubmit="emulAcceptCharset(this)"/>
				</form>
	
        </div>
       </div>

      <hr>

      <footer>
        <p>&copy; Company 2014</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="<c:url value='bootstrap/js/bootstrap.min.js' />" />
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <!-- <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
  </body>
</html>