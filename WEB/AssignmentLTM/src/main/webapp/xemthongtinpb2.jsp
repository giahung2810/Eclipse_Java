<%@page import="MVC.Model.BEAN.PhongBan"%>
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
        <caption>Du lieu truy xuat tu bang phong ban</caption>
        <tr><TH>IDNV</TH> <TH>HoTen</TH> <TH>IDPB</TH> <TH>DiaChi</TH></tr>
        <%
			ArrayList<PhongBan> listPB = (ArrayList<PhongBan>)request.getAttribute("listPB");
			for(int i = 0; i < listPB.size(); i++){				
		%>
        <tr>
            <td><%= listPB.get(i).getId() %></td>
			<td><%= listPB.get(i).getTenPb() %></td>
			<td><%= listPB.get(i).getMoTa() %></td>
			<td align=center><a href="CapNhapPBServlet?IDPB=<%= listPB.get(i).getId() %>">xxx</a></td>
        </tr>
        <% } %>
    </table>
</body>
</html>