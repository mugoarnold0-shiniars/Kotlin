fun main(){
    val principal : Int=5000
    val rate : Double=6.0


    val A : Double = principal*(1+rate/100)*1.06*1.06*1.06*1.06*1.06
    val CI : Double = A-principal
    println("The Compound intrest is: $CI")
}
