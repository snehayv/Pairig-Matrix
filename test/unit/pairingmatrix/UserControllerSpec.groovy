package pairingmatrix

import grails.plugin.spock.ControllerSpec

class UserControllerSpec extends ControllerSpec {

    def "should save the user when save button is clicked"() {
        setup:
        mockDomain(User)

        controller.params.userName = 'sneha'

        when:
        controller.save()

        then:
        User.count() == 1
        and:
        redirectArgs == [action: 'show']
    }

    def "should display error message when the user name is empty and save is clicked"() {
        setup:
        mockDomain(User)

        controller.params.userName = ''

        when:
        controller.save()

        then:
        controller.flash.error == "The user name is blank"
    }

    def "should display error message when the user name saved already exists "() {
        setup:
        mockDomain(User)

        controller.params.userName = 'Sneha'
        controller.save()

        when:
        controller.params.userName = 'Sneha'
        controller.save()

        then:
        controller.flash.error == "The user name already exists"
    }


    def "should create the pair when two users are paired together"() {
        setup:
        mockDomain(User)
        def user1 = new User(userName: 'Sneha')
        def user2 = new User(userName: 'Pooja')
        def user3 = new User(userName: 'Deepa')
        user1.save()
        user2.save()
        user3.save()

        when:
        controller.params.firstUser = user1.id-1
        controller.params.secondUser = user2.id-1
        controller.addpair()

        then:
        user1.pairs.size() == 1
        and:
        user2.pairs.size() == 1
        and:
        redirectArgs == [action: 'displayPairs']
    }
    /*def 'should display all the users'() {
            given:
            def tempUser = new User(userName: "sneha")
            mockDomain(User)
            controller.params.userName = "sneha"
            controller.save()

            when:
            def models = controller.show()

            then:
            models['allUsers'] == tempUser
        }
*/
}
