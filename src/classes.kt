//no new keyword

class FirstClass{
    var classDataMemeber:String="";

    fun display(name:String){
        println(name)
    }
    fun display(){
        println(classDataMemeber)
    }
}

//main function
fun main(args:Array<String>){

    //object creation
    var first=FirstClass();

    //calling function of the class
    first.display("My First Call to the function of the class")

    //setting up class data memeber of kotlin
    first.classDataMemeber="This is class data member";

    //calling function which prints data memebr
    first.display()
}