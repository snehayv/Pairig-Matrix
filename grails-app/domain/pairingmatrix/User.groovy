package pairingmatrix

class User {
    static mapping = {
        table 'user'
    }

    static constraints = {
        userName(unique: true, blank: false)
    }

    String userName
    static hasMany   = [ pairs: User]
}
