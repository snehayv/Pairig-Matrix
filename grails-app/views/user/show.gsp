<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>List of Users</title>
    <meta name="layout" content="main">

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