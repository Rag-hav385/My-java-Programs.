public class learnings2 {
    
    public static void main(String[] args)
    {
        student mark = new student();
        //public class student
        //   {
        //       int age ;             // this is done in different file where we made the class student
                                       //and mark here is the object.
        //       String name;
        //       int number; 
        //   }
        /*
        mark.age = 13;        // . can access the variables of the class
        mark.name = "Mark";   // should not be done and be made a different method for each.
        System.out.println(mark.age);
        */
        System.out.println(student.no_of_students());
        System.out.println(mark.no_of_students());           // accessing stattic funtion from both class and obj


        

      
        //main method
        //myfirstmethod();//call of method

        //int sum = Add(100,100);//to asign value a method 
                               //should return a value
    }
       //........................................... methods..........................//
    //public static void myfirstmethod(String name) //String name --> arguments
    //{
        //<....code...>
    //}

    //parameter passing and returning a value//
    //public static --> access specifier
    //void --> type
    //myfirstmethod--> name of method
    
    //public static void Add (int x , int b) // multiple arguments
    //{
         //System.out.println(a+b);
         //return (a + b + c);
    //}

   



}