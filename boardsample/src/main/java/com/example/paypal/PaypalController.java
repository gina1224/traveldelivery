package com.example.paypal;

import javax.inject.Inject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.paypal.PaypalDomain;

@RequestMapping("/paypal")
@Controller //현재 클래스를 스프링에서 관리하는 컨트롤러 bean으로 생성
public class PaypalController {
	//로깅을 위한 변수
	private static final Logger logger = LoggerFactory.getLogger(PaypalController.class);
	
	@Inject
	PaypalService paypalService;
	

	//01.로그인 화면
	@RequestMapping("/payment")
	public String pay(){
		
		return "paypal/paypalStart";
	}
	

	

//	@RequestMapping("success")
//	public String paySuccess(){
//		return "paypal/success";
//	}
	// 글 상세보기
	/*
		@GetMapping("/paypal/{UserID}")
		public ModelAndView readOne(@PathVariable("UserID") String UserID) throws Exception{
			List<PaypalDomain> paypalList = paypalService.findByUserID(UserID);
			ModelAndView nextPage = new ModelAndView("paypal/success");
			nextPage.addObject("paypalList", paypalList);
			return nextPage;
		}
*/
	// TEST
	@GetMapping("/test")
	public ModelAndView readTest() throws Exception{
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		PaypalDomain paypalItem = paypalService.findByID(1);
		ModelAndView nextPage = new ModelAndView("paypal/success");
		nextPage.addObject("paypalItem", paypalItem);
		return nextPage;
	}
	
		
}