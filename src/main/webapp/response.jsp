<%-- 
    Document   : response.jsp
    Created on : Dec 3, 2016, 9:12:04 PM
    Author     : siddh_000
--%>
<%@page import="java.util.Iterator"%>
<%@page import="javax.security.auth.login.LoginException"%>
<%@page import="javax.security.auth.login.LoginContext"%>
<%@page import="com.sid.loginweb.CallBackHndlr" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <jsp:useBean id="nameBean" scope="session" class="com.sid.loginweb.nameBean" />
        <jsp:setProperty name="nameBean" property="uname"/>
        <jsp:setProperty name="nameBean" property="passwd"/>
        <%
            String userName = nameBean.getUname();
            String password = nameBean.getPasswd();
            if(request.getParameter("uname")!=null){
                CallBackHndlr cbh = new CallBackHndlr(userName,password);
                try{
                    LoginContext lc = new LoginContext("other", cbh);
                    lc.login();
                    out.println("<align =\"right\"><a href=\"menu.jsp\">Menu</a>");
                    HttpSession nsession = request.getSession(false);
                    nsession.setAttribute("sesnname", nsession);
                    Iterator it = lc.getSubject().getPrincipals().iterator();
                    while (it.hasNext()) 
                    out.println("<center>Authenticated: " + it.next().toString() + "<br>");
                    out.println(nsession+"</center>");
                }catch(LoginException e){
                    e.printStackTrace();
                    response.sendRedirect("index.jsp");
                }
            }else{
                response.sendRedirect("index.jsp");
            }
        %> 
    </body>
</html>
