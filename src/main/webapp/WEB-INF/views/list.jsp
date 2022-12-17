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
		margin: 50px auto;
	}
	
	table tr:nth-child(1) td:nth-child(1) {
		font-size: 1rem;
		font-weight: bold;
		background-color: #F3F3F0;
	}
	
	table tr:nth-child(1) td span {
		font-size: 1rem;
	}
	
	table tr:nth-child(1) td:nth-child(2){
		width: 180px;
		text-align: right;
		padding-right: 15px;
	} 
	
	table tr:nth-child(2) td {
		font-family: D2Coding;
		padding: 25px;
	}

	table tr:nth-child(2) td span {
		font-family: D2Coding;
	}
	
	.edit-btns {
		width: 740px;
		margin: 0 auto;
		text-align: right;
		transform: translate(0, -30px);
	}
	
	#name {
		width: 300px;
		margin: 20px auto;
		padding: 10px;
		text-align: center;
		font-size: 1.2rem;
		background-color: #F3F3F0;
		border-radius: 40px;
	}

</style>

</head>
<body>

	<main>
	
		<%@ include file="/WEB-INF/inc/header.jsp" %>
		<div id="name"> '${name}'의 Code Snippets!</div>

		<section>
			
			<c:if test="${list != null}">
			<c:forEach items="${list}" var="dto">
			<table>
				<tr>
					<td>${dto.description}</td>
					<td>
						<span>${dto.regdate}</span>
					</td>
				</tr>
				<tr>
					<td colspan="2">${dto.code}</td>
				</tr>
			</table>
			
			<div class="edit-btns">
				<input type="button" value="수정하기" class="main"
					onclick="location.href='/code/edit.do?seq=${dto.seq}&name=${name}';">
				<input type="button" value="삭제하기" class="main"
					onclick="location.href='/code/del.do?seq=${dto.seq}&name=${name}';">
			</div>
			
			</c:forEach>
			
			<div class="btns">
				<input type="button" value="등록하기" class="main"
					onclick="location.href='/code/add.do?name=${name}';">
				<input type="button" value="로그아웃" class="main"
					onclick="location.href='/code/main.do';">					
			</div>
			
			</c:if>
			
			<c:if test="${list == null}">
			
			<div class="btns">
				<input type="button" value="등록하기" class="main"
					onclick="location.href='/code/add.do?name=${name}';">
				<input type="button" value="로그아웃" class="main"
					onclick="location.href='/code/main.do';">		
			</div>
			
			</c:if>
			
		</section>
	
	</main>
	
	
	<script>
	
	</script>
	
</body>
</html>