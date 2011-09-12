<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Pairing List</title>
    <meta name="layout" content="main">

</head>

<body>
<h1>Pairing List</h1>
<table name="pairingList" id="pairing-list">
    <thead>
    <tr>
        <th>User</th>
        <th>Paired with</th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${allUsers}" var="user">
        <g:each in="${user.pairs}" var="pair">
            <tr>
                <td>
                    <%=user.userName%>
                </td>
                <td>

                    <%=pair.userName%>
                </td>
            </tr>
        </g:each>
    </g:each>
    </tbody>
</table>

</body>
</html>