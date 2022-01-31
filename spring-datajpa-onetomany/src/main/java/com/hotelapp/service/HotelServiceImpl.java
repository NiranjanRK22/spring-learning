package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Type;
import com.hotelapp.repository.IHotelRepository;
@Service
public class HotelServiceImpl implements IHotelService {
     
	IHotelRepository hotelRepository;
	
	@Autowired
	public void setHotelRepository(IHotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);

	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepository.deleteById(hotelId);

	}

	@Override
	public List<Hotel> getAll() {
		//Sort sort = Sort.by("name");
		return hotelRepository.findAll(Sort.by("name"));
	}

	@Override
	public Hotel getById(int hotelId) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(hotelId).get();
	}

	@Override
	public List<Hotel> getByCity(String city) {
		return hotelRepository.findByCity(city, Sort.by(Direction.DESC, "rating"));
	}

	@Override
	public List<Hotel> getByType(String type) {
		
		return hotelRepository.findByType(type);
	}

	@Override
	public List<Hotel> getByRating(double rating) {
		// TODO Auto-generated method stub
		return hotelRepository.findByRating(rating);
	}

	@Override
	public List<Hotel> getByItemName(String itemName) {
		return hotelRepository.findByItemName(itemName);
	}

	@Override
	public List<Hotel> getByItemNameCategory(String itemName, String category) {
		return hotelRepository.findByItemCategory(itemName, Category.valueOf(category));
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		return hotelRepository.findByCuisine(cuisine);
	}

	@Override
	public List<Hotel> getByCategory(String category) {
		// TODO Auto-generated method stub
		return hotelRepository.findByCategory(Category.valueOf(category));
	}

	@Override
	public List<Hotel> getByCuisineAndType(String cuisine, String type) {
		// TODO Auto-generated method stub
		return hotelRepository.findByCuisineType(cuisine, Type.valueOf(type));
	}

	@Override
	public List<Hotel> getByItemNameLessPrice(String itemName, double price) {
		// TODO Auto-generated method stub
		return hotelRepository.findByItemNameLessPrice(itemName, price);
	}

}
