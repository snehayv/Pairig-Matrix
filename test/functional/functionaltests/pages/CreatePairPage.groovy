package functionaltests.pages

import geb.Page

class CreatePairPage extends Page {
    static at = { $("title").text() == "Add Pair" }
    static url = "PairingMatrix/user/pair"
    static content = {
        firstUser { $("#first-user") }
        secondUser { $("#second-user")}
        addPair { $("button", id: "add-pair")}
    }
}
