//functions


fun main(args:Array<String>){
    println(add(1,3))
    sub(5,2)
    mul(2,2)
}

//function with void return type
fun mul(num1:Int,num2:Int):Unit{
    println(num1*num2)
}
//function without Return type
fun sub(num1:Int,num2:Int){
    println(num1-num2);
}
//function with return type
fun add(num1:Int,num2:Int):Int{
    return num1+num2;
}