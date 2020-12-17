fun main(){
    val x=407
    var y=x
    var remainder =0
    var answer=0
    while(y!=0){
     remainder = y%10
      answer=answer +(remainder*remainder*remainder)
      y=y/10
    }
   if (answer==x){print("$x is an Armstrong number")}
   else{print("$x is not an Armstrong number")}

}
