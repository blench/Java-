<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="navbar.jsp" %>
<%
 	String path=request.getContextPath();
	String basePath=request.getScheme()+"://"+request.getServerName()+":"
			+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" >
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="keywords" content="keyword1" >
<meta http-equiv="desciption" content="第一个Jsp项目" >
<title>首页</title>
</head>

<body>
	<jsp:useBean id="loginBean" class="lyons.entity.Login" scope="session"/> 
		<% request.setCharacterEncoding("UTF-8"); %>
	<ul id="user">
		<li>
			<%
			String str=null;
			str=loginBean.getUserName();
			if(str.equals("userNull")|| str==null)
			{
				HttpSession s=request.getSession(true);
				s.invalidate();
				%>
			<a href="jsp/join/login.jsp">登录</a>or
			<a href="jsp/join/register.jsp">注册</a>
			<% 
			return;
			}
			%>
			<dl>
				<dt>
					<a>欢迎您,<b><font color="red"><%=str %></font></b></a>
					<a href="<%=path %>/lyons.control/HandExit"><font color="CDC9C9">退出
					</font></a>
				</dt>
			</dl>
	</ul>
	<%
	String value=null;
	value=request.getParameter("first");
	if(value!=null&&"FP".equals(value))
	{%>
		<center>
			<br/><br/><br/>
			<img src="http://localhost:8080/LyonsEbay/image/page/first.jpg" 
			width="700px" height="500px"/>
		</center>
	<%}
	%>
	
	
</body>
</html>