<!DOCTYPE html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon"/>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
    <g:layoutHead/>

</head>

<body>
<h1>Pairing Matrix</h1>

<div id="content-wrapper">
    <div id="sidebar">
        <li><g:link controller="user" action="create" name="createNewUser">Create User</g:link></li>
        <li><g:link controller="user" action="show" name="ShowListOfUsers">Show Users</g:link></li>
    </div>

    <div id="main-content"><g:layoutBody/></div>
</div>



</body>
</html>