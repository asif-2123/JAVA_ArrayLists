import java.util.*;
public class Swap {
    public static void swap(int idx1, int idx2, ArrayList<Integer> list){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before swapping: " + list);
        swap(1, 3, list); // This will swap the elements at index 1 and index 3
        System.out.println("After swapping: " + list);
    }
}
