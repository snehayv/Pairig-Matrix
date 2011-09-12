var pairingMatrix = this.pairingMatrix || {};

/*
pairingMatrix.createUser = function () {

    $("#save-user").click(function() {
        $('#error-message').html("").fadeIn();
        $.ajax({
            url :"save",
            type: "POST",
            data:{"userName": $('#user-name').val()},
            error: function () {
                console.log("Failed.");
            },
            success : function() {
                console.log("success");
                //window.location.reload(true);
                //pairingMatrix.addNewUserToTable();
            },
            cache:false
        });
//        }
    });
};

pairingMatrix.addNewUserToTable = function () {

    var rowToAdd = $('<tr>').append(
        '<td>' +
            $('#user-name').val().trim() +
            '</td>'

    );
    $('#users').append(rowToAdd);
};

pairingMatrix.displayUsers = function () {

    $.ajax({
        url :"user/show",
        type: "GET",
        error: function () {
            console.log("Failed.");
        },
        success : function() {
            console.log("success");
//            window.location.reload(true);
            $("#users-names").val(params.allUsers);
        },
        cache:false
    });
}*/

pairingMatrix.addUsersToDropDown = function() {

}