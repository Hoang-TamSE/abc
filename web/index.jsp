<%-- 
    Document   : index
    Created on : Dec 28, 2021, 5:42:20 PM
    Author     : Hoang Tam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="calculator" method="post">
            <table>
                <tr>
                    <td>First:</td>
                    <td>
                        <input type="text" name="a" value="${first}"/>
                    </td>
                </tr>
                <tr>
                    <td>Second:</td>
                    <td>
                        <input type="text" name="b" value="${second}"/>
                    </td>
                </tr>
                <tr>
                    <td>Operator:</td>
                    <td>
                        <select name="ope">
                            <option value="+" ${add}>+</option>
                            <option value="-" ${sub}>-</option>
                            <option value="*" ${multi}>*</option>
                            <option value="/" ${divv}>/</option>
                        </select>

                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td>
                        <button type="submit">Compute</button>
                    </td>
                </tr>
                <tr>
                    <td>Result:</td>
                    <td>
                        <input type="text" value="${r}"/>
                    </td>
                </tr>
            </table>
            <input type="date" name="date"/>
            ${DATE}
        </form>
    </body>
</html>
