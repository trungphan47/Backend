<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	Frist name: <form:input path="firstName" />
		<br></br>
	Last name: <form:input path="lastName" />
		<br></br>
		
		Country:
		<form:select path="country">
			<form:options items="${student.countryOptions}" />

			<br>
		</form:select>

		<br>
		Java<form:radiobutton path="favoritelanguage" value="Java" />
		JS<form:radiobutton path="favoritelanguage" value="Js" />
		PHP<form:radiobutton path="favoritelanguage" value="PHP" />
		Angular<form:radiobutton path="favoritelanguage" value="Angular" />
		<br>

		Linux<form:checkbox path="operatingSystems" value="Linux" />
		Window<form:checkbox path="operatingSystems" value="Window" />
		Mac OS<form:checkbox path="operatingSystems" value="Mac OS" />
		Ubutu<form:checkbox path="operatingSystems" value="Ubutu" />
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>












