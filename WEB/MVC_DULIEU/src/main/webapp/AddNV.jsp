<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        <form name="form" action="AddNVServlet" method='post'>
            <div class="card">
                <div class="card-header">
                    <b>Chèn thêm nhân viên </b>
                </div>
                <div class="card-body">
                    <div class="form-group">
                        <label for="id">Mã nhân viên</label>
                        <input type="text" class="form-control" name="IDNV" id="IDNV">
                    </div>
                    <div class="form-group">
                        <label for="hoTen">Tên nhân viên</label>
                        <input type="text" class="form-control" name="Hoten" id="Hoten">
                    </div>
                    <div class="form-group">
                      <label for="idPb">Phòng ban</label>
                      <select class="form-control" name="IDPB" id="IDPB">
  						<option>PB1</option>
                        <option>PB2</option>
                        <option>PB3</option>
                      </select>
                    </div>         
                    <div class="form-group">
                        <label for="diaChi">Địa chỉ</label>
                        <input type="text" class="form-control" name="Diachi" id="Diachi">
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