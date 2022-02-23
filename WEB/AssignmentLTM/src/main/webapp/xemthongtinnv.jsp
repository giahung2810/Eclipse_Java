<%@page import="MVC.Model.BEAN.NhanVien"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width=100%>
        <caption>Du lieu truy xuat tu bang nhan vien</caption>
        <tr><TH>IDNV</TH> <TH>HoTen</TH> <TH>IDPB</TH> <TH>DiaChi</TH></tr>
        <%
			ArrayList<NhanVien> listNV = (ArrayList<NhanVien>)request.getAttribute("listNV");
			for(int i = 0; i < listNV.size(); i++){				
		%>
        <tr>
            <td><%= listNV.get(i).getId() %></td>
			<td><%= listNV.get(i).getHoTen() %></td>
			<td><%= listNV.get(i).getIdPb() %></td>
			<td><%= listNV.get(i).getDiaChi() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>