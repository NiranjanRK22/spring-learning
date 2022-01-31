package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.BiHotel;
import com.hotelapp.model.BiItem;
import com.hotelapp.model.Category;
import com.hotelapp.model.Type;
import com.hotelapp.repository.IBiItemRepository;

@Service
public class BiItemServiceImpl implements IBiItemService{
    
	private IBiItemRepository itemRepository;
	
	
	/**
	 * @param itemRepository the itemRepository to set
	 */
	@Autowired
	public void setItemRepository(IBiItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}

	@Override
	public void addItem(BiHotel hotel, BiItem item) {
		
	}

	@Override
	public void updateItem(BiHotel hotel, BiItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteItem(int itemId) {
		itemRepository.deleteById(itemId);
		
	}

	@Override
	public BiItem getById(int itemId) {
		// TODO Auto-generated method stub
		return itemRepository.getById(itemId);
	}

	@Override
	public List<BiItem> getByHotel(String hotelName) {
		// TODO Auto-generated method stub
		return itemRepository.getByHotelName(hotelName);
	}

	@Override
	public List<BiItem> getByCategory(String category) {
		// TODO Auto-generated method stub
		return itemRepository.getByCategory(Category.valueOf(category));
	}

	@Override
	public List<BiItem> getByHotelCategory(String hotelName, String category) {
		// TODO Auto-generated method stub
		return itemRepository.getByHotelCategory(hotelName, Category.valueOf(category));
	}

	@Override
	public List<BiItem> getByHotelItemType(String hotelName, String itemType) {
		// TODO Auto-generated method stub
		return itemRepository.getByHotelItemType(hotelName, Type.valueOf(itemType));
	}

	@Override
	public List<BiItem> getByCuisineAndCity(String cuisine, String city) {
		// TODO Auto-generated method stub
		return itemRepository.getByCuisineAndCity(cuisine, city);
	}

	@Override
	public List<BiItem> getByItemNameRating(String itemName, double rating) {
		// TODO Auto-generated method stub
		return itemRepository.getByItemNameRating(itemName, rating);
	}

}
