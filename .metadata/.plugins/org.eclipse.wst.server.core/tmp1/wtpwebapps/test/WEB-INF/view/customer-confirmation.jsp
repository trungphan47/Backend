<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>The customer: ${customer.firstName} ${customer.lastName}
<br>
Free passes: ${customer.freePasses}
<br>
PostalCode : ${customer.postalCode}
<br>
CourseCode : ${customer.courseCode}
</body>
</html>