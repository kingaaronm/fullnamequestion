package fullnamequestion

class PersonController {
    def show(){
        respond Person.get(params.id)
    }
}
