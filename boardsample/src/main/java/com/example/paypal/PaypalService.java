package com.example.paypal;

import java.util.List;

import com.example.paypal.PaypalDomain;

public interface PaypalService {

	public List<PaypalDomain> findAll();
	public List<PaypalDomain> findByUserID(String UserID);
	public PaypalDomain findByID(int ID);
	public void insert(PaypalDomain td_paypal);
//	public void update(PaypalDomain td_paypal);
	public void delete(int ID);

}
