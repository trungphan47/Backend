<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	The student is confirmed:${student.firstName} ${student.lastName}
	<br> Country: ${student.country}
	<br> Language: ${student.favoritelanguage}
	<br> OperatingSystems:
	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>

	</ul>
</body>
</html>

<!--${student.firstName} goi student.getfirstname -->