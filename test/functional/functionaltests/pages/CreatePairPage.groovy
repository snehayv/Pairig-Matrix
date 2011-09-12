package functionaltests.pages

import geb.Page

class CreatePairPage extends Page {
    static at = { $("title").text() == "Add Pair" }
    static url = "PairingMatrix/user/pair"
    static content = {
        userId1 { $("input",id :"pair1") }
        userId2 { $("input",id :"pair2") }
        firstUser { $("#first-user") }
        secondUser { $("#second-user") }
        addPair { $("button", id: "add-pair")}
    }
}
