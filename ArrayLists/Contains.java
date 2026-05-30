import java.util.*;
public class Contains {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Check if an element is in the ArrayList
        
        System.out.println("Is 3 in the list? \n" + list.contains(3));
        System.out.println("Is 6 in the list? \n" + list.contains(6));
    }
}
