package com.example.paypal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paypal.PaypalMapper;
import com.example.paypal.PaypalDomain;
import com.example.paypal.PaypalService;

@Service
public class PaypalServiceImpl implements PaypalService{

	
	@Autowired
	PaypalMapper PaypalMapper;
		
	@Override
	public List<PaypalDomain> findAll() {
		return PaypalMapper.findAll();
	}

	@Override
	public List<PaypalDomain> findByUserID(String UserID) {
		return PaypalMapper.findByUserID(UserID);
	}
		
	@Override
	public PaypalDomain findByID(int ID) {
		return PaypalMapper.findByID(ID);
	}

	@Override
	public void insert(PaypalDomain Paypal) {
		PaypalMapper.insert(Paypal);
	}
/*
	@Override
	public void update(PaypalDomain td_paypal) {
		PaypalMapper.update(td_paypal);
	}
*/
	@Override
	public void delete(int ID) {
		PaypalMapper.delete(ID);
	}


	
}
