package pairingmatrix

class UserController {

    def index = { }

    def create = { }

    def pair = { }

    def save = {
        def createUser = [userName: params.userName]
        def user = new User(createUser)

        if (params.userName == null || params.userName == "") {
            flash.error = "The user name is blank"
            redirect(action: 'create')
        }
        else if ((User.findByUserName(user.userName) != null)) {
            flash.error = "The user name already exists"
            redirect(action: 'create')
        }
        else if (user.save(flush: true)) {
            flash.message = "User Saved"
            redirect(action: 'show')
        }
    }

    def displayPairs = {
        [allUsers: User.findAll()]
    }

    def addpair = {

        def user1 = User.findById((params.firstUser as int) + 1)
        def user2 = User.findById((params.secondUser as int) + 1)
        if (!user1.equals(user2)) {
            if((user1.pairs==null || !user1.pairs.contains(user2)) && (user2.pairs==null ||!user2.pairs.contains(user1))){
                user1.addToPairs(user2)
                user2.addToPairs(user1)
                redirect(action: 'displayPairs')
            }
            else{
                flash.error = "This pair already exits"
                redirect(action: 'pair')
            }
            println("first user name" + user1.userName)
            println("first user pairs" + user1.pairs.userName)
            println("second user name" + user2.userName)
            println("second user pairs" + user2.pairs.userName)
        }

        else{
            flash.error = "The first user is the same as the second user"
            redirect(action: 'pair')
        }
    }
    def show = {
        [allUsers: User.findAll()]
    }
}