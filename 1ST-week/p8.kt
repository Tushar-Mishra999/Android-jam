fun factorial(x:Int):Int{


    var y=1
    if (x==0){return 0}
    else{for(i in x downTo 1){
       y=y*i
    }
    return y



}

}
fun main(){

    var x=3
    var y=0
    for(i in x downTo 1){
        y=y+factorial(i)
    }
    println("Sum is $y")

}
