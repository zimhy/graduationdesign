<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
  <%@ taglib prefix="s" uri="/struts-tags"%>
  
  <html>
      <head>
          <title>登陆</title>
      </head>
  
      <body>
           登录
          <br/>
          <s:form action="login.action" >                    
              <s:submit value="登录" />            
          </s:form>
      </body>
  </html>
