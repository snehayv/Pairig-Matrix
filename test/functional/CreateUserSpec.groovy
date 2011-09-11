import functionaltests.PairingMatrixGebSpec
import functionaltests.pages.CreateUserPage
import functionaltests.pages.ShowUserPage

class CreateUserSpec extends PairingMatrixGebSpec{
    def "should go to show users page and add the newly created user on the table when the user is saved"(){
        given:
        to CreateUserPage

        when:
        userName = "Sneha"
        saveUser.click()

        then:
        assert at(ShowUserPage)
        and:
        listOfUsersHasOneEntry
    }
}
