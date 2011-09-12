package pairingmatrix

class UserController {

    def index = { }

    def create = { }

    def pair = { }
    
    def save = {
        def createUser = [userName: params.userName]
        def user = new User(createUser)

        if(params.userName == null || params.userName == ""){
            flash.error = "The user name is blank"
        }
        else if ((User.findByUserName(user.userName) != null)) {
            flash.error = "The user name already exists"
        }
        else if (user.save(flush: true)) {
            flash.message = "User Saved"
        }
        redirect(action: 'show')
    }

    def displayPairs = {
        [allUsers: User.findAll()]
    }

    def addpair = {

        def user1 = User.findById((params.firstUser as int)+1)
        def user2 = User.findById((params.secondUser as int)+1)
        user1.addToPairs(user2)
        user2.addToPairs(user1)
        println("first user name"+ user1.userName)
        println("first user pairs"+ user1.pairs.userName)
        println("second user name"+ user2.userName)
        println("second user pairs"+ user2.pairs.userName)
        redirect(action: 'displayPairs')
    }
    def show = {
        [allUsers: User.findAll()]
    }
}