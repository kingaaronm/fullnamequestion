package fullnamequestion

class BootStrap {

    def init = { servletContext ->
        new Person(firstName: 'Geddy', lastName: 'Lee').save()
    }
    def destroy = {
    }
}
