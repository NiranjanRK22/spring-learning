package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;
import com.hotelapp.model.Type;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}
    
	IHotelService hotelService;
	
	@Autowired
	public void setHotelService(IHotelService hotelService) {
		this.hotelService = hotelService;
	}


	@Override
	public void run(String... args) throws Exception {
		Item item1 = new Item("puri", Category.BREAKFAST, "SI", Type.VEG, 100);
		Item item2 = new Item("veg manchuria", Category.STARTERS, "NI", Type.VEG, 180);
		Item item3 = new Item("sprite", Category.BEVERAGES, "SI", Type.VEG, 50);
		Set<Item> itemList = new HashSet<Item> (Arrays.asList(item1, item2, item3));
		Hotel hotel = new Hotel("taj", Type.VEG, "hyderabad", 4.8, itemList);
		//hotelService.addHotel(hotel);
		
		Item item4 = new Item("wada", Category.BREAKFAST, "SI", Type.VEG, 70);
		Item item5 = new Item("chilli chicken", Category.STARTERS, "NI", Type.NONVEG, 220);
		Item item6 = new Item("noodles", Category.FASTFOOD, "chinese", Type.NONVEG, 150);
		Set<Item> itemList1 = new HashSet<Item> (Arrays.asList(item4, item5, item6));
		Hotel hotel1 = new Hotel("machi baphe", Type.NONVEG, "bangalore", 3.8, itemList1);
		//hotelService.addHotel(hotel1);
		
		hotelService.getAll().forEach(System.out::println);
		System.out.println();
		hotelService.getByItemName("dosa").forEach((nhotel) -> {
			System.out.println(nhotel.getName());
			System.out.println(nhotel.getItemList());
			System.out.println(nhotel.getType());
		});
		System.out.println();
		hotelService.getByItemNameCategory("noodles", "FASTFOOD").forEach(System.out::println);
		
		System.out.println();
		hotelService.getByCuisine("SI").forEach((nhotel) -> {
			System.out.println(nhotel.getName());
			System.out.println(nhotel.getItemList());
			System.out.println(nhotel.getType());
		});
		
		System.out.println();
		hotelService.getByCategory("STARTERS").forEach((nhotel) -> {
			System.out.println(nhotel.getName());
			System.out.println(nhotel.getItemList());
			System.out.println(nhotel.getType());
		});
		
		System.out.println();
		hotelService.getByCuisineAndType("NI", "VEG").forEach((nhotel) -> {
			System.out.println(nhotel.getName());
			System.out.println(nhotel.getItemList());
			System.out.println(nhotel.getType());
		});
		
		System.out.println();
		hotelService.getByItemNameLessPrice("idli", 200).forEach((nhotel) -> {
			System.out.println(nhotel.getName());
			System.out.println(nhotel.getItemList());
			System.out.println(nhotel.getType());
		});
	}

}
