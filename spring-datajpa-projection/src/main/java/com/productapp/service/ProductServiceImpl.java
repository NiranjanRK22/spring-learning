package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.model.BrandView;
import com.productapp.model.NameView;
import com.productapp.model.PriceView;
import com.productapp.model.Product;
import com.productapp.model.ProductBrandDTO;
import com.productapp.model.ProductDetailsDTO;
import com.productapp.model.ProductExView;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	
	IProductRepository productRepository;
	
	@Autowired
	public void setProductRepository(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	

	@Override
	public List<ProductBrandDTO> findByProductName(String productName) {
		// TODO Auto-generated method stub
		return productRepository.findByProductName(productName);
	}

	@Override
	public List<ProductDetailsDTO> findByBrand(String brand) {
		// TODO Auto-generated method stub
		return productRepository.findByBrand(brand);
	}

	@Override
	public BrandView getByProductName(String productName) {
		return productRepository.getByProductName(productName);
	}

	@Override
	public PriceView getByNameAndBrand(String productName, String brand) {
		// TODO Auto-generated method stub
		return productRepository.getByProductNameAndBrand(productName, brand);
	}

	@Override
	public List<NameView> getByBrand(String brand) {
		// TODO Auto-generated method stub
		return productRepository.getByBrand(brand);
	}

	@Override
	public List<ProductExView> getProductDetails(String category) {
		// TODO Auto-generated method stub
		return productRepository.findByCategory(category);
	}

}
