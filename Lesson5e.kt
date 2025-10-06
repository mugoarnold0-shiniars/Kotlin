
open class Reptile {
    fun eat(){
        println("This animal can eat")
    }
    fun move (){
        println("This animal can run ")
    }

}
class Crocodile : Reptile(){
    fun swim (){
        println("A crocodile has a swim")
    }
    

}
fun main (){

    var Myreptile  = Crocodile()

    Myreptile.swim()
    Myreptile.eat()
}