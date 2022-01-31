package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.BiHotel;
import com.hotelapp.model.BiItem;

public interface IBiItemService {
    
	void addItem(BiHotel hotel, BiItem item);
	void updateItem(BiHotel hotel, BiItem item);
	void deleteItem(int itemId);
	BiItem getById(int itemId);
	
	//custom queries
	
	List<BiItem> getByHotel(String hotelName);
	List<BiItem> getByCategory(String category);
	List<BiItem> getByHotelCategory(String hotelName, String category);
	
	List<BiItem> getByHotelItemType(String hotelName, String itemType);
	List<BiItem> getByCuisineAndCity(String cuisine, String city);
	List<BiItem> getByItemNameRating(String itemName, double rating);
}
