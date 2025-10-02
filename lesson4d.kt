fun main(){
    // Parameters are values that get passed as arguments when invoke a function 
    greetings("Arnold")
    greetings("Mnare")
    simpleIntrest(rate = 7, time=8, principal=50000.0)
    Circle(r=14.0) 

}
fun greetings(name : String){
    println("hello "+ name + " how have you been?Hope all is fine")

}
fun simpleIntrest(rate:Int, time:Int,principal:Double){
    val si : Double =(rate * time * principal)/100

    println("The intrest Gained is: " + si+ "Ksh")
}

fun Circle( r:Double){
    val area : Double=(r*r*44)/7
    println( area)

}