// Inheritance ~this is the aspect whereby a suplus normally inherits from a superclass
 open class Animal {
    fun eat(){
        println("This animal can eat")
    }
    fun run(){
        println("This animal can run ")
    }

}
class Dog : Animal(){
    fun bark (){
        println("A dog can bark")
    }
    

}
fun main (){

    var Mydog = Dog()

    Mydog.bark()
    Mydog.eat()
}