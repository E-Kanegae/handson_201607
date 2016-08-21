<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>meetingDetail画面</title>

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap/honoka/css/bootstrap.css"
	type="text/css" media="screen, projection">
<body>
	<table class="container">
		<tr>
			<td>会議室名：</td>
			<td>${output.meetingNm}</td>
		</tr>
		<tr>
			<td>予約者名</td>
			<td>${output.reservationNm}</td>
		</tr>
		<tr>
			<td>日付：</td>
			<td>${output.date}</td>
		</tr>
		<tr>
			<td>時間：</td>
			<td>${output.time}</td>
		</tr>
	</table>
	<form:form action="${pageContext.request.contextPath}/meeting/print"
		method="get" modelAttribute="meetingForm">
		<form:hidden path="meetingId" />
		<div style="text-align: right; margin-right: 10%">
			<input type="submit" value="Print" class="btn btn-success" />
		</div>
	</form:form>
</body>