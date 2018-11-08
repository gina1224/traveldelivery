package com.example.paypal;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
//import org.apache.ibatis.annotations.Update;

import com.example.paypal.PaypalDomain;

@Mapper
public interface PaypalMapper {
	
	@Select("SELECT * FROM td_paypal")
	public List<PaypalDomain> findAll();
	
	@Select("SELECT * FROM td_paypal WHERE USERID=#{USERID}")
	public List<PaypalDomain> findByUserID(@Param("USERID") String USERID);
	
	@Select("SELECT * FROM Paypal WHERE ID = #{ID}")
	public PaypalDomain findByID(@Param("ID") int ID);
	
	@Insert("INSERT INTO td_paypal(USERID, ITEM_NAME, PAYAMOUNT ,PAYFEE, PAYSTATUS) VALUES(#{USERID}, #{ITEM_NAME}, #{PAYAMOUNT} ,#{PAYFEE}, #{PAYSTATUS})")
	public void insert(PaypalDomain Paypal);
	
	//@Update("UPDATE Paypal SET contents=#{contents} where bno=#{bno}")
	//public void update(PaypalDomain Paypal);
	
	@Delete("DELETE FROM td_paypal where ID=#{ID}")
	public void delete(@Param("ID") int ID);

//	public List<PaypalDomain> findByID2(int ID);
}
