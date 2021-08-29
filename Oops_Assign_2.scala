
object Main {                                          // creating a main object               
  class Person(val name : String, val age : Int){      //Define a class named Person 
    def <(that : Person) =
    if (this.name.length()==that.name.length) {        //check if the name parameter of both objects is equal
      this.age < that.age                              //if yes then do the comparison according to age.
    }
    else {
      
      this.name.length()<that.name.length              //If name is not equal then do the comparison based on name length     
    }
  }
  def main(args: Array[String]): Unit = {
    var a = new Person("test",24)
    var b = new Person("test",25) 
    println(a<b)
    var c = new Person("TestAgain",24)
    println(c<b)                                      // comparision between person's for output
  }
}
