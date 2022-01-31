<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="addEmployee">
     <label>Enter Id</label>
     <input type="text" name="empId"/>
     <br/>
     <label>Enter Name</label>
     <input type="text" name="empName"/>
      <br/>
     <label>Enter city</label>
     <input type="text" name="city"/>
      <br/>
     <label>Enter salary</label>
     <input type="text" name="salary"/>
      <br/>
      <input type="submit" value="add employee"/>
   </form>
</body>
</html>