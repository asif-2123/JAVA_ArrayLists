import java.util.*;
public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        
      
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // Removing an element from the ArrayList
        list.remove(2); // This will remove the element at index 2 (which is 3)
        System.out.println(list.get(2)); // This will print the element at index 2 (which is now 4)
    }
}
