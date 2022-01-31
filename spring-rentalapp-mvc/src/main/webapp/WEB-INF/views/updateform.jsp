<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="updateProperty">
   Enter Name<input type="text" name="name" value="${rentalProperty.name}"><br/>
    Enter PropertyId<input type="text" name="propertyId" value="${rentalProperty.propertyId}" readonly><br/>
     Enter Type<select name="type">
     <option value="${rentalProperty.type}"> ${rentalProperty.type}</option>
     <option value="apartment">Apartment</option>
     <option value="independent">Independent</option>
     </select><br/>
     Enter Category<select name="category">
     <option value="${rentalProperty.category}"> ${rentalProperty.category}</option>
      <option value="all">All</option>
     <option value="family">Family</option>
      <option value="girls">Girls</option>
     <option value="boys">Boys</option>
     </select><br/>
     Enter Bedrooms<select name="bedrooms">
     <option value="${rentalProperty.bedrooms}"> ${rentalProperty.bedrooms}</option>
     <option value="1 BHK">1 BHK</option>
      <option value="2 BHK">2 BHK</option>
      <option value="3 BHK">3 BHK</option>
      <option value="4 BHK">4 BHK</option>
     </select>
     <br/>
     Enter Area<input type="text" name="area" value="${rentalProperty.area}"><br/>
     Enter Expected Rent<input type="text" name="rentExpected" value="${rentalProperty.rentExpected}"><br/>
     Enter Location<input type="text" name="location" value="${rentalProperty.location}"><br/>
     Enter City<input type="text" name="city" value="${rentalProperty.city}"><br/>
     Enter Security Deposit<input type="text" name="securityDeposit" value="${rentalProperty.securityDeposit}"><br/>
     <input type="submit" value="Update property"><br/>
   </form>
</body>
</html>