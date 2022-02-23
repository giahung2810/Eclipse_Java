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
        /* You can remove these code below*/
        :root {
        --primary: #08aeea;
        --secondary: #13D2B8;
        --purple: #bd93f9;
        --pink: #ff6bcb;
        --blue: #8be9fd;
        --gray: #333;
        --font: "Poppins", sans-serif;
        --gradient: linear-gradient(40deg, #ff6ec4, #7873f5);
        --shadow: 0 0 15px 0 rgba(0,0,0,0.05);
    }*{box-sizing:border-box;}input,button,textarea{border:0;outline:none;}
    /* Main code */
    
            .text-field {
                position: relative;
            }
            .text-field label {
                display: inline-block;
                color: #333;
                font-weight: 600;
                cursor: pointer;
                position: absolute;
                top: 0;
                left: 10px;
                background-color: white;
                padding: 1px 5px;
                font-size: 12px;
                transform: translateY(-50%);
                color: #6a5af9;
            }
            .text-field input {
                padding: 15px;
                display: block;
                width: 100%;
                color: #999;
                font-size: 14px;
                border: 1px solid #6a5af9;
                border-radius: 4px;
            }
    </style>

</head>
<body>
	<%
		String yes ="no";	
		session.setAttribute("yes", yes);
	 %>
    <form action='CheckLoginServlet' method='post'>

    <div class="text-field">
          <label for="username3">Username</label>
          <input autocomplete="off" type="text" name="username" id="username3" placeholder="Enter your username" />
        </div>
        <div class="text-field">
          <label for="username3">Password</label>
          <input autocomplete="off" type="text" name="password" id="username3" placeholder="Enter your username" />
        </div>
            <input type="submit" value="OK" >
            <input type="reset" value="Reset">
    </form>

</body>
</html>
<!-- <div class="text-field">
          <label for="username3">Username</label>
          <input autocomplete="off" type="text" id="username3" placeholder="Enter your username" />
        </div> -->