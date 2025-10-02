fun main(){
Percentage()
Area()
}
fun Percentage(){
    val new : Int = 300
    val old :Double= 250.0

    val percent : Double = (new-old)/old*100
    println("%$percent ") 
}
fun Area(){
    val a : Int = 10
    val b : Int = 14
    val h : Int = 8

    val area : Int= (a+b)*h*1/2
    println("$area")
}