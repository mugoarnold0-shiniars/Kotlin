fun main(){
    //when conditional statement
    val mark=70
    when(mark){
    in 1..30->println("you have below average")
    in 31..50-> println("you have average")
    in 51..70->println("you have above average")
    in 71..100->println("execellent")
    else->println("invalid scores..!")
     
    }
}