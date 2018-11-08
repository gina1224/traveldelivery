package com.example.productReg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productReg.ProductMapper;
import com.example.productReg.ProductDomain;
import com.example.productReg.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	ProductMapper productMapper;
		
	
	
	@Override
	public List<CODEDDomain> findAllfromNations() {
		// TODO Auto-generated method stub
		return productMapper.findAllfromNations();
	}

	@Override
	public List<CODEDDomain> findAlltoNations() {
		// TODO Auto-generated method stub
		return productMapper.findAlltoNations();
	}

	@Override
	public List<CODEDDomain> findAllSizes() {
		// TODO Auto-generated method stub
		return productMapper.findAllSizes();
	}

	@Override
	public List<CODEDDomain> findAllWeights() {
		// TODO Auto-generated method stub
		return productMapper.findAllWeights();
	}

	@Override
	public void insertProduct(ProductDomain prod) {
		// TODO Auto-generated method stub
		productMapper.insertProduct(prod);
	}

	@Override
	public void deleteProduct(int ID) {
		// TODO Auto-generated method stub
		productMapper.deleteProduct(ID);
	}

	@Override
	public String findCodeName(int CODEID) {
		return productMapper.findCodeName(CODEID);
	}

	@Override
	public List<ProductDomain> listProduct() {
		return productMapper.listProduct();
	}

	@Override
	public ProductDomain detailProduct(int ID) {
		// TODO Auto-generated method stub
		return productMapper.detailProduct(ID);
	}

	
	
	
	
	
	
	
	
}
