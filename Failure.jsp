<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
			
		body
		{
			font-family: Arial, sans-serif;
			text-align:center;
		}
		
		#brandlogo h1
		{
			font-size : 40px;
			font-weight : bold;
			color : black;
			border : 4px solid green;
			display : inline-block;
		}
		
		hr
		{
			border : 1px solid black;
			width : 50%;
			margin : 20px auto;
		}
		
		.message-container
		{
			background-color : white;
			padding : 20px;
			margin : 20px auto;
			width : 50%;
			border-radius : 10px;
			box-shadow : 0px 0px 10px gray;
			text-align : center;
			margin-top:30px;
		}
		
		.message-container h1
		{
			margin-top : 30px;
			font-size : 24px;
		}
		.back-button
		{
			padding : 10px 20px;
			background-color : blue;
			color : white;
			border : none;
			cursor : pointer;
			margin-top : 20px;
		}
		
		.back-button:hover 
		{
			background-color : darkblue;
		}
			
	</style>
</head>
<body bgcolor='cyan'>

	<div id="brandlogo">
		<h1><b>TIGOR FIT</b></h1>
	</div>
	<hr>
	
	<div class="message-container">
	
		<h1>Registration Failure</h1>
		<%
			String userName = request.getParameter("userName");
			String email = request.getParameter("email");
		%>
		<p> Try again with different userName. <br>
			Entered userName: <%= userName %> already exists. </p>
			
		 <button class="back-button" onclick="window.location.href='index.html'">Back to Home</button>
		
	</div>
	
	
</body>
</html>