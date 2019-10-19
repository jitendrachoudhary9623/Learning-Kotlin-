//declaring variables in kotlin
//use of var keyword for declaring variable
//var is mutable
//val is immutable
fun main(args:Array<String>){
    var str="This is variable";
    var int=10;

    //empty string declaration
    var emptyString:String;

    //emptyString=1  //gives compile time error
    //emptyString="string" //this works

    val thisIsConstant="This is a constant val which cannot be changed";
    //thisIsConstant="Told you this will not change" //will show compile time error

    println(str);
    println(int);
}