<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Registration</title>
    <%--  CSS Definition  --%>
    <style>
        /* This is just that error printed by side */
        .error {
            color: #ffbf00;
        }
        /* The block shown above */
        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
    <%--  HTML Representation  --%>
    <h1>Registration</h1>
    <form:form modelAttribute="registration">
        <%-- This part of the code invokes .errorblock part of the CSS --%>
        <form:errors path="*" cssClass="errorblock" <%--element="div" --%>/>
        <table>
            <tr>
                <td>
                    <spring:message code="name" />:
                </td>
                <td>
                    <form:input path="name" />
                </td>
                <td>
                    <%-- This part of the code invokes the .error in CSS --%>
                    <%-- Thing is not so simple, check the message.properties for the refined text --%>
                    <form:errors path="name" cssClass="error" />
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Add Registration">
                </td>

            </tr>
        </table>

    </form:form>
</body>
</html>
