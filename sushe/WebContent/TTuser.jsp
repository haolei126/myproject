<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8"> 
<title>getcookies</title>
</head>
<body>
<iframe src="about:blank" name="blankFrame" id="blankFrame" style="display: none;"></iframe>
<form method="post" action="set-cookie" ">  
  请输入用户姓名：<input type="text" name="username"> 
  <input type="submit" name="Submit" value="setcookie" > 
  <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
</form>
<form  method="get" action="get-cookie"> 
  <input type="submit" name="Submit" value="getcookie" > 
  <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/>
</form>

</body>
</html>