package pairingmatrix

class UserController {

    def index = { }

    def create = {
    }

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

    def show = {
        [allUsers: User.findAll()]
    }
}