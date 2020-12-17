fun total (remainder:Int,n:Int):Int{
    var result=1
    for(i in 1..n){
        result=result*remainder
    }
    return result
}
fun main(){
    val n=4
    val x=1634
    var y=x
    var remainder =0

    var answer=0
    while(y!=0){
     remainder = y%10
      answer=answer + total(remainder,n)
      y=y/10
    }
   if (answer==x){print("$x is an Armstrong number")}
   else{print("$x is not an Armstrong number")}

}
