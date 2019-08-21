package fullnamequestion

class Person {
    String firstName
    String lastName

    String fullName(){
        return "$firstName $lastName"
    }
}
