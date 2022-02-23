<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html >
<head>
    
    <title>Document</title>
</head>
<frameset rows="150,*,150">
    <frame name=t1 src="./t1.jsp">
        <frameset cols="*,150">
            <frame name=t3 src="./t3.jsp">
            <frame name=t4 src="./t4.jsp">
        </frameset>
    <frame name=t5 src="./t5.jsp">
</frameset>

<body>
    <form name="form1" action method="">
        submit()
    </form>
</body>
</html>