<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create User</title>
    <meta name="layout" content="main">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>

</head>

<body>

<g:form controller="user" action="save" method="POST">
    <div style="position: absolute; top:130px;left:200px">
        <label>User Name</label>
        <g:textField id="user-name" name="userName" value=""/>
        <button type="submit" id="save-user">Save User</button>
    </div>
</g:form>

</body>
</html>