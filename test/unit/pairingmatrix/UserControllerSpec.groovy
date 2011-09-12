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
        user1.save()
        user2.save()

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

    def "should give error when a user is paired with itself"() {
        setup:
        mockDomain(User)
        def user1 = new User(userName: 'Sneha')
        user1.save()

        when:
        controller.params.firstUser = user1.id-1
        controller.params.secondUser = user1.id-1
        controller.addpair()

        then:
        controller.flash.error == "The first user is the same as the second user"
        and:
        redirectArgs == [action: 'pair']
    }
    def "should give error when a user pair that already exists is created again"() {
        setup:
        mockDomain(User)
        def user1 = new User(userName: 'Sneha')
        def user2 = new User(userName: 'Pooja')
        user1.save()
        user2.save()
        controller.params.firstUser = user1.id-1
        controller.params.secondUser = user2.id-1
        controller.addpair()

        when:
        controller.params.firstUser = user1.id-1
        controller.params.secondUser = user2.id-1
        controller.addpair()

        then:
        controller.flash.error == "This pair already exits"
        and:
        redirectArgs == [action: 'pair']
    }
}
