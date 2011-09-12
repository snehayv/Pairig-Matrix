package functionaltests.pages
import geb.Page

class ShowPairPage extends Page{
    static at = { $("title").text() == "Pairing List" }
    static url = "PairingMatrix/user/displayPair"
    static content = {

    }
}
