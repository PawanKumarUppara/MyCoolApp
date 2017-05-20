package com.hellospring.dao;

import java.util.ArrayList;
import java.util.List;

import com.hellospring.model.Product;

public class ProductDao {
	private List<Product> productList;

	public List<Product> getProductList() {
		Product product1 = new Product();
		product1.setProductName("guitar1");
		product1.setProductCategory("instrument");
		product1.setProductDescription("this is a fanda guitar");
		product1.setProductPrice(200);
		product1.setProductCondition("new");
		product1.setProductStatus("Active");
		product1.setUnitInStock(11);
		product1.setProductManufacturer("fender");
		
		Product product2 = new Product();
		product2.setProductName("guitar2");
		product2.setProductCategory("instrument");
		product2.setProductDescription("this is a fanda guitar");
		product2.setProductPrice(200);
		product2.setProductCondition("new");
		product2.setProductStatus("Active");
		product2.setUnitInStock(11);
		product2.setProductManufacturer("fender");
		
		productList=new ArrayList<Product>();
		productList.add(product1);
		productList.add(product2);
		return productList;

	}
}
