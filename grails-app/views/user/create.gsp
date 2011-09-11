<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create User</title>
    <meta name="layout" content="main">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>

</head>

<body>
<g:if test="${flash.error}">
    <div id="errorMessage"><span class="flash-message">${flash.error}</span></div>
</g:if>

<g:if test="${flash.message}">
    <div id="status"><span class="flash-message">${flash.message}</span></div>
</g:if>

<g:form controller="user" action="save" method="POST">
    <div style="position: absolute; top:100px;left:100px">
        <label>User Name</label>
        <g:textField id="user-name" name="userName" value=""/>
        <button type="submit" id="save-user">Save User</button>
    </div>
</g:form>

</body>
</html>