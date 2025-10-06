// OOP ~ Object Oriented Programming
// An Object is a real world thing that cointains properties /state and behaviours/characteristics
// Object are normally instaniciated from existing classes
class Person{
    // Attributes/state/Properties
    var name = "Arnold"
    var age = 42
    var height = 1.73


    // Behaviours/Action
    fun speak(){
        println("A person $name can speak")

    }
    fun run(){
        println("A person $age can run")
    }
}
fun main (){
    // For us to be able to access either the state /behaviour of a person we reQuire to have an object

   var myObject = Person()
   myObject.speak()
   myObject.run()
    
}