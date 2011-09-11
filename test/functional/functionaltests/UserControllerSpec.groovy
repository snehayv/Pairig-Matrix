package functionaltests

import grails.plugin.spock.ControllerSpec
import pairingmatrix.User

class UserControllerSpec extends ControllerSpec{
    def "should save the user when save button is clicked and redirect to show users page"(){
        setup:
        mockDomain(User)

        controller.params.userName = 'sneha'

        when:
        controller.save()

        then:
        User.count() == 1
        redirectArgs == [action:'show']

    }

    def "should display error message when the user name is empty and save is clicked"(){
        setup:
        mockDomain(User)

        controller.params.userName = ''

        when:
        controller.save()

        then:
        controller.flash.error == "The user name already exists"

    }
//    def 'should display all the users'() {
//            given:
//            def tempUser = new User(userName: "sneha")
//            mockDomain(User)
//            controller.params.userName = "sneha"
//            controller.save()
//
//            when:
//            def models = controller.show()
//
//            then:
//            models['allUsers'] == tempUser
//        }

}
