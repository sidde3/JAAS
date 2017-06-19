<%-- 
    Document   : logout
    Created on : Nov 30, 2016, 4:00:24 PM
    Author     : sidde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    session.invalidate();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RedHat</title>
    </head>
    <body>
        <h1>Logout</h1>
        <form action="login.jsp">
            <input type="submit" value="login" />
        </form>
    </body>
</html>
