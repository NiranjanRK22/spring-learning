package com.productapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productapp.model.BrandView;
import com.productapp.model.NameView;
import com.productapp.model.PriceView;
import com.productapp.model.Product;
import com.productapp.model.ProductBrandDTO;
import com.productapp.model.ProductDetailsDTO;
import com.productapp.model.ProductExView;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer>{
    
	
	List<ProductBrandDTO> findByProductName(String productName);
	
	List<ProductDetailsDTO> findByBrand(String brand);
	
	//select brand from product where productname=?
	BrandView getByProductName(String productName);
	
	
	PriceView getByProductNameAndBrand(String productName, String brand);
	
	 List<NameView> getByBrand(String brand);
	 
	 
	 //select productname, price from product where category=?
	 List<ProductExView> findByCategory(String category);
}
