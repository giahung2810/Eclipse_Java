        <%@page import="model.Bean.PhongBan"%>
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
        <tr><TH>IDPB</TH> <TH>Ten PB</TH> <TH>Mo ta</TH> <TH>Update</TH></tr>
        <%
			ArrayList<PhongBan> listPB = (ArrayList<PhongBan>)request.getAttribute("listPB");
			for(int i = 0; i < listPB.size(); i++){				
		%>
        <tr>
            <td><%= listPB.get(i).getIDPB() %></td>
			<td><%= listPB.get(i).getTenPB() %></td>
			<td><%= listPB.get(i).getMota() %></td>
			<td align=center><a href="UpdatePBServlet?IDPB=<%= listPB.get(i).getIDPB() %>">xxx</a></td>
        </tr>
        <% } %>
    </table>
</body>
</html>