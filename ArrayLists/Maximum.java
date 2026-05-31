import java.util.*;
public class Maximum {
    public static void main(String args[]){
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(32);
        list.add(3);
        list.add(41);
        list.add(35);
        // Finding the maximum element in the ArrayList
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i)); // Math.max(a,b) returns the maximum of a and b
        }
        System.out.println("Maximum value in the ArrayList: " + max);

    }
}
