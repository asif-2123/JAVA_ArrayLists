import java.util.*;
public class Set {
    public static void main (String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Previous list " +list);
// Set the element at index 2 to 10  [.set(index, element)]
        list.set(2,10); 
        System.out.println("New list " +list);
    }
}
