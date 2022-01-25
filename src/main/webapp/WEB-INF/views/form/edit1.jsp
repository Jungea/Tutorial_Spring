<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
		<h1>edit1. 변수</h1>
		<hr />

		<form method="post">
			<div class="form-group">
				<label>이름:</label> 
				<input type="text" name="name" value="${ name }" class="form-control" />
			</div>
			<div class="form-group">
				<label>학년:</label> 
				<select name="grade" class="form-control">
					<option value="1" ${grade == 1 ? "selected" : ""}>1학년</option>
					<option value="2" ${grade == 2 ? "selected" : ""}>2학년</option>
					<option value="3" ${grade == 3 ? "selected" : ""}>3학년</option>
					<option value="4" ${grade == 3 ? "selected" : ""}>4학년</option>
				</select>
			</div>
			<hr />
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>


</body>
</html>