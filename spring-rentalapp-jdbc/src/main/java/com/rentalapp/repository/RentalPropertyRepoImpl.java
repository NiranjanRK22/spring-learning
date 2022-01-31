package com.rentalapp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rentalapp.exception.PropertyNotFoundException;
import com.rentalapp.model.RentalProperty;

@Repository
public class RentalPropertyRepoImpl implements IRentalPropertyRepository {
   
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public RentalPropertyRepoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addRentalProperty(RentalProperty rentalProperty) {
		String insertQuery = "insert into rentalproperty values(?,?,?,?,?,?,?,?,?,?)";
		Object[] property = {rentalProperty.getPropertyId(), rentalProperty.getName(), rentalProperty.getType(), rentalProperty.getCategory(),
		    	  rentalProperty.getBedrooms(), rentalProperty.getArea(), rentalProperty.getRentExpected(), rentalProperty.getLocation(), rentalProperty.getCity(), rentalProperty.getSecurityDeposit()	
		 };
		jdbcTemplate.update(insertQuery, property);

	}

	@Override
	public void updateRentalProperty(int propertyId, double expectedRent) {
		String updateQuery = "update rentalproperty set rentexpected=? where propertyid=?";
		//Object[] propertyArray = {expectedRent, propertyId};
		jdbcTemplate.update(updateQuery, expectedRent, propertyId);

	}

	@Override
	public void deleteRentalProperty(int propertyId) {
		String deleteQuery = "delete from rentalproperty where propertyid=?";
		jdbcTemplate.update(deleteQuery, propertyId);

	}

	@Override
	public RentalProperty findById(int propertyId) throws PropertyNotFoundException {
		String selectQuery = "select * from rentalProperty where propertyid=?";
		RentalProperty property = jdbcTemplate.queryForObject(selectQuery, new RentalPropertyMapper(),propertyId);
		if (property==null)
			throw new PropertyNotFoundException("invalid id");
		return property;
	}

	@Override
	public List<RentalProperty> findByCategory(String category) throws PropertyNotFoundException {
		String selectQuery = "select * from rentalProperty where category=?";
		List<RentalProperty> rentalPropertyList = 	jdbcTemplate.query(selectQuery, new RentalPropertyMapper(), category);		
		if (rentalPropertyList.isEmpty()) 
			throw new PropertyNotFoundException("category not found");
		return rentalPropertyList;
	}

	@Override
	public List<RentalProperty> findByType(String type) throws PropertyNotFoundException {
		String selectQuery = "select * from rentalProperty where type=?";
		List<RentalProperty> rentalPropertyList = 	jdbcTemplate.query(selectQuery, new RentalPropertyMapper(), type);		
		if (rentalPropertyList.isEmpty()) 
			throw new PropertyNotFoundException("type not found");
		return rentalPropertyList;
	}

	@Override
	public List<RentalProperty> findByRentRange(double start, double end) throws PropertyNotFoundException {
		String selectQuery = "select * from rentalProperty where rentexpected between ? and ?";
		List<RentalProperty> rentalPropertyList = 	jdbcTemplate.query(selectQuery, new RentalPropertyMapper(), start, end);		
		if (rentalPropertyList.isEmpty()) 
			throw new PropertyNotFoundException("property within this range is not found");
		return rentalPropertyList;
	}

	@Override
	public List<RentalProperty> findByLesserDeposit(double deposit) throws PropertyNotFoundException {
		String selectQuery = "select * from rentalProperty where securitydeposit=?";
		List<RentalProperty> rentalPropertyList = 	jdbcTemplate.query(selectQuery, new RentalPropertyMapper(), deposit);		
		if (rentalPropertyList.isEmpty()) 
			throw new PropertyNotFoundException("property not found with lesser deposit");
		return rentalPropertyList;
	}

	@Override
	public List<RentalProperty> findByLocation(String location) throws PropertyNotFoundException {
		String selectQuery = "select * from rentalProperty where location=?";
		List<RentalProperty> rentalPropertyList = 	jdbcTemplate.query(selectQuery, (rs, rowNum) -> {
			RentalProperty property = new RentalProperty();
			property.setName(rs.getString("name"));
			property.setArea(rs.getString("area"));
			property.setBedrooms(rs.getString("bedrooms"));
			property.setCategory(rs.getString("category"));
			property.setCity(rs.getString("city"));
			property.setLocation(rs.getString("location"));
			property.setPropertyId(rs.getInt("propertyid"));
			property.setRentExpected(rs.getDouble("rentexpected"));
			property.setSecurityDeposit(rs.getDouble("securitydeposit"));
			property.setType(rs.getString("type"));
			return property;
		}, location);
		if (rentalPropertyList.isEmpty()) 
			throw new PropertyNotFoundException("property not found in this location");
		return rentalPropertyList;
	}

	@Override
	public List<RentalProperty> findByCity(String city) throws PropertyNotFoundException {
		String selectQuery = "select * from rentalProperty where city=?";
	    List<RentalProperty> rentalPropertyList = 	jdbcTemplate.query(selectQuery, new RowMapper<RentalProperty>() {

			@Override
			public RentalProperty mapRow(ResultSet rs, int rowNum) throws SQLException {
				RentalProperty property = new RentalProperty();
				property.setName(rs.getString("name"));
				property.setArea(rs.getString("area"));
				property.setBedrooms(rs.getString("bedrooms"));
				property.setCategory(rs.getString("category"));
				property.setCity(rs.getString("city"));
				property.setLocation(rs.getString("location"));
				property.setPropertyId(rs.getInt("propertyid"));
				property.setRentExpected(rs.getDouble("rentexpected"));
				property.setSecurityDeposit(rs.getDouble("securitydeposit"));
				property.setType(rs.getString("type"));
				return property;
			}	
		}, city);
	    if (rentalPropertyList.isEmpty()) 
			throw new PropertyNotFoundException("property not found in this city");
		return rentalPropertyList;
	}

	@Override
	public List<RentalProperty> findAll() {
		String selectQuery ="select * from rentalproperty";
		List<RentalProperty> rentalPropertyList = jdbcTemplate.query(selectQuery, new RentalPropertyMapper());
		return rentalPropertyList;
	}

}
