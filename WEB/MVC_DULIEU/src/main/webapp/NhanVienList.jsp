<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Bean.NhanVien"%>
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
		<caption>Du lieu truy xuat tu bang Nhan vien</Caption>
		<tr><TH>IDNV</TH> <TH>HoTen</TH> <TH>IDPB</TH> <TH>DiaChi</TH></tr>
		<%
			ArrayList<NhanVien> listNV = (ArrayList<NhanVien>)request.getAttribute("listNV");
			for (int i = 0; i < listNV.size(); i++)
			{
				
			
		%>
		 	<tr>
		 		<td><%= listNV.get(i).getIDNV() %></td>
				<td><%= listNV.get(i).getHoten() %></td>
				<td><%= listNV.get(i).getIDPB() %></td>
				<td><%= listNV.get(i).getDiachi() %></td>
        </tr>
		 	<% } %>
	</table>
</body>
</html>