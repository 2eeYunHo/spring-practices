<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% pageContext.setAttribute("newLine", "\n");%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
</head>
<body>
	<form action="${pageContext.request.contextPath }/add" method="post">
		<table border=1 width=500>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
				<td>비밀번호</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan=4><textarea name="message" cols=60 rows=5></textarea></td>
			</tr>
			<tr>
				<td colspan=4 align=right><input type="submit" value="등록"></td>
			</tr>
		</table>
	</form>
	<c:set var='count' value='${fn:length(list) }' />
	<!-- var변수선언 =count| fn:는 함수사용선언 length를 사용하겠다 선언함 -->
	<c:forEach items='${list}' var='vo' varStatus='status'>
		<table width=510 border=1>
			<tr>
				<td>${count-status.index}</td>
				<!-- count는 위set에서 선언함list만큼 (-)  status.index 0에서 부터 -->
				<td>${vo.name }</td>
				<td>${vo.reg_date}</td>
				<td><a
					href='${pageContext.request.contextPath }/delete/${vo.no }'>삭제</a></td>
			</tr>
			<tr>
				<td colspan=4>${fn:replace(vo.message, newLine, "<br/>")}</td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>