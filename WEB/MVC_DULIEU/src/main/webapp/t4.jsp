<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body{
            font-family: sans-serif;
            font-size: 15px;
        }
        #menu ul{
            background-color: white;
            width: 250px;
            padding: 0;
            list-style-type: none;
        }
        #menu ul li {
            width: auto;
            height: 40px;
            line-height: 40px;
            border-bottom: 1px dotted #9e9d9d;
            padding: 0 1em;
        }
        #menu ul li a{
            text-decoration: none;
            color: rgb(12, 11, 11);
            font-weight: bold;
            display: block;
        }
        #menu ul li a:hover{
            background: rgb(214, 214, 214);
        }
        
    </style>
</head>
<body> 
	<%
		
		String checkLogin = (String)request.getAttribute("checkLogin");
		String checkLoginsession = (String)session.getAttribute("check");
		
		//out.println(checkLoginsession);
		if(checkLoginsession != null) {
			%>
			<div id="menu">
	        <!-- class="check_login <% request.getParameter("checkLogin");%>"  (String)session.getAttribute("temp"); -->
	            <ul>
	                <li><a href="NhanVienServlet" target="t3" >Xem nhan vien</a></li>
	                <li><a href="PhongBanServlet?" target="t3">Xem phong ban</a></li>
	                <li><a href="./Search.jsp" target="t3" >Tim kiem</a></li>
	                <li><a href="PhongBanServlet?action=update" target="t3" >Cap nhat</a></li>
	                <li><a href="./AddNV.jsp" target="t3" >Them nhan vien</a></li>
	                <li><a href="http://localhost/CNWeb/Xoa_nv.php" target="t3" >Xoa nhan vien</a></li>
	                <li><a href="http://localhost/CNWeb/Xoatatca.php" target="t3" >Xoa nhieu nhan vien</a></li>
	                
	            </ul>  
	        </div>  
	        <%
		}
		else{
			%>
	                <div id="menu">
	        <!-- class="check_login <% request.getParameter("checkLogin");%>"  (String)session.getAttribute("temp"); -->
	            <ul>
	                <li><a href="NhanVienServlet" target="t3" >Xem nhan vien</a></li>
	                <li><a href="PhongBanServlet?" target="t3">Xem phong ban</a></li>
	                <li><a href="./Search.jsp" target="t3" >Tim kiem</a></li>
	                <li><a href="Login.jsp" target="_self" >Dang Nhap</a></li>
	            </ul>  
	        </div>  
	                <% 
		}
	        %> 

    
</body>
</html>