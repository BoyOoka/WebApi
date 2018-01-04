<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page"> 
<title>Insert title here</title>
</head>
<body>
	<form action="getJson" method="get">  
        <input type="submit" value="点击获取新闻JSON数据"/>  
     </form>
     <form action="getJson" method="post">
     	<input type="text" name="test">  
        <input type="submit" value="点击获取新闻JSON数据"/>  
     </form>    
   <h1>设置 Cookie</h1>
		<form action="main.jsp" method=post>
		站点名: <input type="text" name="name">
		<br />
		网址: <input type="text" name="url" />
		<input type="submit" value="提交" />
		</form>
		<form action="calc" method="get">
		数字1：<input type="text" name="nub1">
		数字2：<input type="text" name="nub2">
		结果：<%response.getWriter(); %>
		<input type="submit" value="提交">
		</form>
 </body>
</html>