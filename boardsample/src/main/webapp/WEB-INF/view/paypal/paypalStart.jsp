<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html>
<head>
</head>
 <body> 
<form action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post" target="_top">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="UHHCEF5TLS7Y4">
아이디: <input type="text" name="custom" value="eliza1224@naver.com"><br/>
상품명: <input type="text" readonly name="item_name" value="item1"><br/>
수량: <input type="text" readonly name="quantity" value="10"><br/>
가격: <input type="text" readonly name="item_price" value="20000"><br/>
<input type="image" id="submit" src="https://www.sandbox.paypal.com/en_US/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal - The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.sandbox.paypal.com/en_US/i/scr/pixel.gif" width="1" height="1">


</form>


 </body>

</html>