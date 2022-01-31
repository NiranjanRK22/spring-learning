package com.productapp.service;

import java.util.List;

import com.productapp.model.BrandView;
import com.productapp.model.NameView;
import com.productapp.model.PriceView;
import com.productapp.model.Product;
import com.productapp.model.ProductBrandDTO;
import com.productapp.model.ProductDetailsDTO;
import com.productapp.model.ProductExView;

public interface IProductService {
   Product addProduct(Product product);
 
   
   //projection
   List<ProductBrandDTO> findByProductName(String productName);
   
   List<ProductDetailsDTO> findByBrand(String brand);
   
   //pass the productname and get brand
   BrandView getByProductName(String productName);
   
   PriceView getByNameAndBrand(String productName, String brand);
   
   List<NameView> getByBrand(String brand);
   
   List<ProductExView> getProductDetails(String category);
}
