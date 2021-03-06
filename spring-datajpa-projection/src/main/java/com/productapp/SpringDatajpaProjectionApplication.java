package com.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.BrandView;
import com.productapp.model.NameView;
import com.productapp.model.PriceView;
import com.productapp.service.IProductService;



@SpringBootApplication
public class SpringDatajpaProjectionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaProjectionApplication.class, args);
	}
	
	IProductService productService;
	
	
    @Autowired
	public void setProductService(IProductService productService) {
		this.productService = productService;
	}



	@Override
	public void run(String... args) throws Exception {
		//productService.addProduct(new Product("headphones", 1200, "boat", "electronics"));
//		productService.addProduct(new Product("book", 50, "classmate", "stationery"));
//		productService.addProduct(new Product("corn flakes", 100, "kellogs", "grocery"));
		
		productService.findByBrand("samsung").forEach((product) -> {
			System.out.println(product.getProductName() + "\t" + product.getPrice());
		});
		productService.findByProductName("mouse").forEach((product) -> {
			System.out.println(product.getBrand() + "\t" + product.getCategory());
		});
		
		BrandView view1 = productService.getByProductName("mobile");
		System.out.println("Brand for mobile is " +view1.getBrand());
		
		PriceView view2  = productService.getByNameAndBrand("pen", "apsara");
		System.out.println(view2.getPrice());
		
		List<NameView> nviewList= productService.getByBrand("apsara");
		nviewList.forEach((product) -> {
			System.out.println(product.getProductName());
		});
		
		productService.getProductDetails("electronics").forEach((product) -> {
			System.out.println(product.getDetails());
		});
	}

}
