package com.productapp.model;

import org.springframework.beans.factory.annotation.Value;

//open projections
//can have method name
public interface ProductExView {
    //pass the properties that you want to project
	//target refers to the entity
	@Value("#{target.productName + ' ' + target.price}")
	String getDetails();
}
