
public class Learnings3 {
    //...........Inheritance...............// 
    /*
     Polygon
     ------> triangle
     ------> rectangle
            */
    public static void main (String[] args){
        rectangle rec = new rectangle();
        triangle tri = new triangle();

        rec.set_values(10, 10);
        tri.set_values(10, 10);

        System.out.println(rec.area());
        System.out.println(tri.area());
        
     // .......polymorphism..........//

      polygon p = new rectangle(); // polymorphism
      
      System.out.println(p.polymorphism());


      //.......abstract class....//
      /* type of class of which no object or interface can be created 
      and can br used as a base class 
      */

      //.......interface.....//
      /* same as abstract class made by 
       public interface <nameofclass>{
           <mthods and code>

       }
       not extended but implemented
        public class <nameofnewclass> implements <nameofclass>{
            <methods and code>
        }

        /// class to class ---> extends
        /// interface class ------> implements
        /// interfacee interface  -----> extends
        
         */

    








    }

}