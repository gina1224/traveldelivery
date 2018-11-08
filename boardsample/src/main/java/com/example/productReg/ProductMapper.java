package com.example.productReg;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.productReg.ProductDomain;

@Mapper
public interface ProductMapper {
	
	
	@Select("SELECT * FROM td_CODED where GROUPID=1")
	public List<CODEDDomain> findAllfromNations();
	@Select("SELECT * FROM td_CODED where GROUPID=2")
	public List<CODEDDomain> findAlltoNations();
	@Select("SELECT * FROM td_CODED where GROUPID=3")
	public List<CODEDDomain> findAllSizes();
	@Select("SELECT * FROM td_CODED where GROUPID=4")
	public List<CODEDDomain> findAllWeights();

	@Select("SELECT CODENAME FROM td_CODED WHERE CODEID=#{CODEID}")
	public String findCodeName(@Param("CODEID") int CODEID);
	
	public void insertProduct(ProductDomain product);

	@Delete("DELETE FROM td_product where ID=#{ID}")
	public void deleteProduct(@Param("ID") int ID);

	public List<ProductDomain> listProduct();
	public ProductDomain detailProduct(@Param("ID") int ID);
}
