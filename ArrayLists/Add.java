import java.util.ArrayList;

public class Add {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        
      
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        

        System.out.println(list.size());
        System.out.println(list.get(4));

        // Adding an element to the ArrayList at particular index
        // [.add(index, element)]
        list.add(2, 10); // Adds 10 at index 2
        System.out.println("List after adding element at index 2: " + list);
    }
}
