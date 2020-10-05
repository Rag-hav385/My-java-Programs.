public class student
{
    int age ;
    String name;
    static int number; // can be accessed from class and interface 

    student(){
        
        //constructor
        //always same as class name
        //we can also have code here
        //this will be the first method to be intialised
        //can never return a value
        number++;// default initialisation
    }
    public static int no_of_students(){
        return number; //use of static variable this fucntion can be accsessed by class and obj/interface.
    }
    // we can also have multiple constructors
    /*
    student(int a , int b , int c){
        //<..code..>//
        //if we ll give 
        //parameters in our initialisation java will take 
        //this constructor
    }
     */
    //...........................method overloading....................
    
     public  int Add(int a , int b){
         return (a+b);
     }

     public  double Add(double a , double b){
         return (a+b);
     }
     /* 
       using method of same name but different logic and diff arguments
     */ 

 // it is not to to be donre that the user can get to 
 //variables so always make getters and setters

 //......Access Modifiers.........//

 /*
   Public , Private , Protected

   Modifier    Class  Package  Subclass  World
   .............................................
   public       Y        Y        Y        Y
   protected    Y        Y        Y        N  
   no modifier  Y        Y        N        N
   private      Y        N        N        N
   .............................................

   */

 //............................final Keyword...................//
 /*
   final keyword has a numerous way to use:
     
     a final class cannot be subclassed.
     a final method cannot be overridden by subclasses
     a final variable can only be initialized once
*/




}