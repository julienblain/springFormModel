<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>Spring MVC Form Handling</title>
    </head>

    <body>
        <h2>Submitted Student Information</h2>
        <table>
            <tr>
                <td>Name</td>
                <td>${name}</td>
            </tr>
            <tr>
                <td>Age</td>
                <td>${age}</td>
            </tr>
            <tr>
                <td>Country</td>
                <td>${country}</td>
            </tr>
            <tr>
                <td>Interests</td>
                <td>
                    <c:forEach var="interest" items="${interestList}" >
                        ${interest}
                    </c:forEach>
                </td>
            </tr>
            <tr>
                <td>ID</td>
                <td>${id}</td>
            </tr>
        </table>  
    </body>

</html>