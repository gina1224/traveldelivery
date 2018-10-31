package com.example.paypal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller //현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
@RequestMapping("/paypal")
public class VerifyPaymentByPayPal {

	private Logger logger = LoggerFactory.getLogger(getClass());
	 private static String URL_PAYPAL_VALIDATE; // PDT데이터를 페이팔로 보낼 서버주소
	 // PDT 첫번째 응답 변수 선
@Inject
PaypalService paypalService;


	 private static final String PARAM_TX = "tx";

	 private static final String PARAM_CMD = "cmd";

	 private static final String PARAM_CMD_VALUE = "_notify-synch";

	 private static final String PARAM_AT = "at";

	 private static String PARAM_AT_VALUE;



	 private static final String RESPONSE_SUCCESS = "SUCCESS";

	 private static final String RESPONSE_FAIL = "FAIL";



	 static

	 {

	  URL_PAYPAL_VALIDATE = "https://www.sandbox.paypal.com/cgi-bin/webscr";

	  PARAM_AT_VALUE = "smG_4uJpoJF8YLavUMePGLyZiPwEvSGQw7VJ4G_QCf5PWrcsoBsjiN06Io4";

	 }

	 

	 private static final String PARAM_ITEM_NAME = "item_name";    // 상품이름
	 
	 private static final String PARAM_QUANTITY = "quantity";   // 상품번호

	 private static final String PARAM_PAYMENT_STATUS = "payment_status";       // 결제 상태

	 private static final String PARAM_MC_GROSS = "mc_gross";    // 페이팔 결제금액

	 private static final String PARAM_MC_FEE = "mc_fee";     // 페이팔 수수료금액

	 private static final String PARAM_MC_CURRENCY = "mc_currency";   // 화폐

	 private static final String PARAM_TXN_ID = "txn_id";     // 거래번호

	 private static final String PARAM_RECEIVER_EMAIL = "receiver_email";       // 페이팔 판매자계정 이메일 

	 private static final String PARAM_PAYER_EMAIL = "payer_email";   // 페이팔 구매자계정 이메일

	 private static final String PARAM_CUSTOM = "custom";     // 상점회원번호

	 
		// 새 글 올리기
		public void create(PaypalDomain td_paypal) throws Exception{
			logger.info("POST /td_paypal : " + td_paypal.toString());
			paypalService.insert(td_paypal);
		}	 
		
		
		// 전체 보기
		public ModelAndView list() throws Exception{
			List<PaypalDomain> paypalList = paypalService.findAll();
			ModelAndView nextPage = new ModelAndView("paypal/success");
			nextPage.addObject("paypalList", paypalList);
			return nextPage;
		}
	 /** 페이팔 결제 PDT정보 핸들링  */
	 @RequestMapping("/success")
	 public ModelAndView handleRequestPDT(HttpServletRequest request) throws Exception {
		 PaypalDomain paypalD = new PaypalDomain();
	 

	  // PayPal로부터온 파라미터를 표시한다.

	  Enumeration en = request.getParameterNames();

	  String readString = "";

	  while (en.hasMoreElements()) {

	   String paramName = (String) en.nextElement();

	   String paramValue = request.getParameter(paramName);

	   readString = readString + "&" + paramName + "=" + URLDecoder.decode(paramValue, "UTF-8");

	  }

	  logger.info("Received PDT from PayPal:" + readString);

	  

	  // 다시 PayPal로 게시하기 위해 파라미터를 구성한다.

	  String str = PARAM_CMD + "=" + PARAM_CMD_VALUE;

	  en = request.getParameterNames();

	  while (en.hasMoreElements()) {

	   String paramName = (String) en.nextElement();

	   String paramValue = request.getParameter(paramName);

	   str = str + "&" + paramName + "=" + URLEncoder.encode(paramValue, "UTF-8");

	  }

	  str = str + "&" + PARAM_AT + "=" + PARAM_AT_VALUE;

	  logger.info("Sending PDT to PayPal:" + str);



	  // 유효성을 검사하기 위해 PayPal로 다시 전송시작.

	  URL u = new URL(URL_PAYPAL_VALIDATE);

	  HttpURLConnection uc = (HttpURLConnection) u.openConnection();

	  uc.setDoOutput(true);

	  uc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

	  PrintWriter pw = new PrintWriter(uc.getOutputStream());

	  pw.println(str);

	  pw.close();



	  BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

	  String res = in.readLine();

	  



	  if (res.equals(RESPONSE_SUCCESS)) {

	   

	   logger.info("페이팔서버로 부터 PDT유효성 요청이 성공했습니다.");

	   

	   String[] temp = new String[2];

	   HashMap vars = new HashMap();

	   while ((res = in.readLine()) != null) {
		logger.info(res);
	    temp = res.split("=");
	    if (temp.length == 2) {
	     vars.put(temp[0], URLDecoder.decode(temp[1], "UTF-8"));

	    } else {
	     vars.put(temp[0], "");
	    }
	    //logger.info("{}{}{}",new Object[]{temp[0],":",temp[1]});

	   }
	   //logger.info(vars);

	   String itemName = (String) vars.get(PARAM_ITEM_NAME);

	   paypalD.setITEM_NAME(itemName);
	   int quantity = Integer.parseInt((String) vars.get(PARAM_QUANTITY));
	   
	   String paymentStatus = (String) vars.get(PARAM_PAYMENT_STATUS);
	   paypalD.setPAYSTATUS(paymentStatus);
	   double paymentAmount = Double.parseDouble((String) vars.get(PARAM_MC_GROSS));
	   paypalD.setPAYAMOUNT(paymentAmount);
	   double paymentFee = Double.parseDouble((String) vars.get(PARAM_MC_FEE));
	   paypalD.setPAYFEE(paymentFee);
	   String paymentCurrency = (String) vars.get(PARAM_MC_CURRENCY);
	   String txnId = (String) vars.get(PARAM_TXN_ID);
	   String receiverEmail = (String) vars.get(PARAM_RECEIVER_EMAIL);
	   String payerEmail = (String) vars.get(PARAM_PAYER_EMAIL);
	   //int userseq = Integer.parseInt((String) vars.get(PARAM_CUSTOM));
	   String userid = (String) vars.get(PARAM_CUSTOM);
	   paypalD.setUSERID(userid);
	 /*  logger.info("paymentStatus", paymentStatus);
	   logger.info("paymentAmount", paymentAmount);
	   logger.info("paymentFee", paymentFee);
	   logger.info("userid", userid);
*/	
	   if(paypalD != null){
		   logger.info("paypalD not NULL");
	   }
	   else
		   logger.info("paypalD NULL");
	   create(paypalD);
	   logger.info("itemName"+itemName);
	   logger.info("quantity"+String.valueOf(quantity));

	   logger.info("paymentStatus"+paymentStatus);
	//   logger.info(paymentAmount);
	 //  logger.info(paymentFee);
	   logger.info("userid"+userid);


	  } else if (res.equals(RESPONSE_FAIL)) {

	   logger.warn("페이팔서버로 부터 PDT유효성 요청이 실패했습니다. 상태:"+res);

	  } else {

	   logger.error("페이팔서버로 부터 PDT유효성 요청이 실패했습니다. 상태:"+res);

	  }

	return list();
	 }
	 
	
	 

}
