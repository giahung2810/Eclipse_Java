<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<frameset rows="120, *, 120">
    <frame src="pageAbove.jsp"></frame>
    <frameset cols="200, *, 200">
        <frame src="pageLeft.jsp"></frame>
        <frame name="frame3" src="pageCenter.jsp"></frame>
        <frame src="pageRight.jsp"></frame>
    </frameset>
    <frame src="pageBelow.jsp"></frame>
</frameset>
</html>