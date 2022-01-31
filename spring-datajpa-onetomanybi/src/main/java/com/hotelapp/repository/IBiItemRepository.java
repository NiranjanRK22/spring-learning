package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotelapp.model.BiHotel;
import com.hotelapp.model.BiItem;
import com.hotelapp.model.Category;
import com.hotelapp.model.Type;

public interface IBiItemRepository extends JpaRepository<BiItem, Integer>{
//	void addItem(BiHotel hotel, BiItem item);
//	void updateItem(BiHotel hotel, BiItem item);
//	void deleteItem(int itemId);
//	BiItem getById(int itemId);
	
	
	
	List<BiItem> getByHotelName(String hotelName);
	List<BiItem> getByCategory(Category category);
	
	//custom queries
	@Query("from BiItem bi inner join bi.hotel h where h.name=?1 and bi.category=?2")
	List<BiItem> getByHotelCategory(String hotelName, Category category);
	@Query("from BiItem bi inner join bi.hotel h where h.name=?1 and bi.itemType=?2")
	List<BiItem> getByHotelItemType(String hotelName, Type itemType);
	@Query("from BiItem bi inner join bi.hotel h where bi.cuisine=?1 and h.city=?2")
	List<BiItem> getByCuisineAndCity(String cuisine, String city);
	@Query("from BiItem bi inner join bi.hotel h where bi.itemName=?1 and h.rating=?2")
	List<BiItem> getByItemNameRating(String itemName, double rating);
}
