/* The Underline DataStructure is Hashtable
 * Duplicates are not allowed
 * Insertion order is not preserved
 * hetrogeneous 
 * null insertion
 * Serializable And Cloneable
 * Search:-"Best choice for if our Frequent operation is Search Operation"
 */

 // Constructor
 /* HashSet h = new HashSet();-------> Default 16
 fill Ratio : 0.75 // Load Factor
 
 HashSet h2 = new HashSet(int initialCapacity);

 HashSet h3 = new HashSet(int initialCapacity, float local factor);

 hashSet h4 = new HashSet(Collection c);
  * 
  */

  import java.util.*;

class LearnHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Object> h = new LinkedHashSet<>();
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null); // Note: "null" should be written without quotes to represent the null value.
        h.add(10);
        System.out.println(h.add("Z")); // Prints false because "Z" is already present in the set.
        System.out.println(h.add(h)); // Prints true because the set allows the addition of its own reference.
    }
}
