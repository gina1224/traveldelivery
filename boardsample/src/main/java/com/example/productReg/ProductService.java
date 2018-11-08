package com.example.productReg;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.productReg.ProductService;

public interface ProductService {
	//물품등록
	public String findCodeName(@Param("CODEID") int CODEID);
	public List<CODEDDomain> findAllfromNations();
	public List<CODEDDomain> findAlltoNations();
	public List<CODEDDomain> findAllSizes();
	public List<CODEDDomain> findAllWeights();
	
	public void insertProduct(ProductDomain product);
	public void deleteProduct(@Param("ID") int ID);

	//물품게시판
	public List<ProductDomain> listProduct();

	public ProductDomain detailProduct(@Param("ID") int ID);
}
