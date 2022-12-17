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
	}
	
	table th {
		width: 100px;
	}
	
	table th+td {
		width:270px;
	}
	
	textarea {
		display: block;
		width: 710px;
		height: 200px;
		margin: 5px auto;
	}
	

</style>

</head>
<body>

	<main>
	
		<%@ include file="/WEB-INF/inc/header.jsp" %>

		<section>
			<form method="POST" action="/code/editok.do?name=${name}">
				<table>
					<tr>
						<th>언어</th>
						<td>
							<select name="language">
								<option value="java">Java</option>
								<option value="sql">SQL</option>
								<option value="html">HTML</option>
								<option value="css">CSS</option>
								<option value="js">JavaScript</option>
							</select>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<textarea name="code" placeholder="Code" required>${dto.code}</textarea>
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<textarea name="description" placeholder="Code" required>${dto.description}</textarea>
						</td>
					</tr>
				</table>
				
				<div class="btns">
					<input type="button" value="돌아가기" onclick="location.href='/code/list.do?name=${name}';">
					<input type="submit" value="수정하기" class="main">				
				</div>
				
				<input type="hidden" name="seq" value="${dto.seq}">
				
			</form>		
		</section>
	
	</main>
	
	
	<script>
	
		$('select[name=language]').val('${dto.language}');
	
	</script>
	
</body>
</html>




















