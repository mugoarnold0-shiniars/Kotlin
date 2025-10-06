class Circle{
   var r : Int = 7

fun Area (){
    var area : Int = (r*r*44)/7
    println(area)
}
fun Circum(){
    var circum :Int=r*22/7
    println(circum)
} 

}
fun main (){

    var MyCalc = Circle()

    MyCalc.Area()
    MyCalc.Circum()
}