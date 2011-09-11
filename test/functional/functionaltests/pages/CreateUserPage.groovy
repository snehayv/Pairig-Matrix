package functionaltests.pages

import geb.Page

class CreateUserPage extends Page {
    static at = { $("title").text() == "Create User" }
    static url = "PairingMatrix/user/create"
    static content = {
        userName{ $("input", id: "user-name") }
        saveUser{ $("button", id: "save-user")}
    }
}