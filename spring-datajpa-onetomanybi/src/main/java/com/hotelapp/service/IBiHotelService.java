package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.BiHotel;

public interface IBiHotelService {
	
     BiHotel addHotel(BiHotel hotel);
     void updateHotel(BiHotel hotel);
     void deleteHotel(int hotelId);
     
     List<BiHotel> getAll();
     BiHotel getById(int hotelId);
     
     List<BiHotel> getByCity(String city);
     List<BiHotel> getByType(String type);
     List<BiHotel> getByRating(double rating);
     
    List<BiHotel> getByItemName(String itemName);
 	List<BiHotel> getByItemNameCategory(String itemName, String category);
 	List<BiHotel> getByCuisine(String cuisine);
 	List<BiHotel> getByCategory(String category);
 	List<BiHotel> getByCuisineAndType(String cuisine, String type);
 	List<BiHotel> getByItemNameLessPrice(String itemName, double price);
     
     
     
}
