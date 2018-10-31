package com.example.paypal;


public class PaypalDomain {
	private int ID;
	private String USERID;
	private String ITEM_NAME;
	private double PAYAMOUNT;
	private double PAYFEE;
	private String PAYSTATUS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUSERID() {
		return USERID;
	}
	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}
	public String getITEM_NAME() {
		return ITEM_NAME;
	}
	public void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}
	public double getPAYAMOUNT() {
		return PAYAMOUNT;
	}
	public void setPAYAMOUNT(double pAYAMOUNT) {
		PAYAMOUNT = pAYAMOUNT;
	}
	public double getPAYFEE() {
		return PAYFEE;
	}
	public void setPAYFEE(double pAYFEE) {
		PAYFEE = pAYFEE;
	}
	public String getPAYSTATUS() {
		return PAYSTATUS;
	}
	public void setPAYSTATUS(String pAYSTATUS) {
		PAYSTATUS = pAYSTATUS;
	}
	@Override
	public String toString() {
		return "PaypalDomain [ID=" + ID + ", USERID=" + USERID + ", ITEM_NAME=" + ITEM_NAME + ", PAYAMOUNT=" + PAYAMOUNT
				+ ", PAYFEE=" + PAYFEE + ", PAYSTATUS=" + PAYSTATUS + "]";
	}

}