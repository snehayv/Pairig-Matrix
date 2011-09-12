import functionaltests.PairingMatrixGebSpec
import functionaltests.pages.CreatePairPage
import functionaltests.pages.CreateUserPage
import functionaltests.pages.ShowPairPage

class CreatePairSpec extends PairingMatrixGebSpec {
    def "should go to show users page and add the newly created user on the table when the user is saved"() {
        given:
        createUser("Sneha")
        createUser("Pooja")

        when:
        to CreatePairPage
        firstUser = "Sneha"
        secondUser= "Pooja"
        addPair.click()

        then:
        assert at(ShowPairPage)
    }

    private def createUser(title) {
        to CreateUserPage
        userName = title
        saveUser.click()
    }
}

