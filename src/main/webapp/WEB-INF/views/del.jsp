<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Code</title>

<%@ include file="/WEB-INF/inc/asset.jsp" %>

<style>
	
	table {
		width: 740px;
		margin: 35px auto;
		background-color: #F3F3F0;
		border: 0px;
	}
	
	table td {
		text-align: center;
		padding: 10px;
		border: 0px;
	}
	

	textarea {
		display: block;
		width: 710px;
		height: 200px;
		margin: 5px auto;
	}
	
	.btns {
		text-align: center;
	}

</style>

</head>
<body>

	<main>
	
		<%@ include file="/WEB-INF/inc/header.jsp" %>

		<section>
			<form method="POST" action="/code/delok.do?name=${name}">
			
				<table>
					<tr>
						<td>코드 메모를 삭제합니다.</td>
					</tr>
				</table>
				<div class="btns">
					<input type="button" value="돌아가기" onclick="location.href='/code/list.do?name=${name}';">
					<input type="submit" value="삭제하기" class="main">				
				</div>
				
				<!-- del.java에서 그냥 seq로 넘겼으니 그냥 seq로 받아야한다. -->
				<input type="hidden" name="seq" value="${seq}">
				
			</form>		
		</section>
	
	</main>
	
	
	<script>
	
		
	
	</script>
	
</body>
</html>




















