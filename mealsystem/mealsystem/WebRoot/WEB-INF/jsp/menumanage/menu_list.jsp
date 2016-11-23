<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'menu_list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<table>
  	<tr>
  	<td><input type="button" value="首页"/></td>
  	<td><input type="button" value="菜单"/></td>
  	<td><input type="button" value="订单"/></td>
  	<td><input type="button" value="登陆"/></td>
  	</tr>
  	<tr><td><select>
  	<option>分类一</option>
  		<option>分类一</option>
  		<option>分类一</option>
  			<option>分类一</option>
  	</select></td></tr>
  	</table>
    <table>
    <thead>
    </thead>
    <tbody>
    </tbody>
    </table>
  </body>
</html>
