package functionaltests.pages

import geb.Page

class MainPage extends Page {
    static at = { $("title").text() == "Pairing Matrix" }
    static url = ""
    static content = {
        userName{ $("input", id: "user-name") }
        saveUser{ $("button", id: "save-user")}
    }
}
