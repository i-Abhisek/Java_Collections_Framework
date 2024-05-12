import java.util.*;

class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            l.add(i);
        }
        System.out.println(l); // Printing the original list
        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            Integer I = itr.next();
            if(I % 2 == 0) {
                System.out.println(I);
            } else {
                itr.remove(); // Removing odd numbers
            }
        }
        System.out.println(l); // Printing the modified list after removing odd numbers
    }
}
