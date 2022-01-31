package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Type;

public interface IHotelRepository extends JpaRepository<Hotel, Integer>{
   List<Hotel> findByCity(String city, Sort sort);
   List<Hotel> findByRating(double rating);
   List<Hotel> findByType(String type);
   
   @Query("from Hotel h inner join h.itemList i where i.cuisine=?1")
   List<Hotel> findByCuisine(String cuisine);
   
   @Query("from Hotel h inner join h.itemList i where i.itemName like %?1%")
   List<Hotel> findByItemName(String itemname);
   
   @Query("from Hotel h inner join h.itemList i where i.itemName like %?1% and i.category=?2")
   List<Hotel> findByItemCategory(String itemName, Category category);
   
   @Query("from Hotel h inner join h.itemList i where i.category=?1")
   List<Hotel> findByCategory(Category category);
   
   @Query("from Hotel h inner join h.itemList i where i.cuisine=?1 and i.itemType=?2")
   List<Hotel> findByCuisineType(String cuisine, Type type);
   
   @Query("from Hotel h inner join h.itemList i where i.itemName like %?1% and i.price<?2")
   List<Hotel> findByItemNameLessPrice(String itemName, double price);
}
