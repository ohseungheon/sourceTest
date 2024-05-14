<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>searchMain</h1>
	<span>
	<form action="showCorList1" method="post">
		<input type="submit" value="채용공고">
	</form>
	
	
	
	
	<c:if test="${not empty list1}">
		<c:forEach var="dto" items="${list1}">
				<table>
				<thead>
					<td>기업번호</td>
					<td>기업이름</td>
					<td>공고내용</td>
				</thead>
				<tbody>
					<td>${dto.jno}</td>
					<td>${dto.cname.cname}</td>
					<td>${dto.post}</td>
				</tbody>
			</table>
		</c:forEach>
	</c:if>
	
	<form action="showCorList2" method="post">
		<input type="submit" value="기업결과" name="search">
	</form>
	
	<c:if test="${not empty list2}">
		<c:forEach var="dto" items="${list2}">
		<table>
				<thead>
					<td>기업이름</td>
				</thead>
				<tbody>
					
					<td>${dto.cname}</td>
				</tbody>
			</table>
		</c:forEach>
	</c:if>

</body>
</html>



