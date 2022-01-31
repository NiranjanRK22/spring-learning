package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.BiHotel;
import com.hotelapp.model.BiItem;
import com.hotelapp.model.Category;
import com.hotelapp.model.Type;
import com.hotelapp.service.IBiHotelService;
import com.hotelapp.service.IBiItemService;

@SpringBootApplication
public class SpringDatajpaOnetomanybiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanybiApplication.class, args);
	}
	
	IBiHotelService hotelService;
    
	IBiItemService itemService;
	
	/**
	 * @param itemService the itemService to set
	 */
	@Autowired
	public void setItemService(IBiItemService itemService) {
		this.itemService = itemService;
	}


	/**
	 * @param hotelService the hotelService to set
	 */
	@Autowired
	public void setHotelService(IBiHotelService hotelService) {
		this.hotelService = hotelService;
	}


	@Override
	public void run(String... args) throws Exception {
		BiItem item1 = new BiItem("bonda", Category.BREAKFAST, "SI", Type.VEG, 70);
		BiItem item2 = new BiItem("chilli chicken", Category.STARTERS, "NI", Type.NONVEG, 220);
		BiItem item3 = new BiItem("thumbs up", Category.BEVERAGES, "SI", Type.VEG, 50);
		Set<BiItem> itemList = new HashSet<BiItem> (Arrays.asList(item1, item2, item3));
		BiHotel hotel = new BiHotel("ohris", Type.NONVEG, "chennai", 4.5, itemList);
		//hotelService.addHotel(hotel);
		
		BiItem item4 = new BiItem("butter naan", Category.MAINCOURSE, "NI", Type.VEG, 50);
		BiItem item5 = new BiItem("baby corn", Category.STARTERS, "NI", Type.VEG, 180);
		BiItem item6 = new BiItem("fried rice", Category.FASTFOOD, "chinese", Type.VEG, 150);
		Set<BiItem> itemList1 = new HashSet<BiItem> (Arrays.asList(item4, item5, item6));
		BiHotel hotel1 = new BiHotel("udipi", Type.VEG, "chennai", 3.5, itemList1);
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
		
		itemService.getByHotel("udipi").forEach(System.out::println);
		
		itemService.getByHotelCategory("paradise", "STARTERS").forEach(System.out::println);
		
		itemService.getByCategory("BREAKFAST").forEach(System.out::println);
		
		itemService.getByCuisineAndCity("SI", "hyderabad").forEach(System.out::println);
		
		itemService.getByHotelItemType("taj", "VEG").forEach(System.out::println);
		
		
	}

}
