<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>

	<div class="container">
		<h1>edit3. 확장태그</h1>
		<hr />

		<form:form method="post" modelAttribute="student">
			<div class="form-group">
				<label>이름:</label>
				<form:input path="name" class="form-control" />
			</div>

			<div class="form-group">
				<label>학년:</label>
				<form:select path="grade" class="form-control">
					<form:option value="1" label="1학년" />
					<form:option value="2" label="2학년" />
					<form:option value="3" label="3학년" />
					<form:option value="4" label="4학년" />
				</form:select>
			</div>
			<hr />

			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>


	</div>


</body>
</html>