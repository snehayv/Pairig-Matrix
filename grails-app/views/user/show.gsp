<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List of Users</title>
    <meta name="layout" content="main">
    <g:javascript library="jquery-1.6.1"/>
    <g:javascript library="jquery-ui-1.8.14.custom.min"/>

</head>

<body>
<table name="users" id="users">
    <thead>
    <tr>
        <th>List of Users</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${allUsers}" var="user">
        <tr>
            <td>
                <%=user.userName%>
            </td>
        </tr>
    </g:each>
    </tbody>
</table>

</body>
</html>