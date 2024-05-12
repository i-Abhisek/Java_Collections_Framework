package Cursors;
// Cursors
 /* If you want to retrieve objects one by one from the collection, then we should go for Cursors */
 

 // Enumeration
 /* We have used Enumeration to get objects one by one From the old collection objects(Legacy Collection)
  * We can Create Enumeration object by using Elements() method of vector Class
    public Enumeration element();
   */

   

   import java.util.*;
   
   public class EnumerationDemo {
       public static void main(String[] args) {
           Vector<Integer> v = new Vector<>();
           for (int i = 0; i <= 10; i++) {
               v.addElement(i);
           }
           System.out.println(v);
           Enumeration<Integer> e = v.elements();
           while (e.hasMoreElements()) {
               Integer i = e.nextElement();
               if (i % 2 == 0)
                   System.out.println(i);
           }
           System.out.println(v);
       }
   }
   