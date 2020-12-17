fun main(){
   var x= 5
    val y=x
    if (x==0){println("Factorial of $y is 1 ")}
    else{for(i in x-1 downTo 1){
        x=x*i
    }
    println("Factorial of $y is $x ")
    }


}
