class Rectangle{
    var l : Int = 8
    var  w : Int = 6
 
 fun Area (){
     var area : Int = l * w
     println("$area cm ")
 }
 fun Peri(){
     var peri :Int  = (l+w)*2
     println("$peri cm ")
 } 
 
 }
 fun main (){
 
     var MyCalc = Rectangle()
 
     MyCalc.Area()
     MyCalc.Peri()
 }