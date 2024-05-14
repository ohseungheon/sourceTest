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

	<input type="submit" value="채용공고" onclick="loadDoc()">

	<div id="demo">	
	</div>
	
	
	<form action="" method="post">
		<input type="submit" value="기업결과">
	</form>
	<script>
	function loadDoc() {
	    const xhttp = new XMLHttpRequest();
	    xhttp.onload = function() {
	        // 서버로부터 가져온 JSON 문자열을 파싱하여 JSON 객체로 변환
	        const jsonResponse = JSON.parse(this.responseText);
	        console.log(jsonResponse[Object.keys(jsonResponse)[0]]);
	        // 새로운 테이블 요소 생성
	        const table = document.createElement("table");
	        
	        // 테이블에 헤더 추가
	        const header = table.createTHead();
	        const headerRow = header.insertRow(0);
	        const headerCell1 = headerRow.insertCell(0);
	        const headerCell2 = headerRow.insertCell(1);
	        headerCell1.innerHTML = "<b>cno</b>";
	        headerCell2.innerHTML = "<b>cname</b>";
	        
	        // 테이블에 데이터 추가
	        for (let i=0;i<2;i++){
	        	
	        const row = table.insertRow(i+1);
	        const cell1 = row.insertCell(0);
	        const cell2 = row.insert
	        Cell(1);
	        
	        cell1.innerHTML = jsonResponse[Object.keys(jsonResponse)[i]].cno;
	        cell2.innerHTML = jsonResponse[Object.keys(jsonResponse)[i]].cname;
	        }
	        
	        // demo 요소에 테이블 추가
	        document.getElementById("demo").appendChild(table);
	    }
	    xhttp.open("GET", "showCorList", true);
	    xhttp.send();
	}
	</script>
</body>

</html>