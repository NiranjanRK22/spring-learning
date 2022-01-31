package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.BiHotel;
import com.hotelapp.model.Category;
import com.hotelapp.model.Type;

@Repository
public interface IBiHotelRepository extends JpaRepository<BiHotel, Integer>{
   List<BiHotel> findByCity(String city, Sort sort);
   List<BiHotel> findByRating(double rating);
   List<BiHotel> findByType(String type);
   
   @Query("from BiHotel h inner join h.itemList i where i.cuisine=?1")
   List<BiHotel> findByCuisine(String cuisine);
   
   @Query("from BiHotel h inner join h.itemList i where i.itemName like %?1%")
   List<BiHotel> findByItemName(String itemname);
   
   @Query("from BiHotel h inner join h.itemList i where i.itemName like %?1% and i.category=?2")
   List<BiHotel> findByItemCategory(String itemName, Category category);
   
   @Query("from BiHotel h inner join h.itemList i where i.category=?1")
   List<BiHotel> findByCategory(Category category);
   
   @Query("from BiHotel h inner join h.itemList i where i.cuisine=?1 and i.itemType=?2")
   List<BiHotel> findByCuisineType(String cuisine, Type type);
   
   @Query("from BiHotel h inner join h.itemList i where i.itemName like %?1% and i.price<?2")
   List<BiHotel> findByItemNameLessPrice(String itemName, double price);
}
