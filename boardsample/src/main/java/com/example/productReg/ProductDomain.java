package com.example.productReg;

public class ProductDomain {
	private int ID;
	private String pname;
	private int count;
	private double price;
	private int size;
	private int weight;
	private int from_nation;
	private int to_nation;
	
	private String image;
	private String strSIZE;
	private String strWEIGHT;
	private String strFROM_NATION;
	private String strTO_NATION;
	
	public String getStrSIZE() {
		return strSIZE;
	}
	public void setStrSIZE(String strSIZE) {
		this.strSIZE = strSIZE;
	}
	public String getStrWEIGHT() {
		return strWEIGHT;
	}
	public void setStrWEIGHT(String strWEIGHT) {
		this.strWEIGHT = strWEIGHT;
	}
	public String getStrFROM_NATION() {
		return strFROM_NATION;
	}
	public void setStrFROM_NATION(String strFROM_NATION) {
		this.strFROM_NATION = strFROM_NATION;
	}
	public String getStrTO_NATION() {
		return strTO_NATION;
	}
	public void setStrTO_NATION(String strTO_NATION) {
		this.strTO_NATION = strTO_NATION;
	}
	public String getUrlprice() {
		return urlprice;
	}
	public void setUrlprice(String urlprice) {
		this.urlprice = urlprice;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getFrom_nation() {
		return from_nation;
	}
	public void setFrom_nation(int from_nation) {
		this.from_nation = from_nation;
	}
	public int getTo_nation() {
		return to_nation;
	}
	public void setTo_nation(int to_nation) {
		this.to_nation = to_nation;
	}

	
	private String url;
	private String og_title;
	private String og_url;
	private String og_image;
	private String urlprice;
	private String currency;
	public String getOg_title() {
		return og_title;
	}
	public void setOg_title(String og_title) {
		this.og_title = og_title;
	}
	public String getOg_url() {
		return og_url;
	}
	public void setOg_url(String og_url) {
		this.og_url = og_url;
	}
	public String getOg_image() {
		return og_image;
	}
	public void setOg_image(String og_image) {
		this.og_image = og_image;
	}
	public String geturlPrice() {
		return urlprice;
	}
	public void seturlPrice(String urlprice) {
		this.urlprice = urlprice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "ProductDomain [ID=" + ID + ", pname=" + pname + ", count=" + count + ", price=" + price + ", size="
				+ size + ", weight=" + weight + ", from_nation=" + from_nation + ", to_nation=" + to_nation + ", image="
				+ image + ", strSIZE=" + strSIZE + ", strWEIGHT=" + strWEIGHT + ", strFROM_NATION=" + strFROM_NATION
				+ ", strTO_NATION=" + strTO_NATION + ", url=" + url + ", og_title=" + og_title + ", og_url=" + og_url
				+ ", og_image=" + og_image + ", urlprice=" + urlprice + ", currency=" + currency + "]";
	}
	
	
}
