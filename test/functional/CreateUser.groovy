import functionaltests.PairingMatrixGebSpec
import functionaltests.pages.MainPage

class CreateUser extends PairingMatrixGebSpec{
    def "should save the user when the save user button is clicked"(){
        given:
        to MainPage

        when:
        userName = "Sneha"
        saveUser.click()

        then:


    }
}
