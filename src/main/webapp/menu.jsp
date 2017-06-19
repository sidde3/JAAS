<%-- 
    Document   : menu
    Created on : Dec 3, 2016, 11:12:00 PM
    Author     : siddh_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% HttpSession nsession = request.getSession(false);
    if(nsession == nsession.getAttribute("sesnname")){
        out.println("<html>"
    +"<head>"        
        +"<title>Welcome</title>"
    +"</head>"
    +"<body>"
        +"<align =\"left\"><a href=\"logout.jsp\">logout</a>"
        +"<center><h3>Menu Page</h3></center>"
    +"</body>"
    +"</html>"
        );
    }else{
        nsession.invalidate();
        response.sendRedirect("index.jsp");
    }
%>

