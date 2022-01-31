<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="addProperty">
   Enter Name<input type="text" name="name"><br/>
    Enter PropertyId<input type="text" name="propertyId"><br/>
     Enter Type<select name="type">
     <option value="apartment">Apartment</option>
     <option value="independent">Independent</option>
     </select><br/>
     Enter Category<select name="category">
      <option value="all">All</option>
     <option value="family">Family</option>
      <option value="girls">Girls</option>
     <option value="boys">Boys</option>
     </select><br/>
     Enter Bedrooms<select name="bedrooms">
     <option value="1 BHK">1 BHK</option>
      <option value="2 BHK">2 BHK</option>
      <option value="3 BHK">3 BHK</option>
      <option value="4 BHK">4 BHK</option>
     </select>
     <br/>
     Enter Area<input type="text" name="area"><br/>
     Enter Expected Rent<input type="text" name="rentExpected"><br/>
     Enter Location<input type="text" name="location"><br/>
     Enter City<input type="text" name="city"><br/>
     Enter Security Deposit<input type="text" name="securityDeposit"><br/>
     <input type="submit" value="Add property"><br/>
   </form>
</body>
</html>