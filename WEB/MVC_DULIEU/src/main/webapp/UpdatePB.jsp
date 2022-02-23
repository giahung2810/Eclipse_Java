<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="model.Bean.PhongBan"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.1/css/all.css"
        integrity="sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ" crossorigin="anonymous">
</head>
<body>
<div class="col-5 offset-4 mt-4"> 
<form name="form" action="UpdatePBServlet?action=update" method='post'>
    <div class="card">
        <div class="card-header">
            <b>Chỉnh sửa thông tin phòng ban </b>
        </div>
        <%
			PhongBan phongBan = (PhongBan) request.getAttribute("PhongBan");
		%>
        <div class="card-body">
            <div class="form-group">
                <label for="id">ID</label>
                <input type="text" class="form-control" name="IDPB" id="IDPB" value ="<%= phongBan.getIDPB() %>" readonly>
            </div>
            <div class="form-group">
                <label for="tenPb">Tên phòng ban</label>
                <input type="text" class="form-control" name="TenPB" id="TenPB" value ="<%= phongBan.getTenPB() %>">
            </div>
            <div class="form-group">
                <label for="moTa">Mô tả</label>
                <input type="text" class="form-control" name="Mota" id="Mota" value = "<%= phongBan.getMota() %>">
            </div>
        </div>
        <div class="card-footer text-muted">
            <input type="reset" class="float-right btn btn-primary ml-2" value="Reset">
            <input type="submit" class="float-right btn btn-primary" value="OK">
        </div>
    </div>
</form>
</div>
</body>
</html>