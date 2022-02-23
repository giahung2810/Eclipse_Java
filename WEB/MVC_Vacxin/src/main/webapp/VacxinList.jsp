<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Bean.Vacxin"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	
</script>
</head>
<body>
	<table border="1" width=100%>
		<caption>Du lieu truy xuat tu bang Vacxin</Caption>
		<tr><TH>MaVacxin</TH> <TH>TenVacxin</TH> <TH>SoMui</TH> <TH>MoTa</TH> <TH>GiaVacxin</TH>  <TH>TenHangSX</TH></tr>
		<%
			ArrayList<Vacxin> list = (ArrayList<Vacxin>)request.getAttribute("listvacxin");
			for (int i = 0; i < list.size(); i++)
			{
				
			
		%>
		 	<tr>
		 		<td><%= list.get(i).getMaVacxin() %></td>
				<td><%= list.get(i).getTenVacxin() %></td>
				<td><%= list.get(i).getSoMui() %></td>
				<td><%= list.get(i).getMoTa() %></td>
				<td><%= list.get(i).getGiaVacxin() %></td>
				<td><%= list.get(i).getTenHangSX() %></td>
        </tr>
		 	<% } %>
	</table>
</body>
</html>