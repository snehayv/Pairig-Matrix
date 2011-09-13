<%@ page import="pairingmatrix.User" %>
<html>
<head>
    <title>Add Pair</title>
    <meta name="layout" content="main">
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}"/>
    <g:javascript library="jquery-1.6.1"/>
    <g:javascript library="jquery-ui-1.8.14.custom.min"/>

    <script type="text/javascript">
        function getUserId1() {
            var firstUser = document.getElementById("first-user").selectedIndex
            document.getElementById("pair1").value = firstUser
        }
        function getUserId2() {
            var secondUser = document.getElementById("second-user").selectedIndex
            document.getElementById("pair2").value = secondUser
        }

    </script>

</head>

<body>

<g:form controller="user" action="addpair" method="POST">
    <label>1st User</label>
    <g:select id="first-user"
              from="${User.list()}"
              value="1stUser"
              optionValue="userName"
              onchange="getUserId1()"/>

    <br>
    <g:hiddenField name="firstUser" id="pair1" value="0"/>

    <label>2nd User</label>
    <g:select id="second-user"
              from="${User.list()}"
              value="2ndUser"
              optionValue="userName"
              onchange="getUserId2()"/>

    <br>
    <g:hiddenField name="secondUser" id="pair2" value="0"/>

    <button type="submit" id="add-pair">Add Pair</button>
</g:form>
</body>
</html>