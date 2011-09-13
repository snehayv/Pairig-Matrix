import functionaltests.PairingMatrixGebSpec
import functionaltests.pages.CreatePairPage
import functionaltests.pages.CreateUserPage
import functionaltests.pages.ShowPairPage

class CreatePairSpec extends PairingMatrixGebSpec {
    def "should go to show pairs page and add the newly created pair to the table when the pair is saved"() {
        given:
        createUser("Sneha")
        createUser("Pooja")

        when:
        to CreatePairPage
        firstUser.value("Sneha")
        secondUser.value("Pooja")
        addPair.click()

        then:
        assert at(ShowPairPage)
        and:
        pairList.size() == 2
    }

    private def createUser(title) {
        to CreateUserPage
        userName = title
        saveUser.click()
    }
}

