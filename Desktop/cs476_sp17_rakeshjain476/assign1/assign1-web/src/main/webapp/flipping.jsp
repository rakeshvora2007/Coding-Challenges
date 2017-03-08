<%@ page import="edu.fullerton.cs476.bean.CoinBean" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Rakesh J
  Date: 3/1/17
  Time: 7:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Let the Flipping Begins</title>
</head>
<body>
<form method="post" action="flippingServlet" >
    <label for="flip">Flips:</label>
    <input id="flip" type="text" name="flip"/>
    <br/>
    <button type="submit">Submit</button>
</form>

<table border="1px">
    <thead>
    <tr>
        <td>
            Flips
        </td>
        <td>
            Coin Result
        </td>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <%=request.getParameter("flip")%>
            </td>
            <td>
                <%=request.getParameter("coin")%>
            </td>
        </tr>
        <% %>
    </tbody>
</table>

