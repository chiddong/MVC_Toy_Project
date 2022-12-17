<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%@ include file="/WEB-INF/inc/asset.jsp" %>

<style>

	#login {
		width: 300px;
		margin: 50px auto;
	}
	
	#login th {
		width: 90px;
	}
	
	#login td {
		width: 210px;
		text-align: center;
	}
	
	.btns {
		width: 300px;
		margin: 60px auto;
		text-align: center;
	}
	
	.btns .main {
		width: 90px;

	}
	
	

</style>

</head>
<body>

	<main>
	
		<%@ include file="/WEB-INF/inc/header.jsp" %>
		
		<form method="POST" action="/code/loginok.do">
		<table id="login">
			<tr>
				<th>ID</th>
				<td><input type="text" name="id" required></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="password" name="pw" required></td>
			</tr>
		</table>
		
		<div class="btns">
			<input type="submit" class="main" value="로그인">
		</div>
		</form>
		
	</main>

	<script>
	
		
	
	</script>

</body>
</html>



















