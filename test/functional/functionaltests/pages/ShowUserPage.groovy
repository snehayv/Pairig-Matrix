package functionaltests.pages
import geb.Page

class ShowUserPage extends Page{
    static at = { $("title").text() == "List of Users" }
    static url = "PairingMatrix/user/show"
    static content = {
        listOfUsersHasOneEntry{$("#users tbody tr").size() == 1}
    }
}

