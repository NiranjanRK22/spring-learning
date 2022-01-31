package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.hotelapp.model.BiHotel;
import com.hotelapp.model.Category;
import com.hotelapp.model.Type;
import com.hotelapp.repository.IBiHotelRepository;

@Service
public class BiHotelServiceImpl implements IBiHotelService {
     
	IBiHotelRepository hotelRepository;
	
	@Autowired
	public void setHotelRepository(IBiHotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public BiHotel addHotel(BiHotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

	@Override
	public void updateHotel(BiHotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);

	}

	@Override
	public List<BiHotel> getAll() {
		//Sort sort = Sort.by("name");
		return hotelRepository.findAll(Sort.by("name"));
	}

	@Override
	public BiHotel getById(int hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public List<BiHotel> getByCity(String city) {
		return hotelRepository.findByCity(city, Sort.by(Direction.DESC, "rating"));
	}

	@Override
	public List<BiHotel> getByType(String type) {
		
		return hotelRepository.findByType(type);
	}

	@Override
	public List<BiHotel> getByRating(double rating) {
		// TODO Auto-generated method stub
		return hotelRepository.findByRating(rating);
	}

	@Override
	public List<BiHotel> getByItemName(String itemName) {
		return hotelRepository.findByItemName(itemName);
	}

	@Override
	public List<BiHotel> getByItemNameCategory(String itemName, String category) {
		return hotelRepository.findByItemCategory(itemName, Category.valueOf(category));
	}

	@Override
	public List<BiHotel> getByCuisine(String cuisine) {
		return hotelRepository.findByCuisine(cuisine);
	}

	@Override
	public List<BiHotel> getByCategory(String category) {
		// TODO Auto-generated method stub
		return hotelRepository.findByCategory(Category.valueOf(category));
	}

	@Override
	public List<BiHotel> getByCuisineAndType(String cuisine, String type) {
		// TODO Auto-generated method stub
		return hotelRepository.findByCuisineType(cuisine, Type.valueOf(type));
	}

	@Override
	public List<BiHotel> getByItemNameLessPrice(String itemName, double price) {
		// TODO Auto-generated method stub
		return hotelRepository.findByItemNameLessPrice(itemName, price);
	}

	

}
