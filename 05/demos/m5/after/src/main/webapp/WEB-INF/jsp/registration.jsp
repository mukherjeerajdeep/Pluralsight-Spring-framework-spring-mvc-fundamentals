<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h1>Registration</h1>
    <%-- The modelAttribute binding is needed here to bind the model in the controller
       Check the controller where we mentioned it --%>
    <form:form modelAttribute="registration">
        <table>
        <%--  This is the first set of details for entry form --%>
        <%--  First Row with name and input path --%>
            <tr>
                <td>
                    Name:
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
        <%--  This is the second set of details for entry form --%>
        <%--  This is for submit button --%>
            <tr>
                <td colspan="2">
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>

    </form:form>
</body>
</html>
