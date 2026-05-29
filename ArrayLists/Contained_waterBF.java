// Brute Force approach to find the stored water
import java.util.*;
public class Contained_waterBF {
    public static int stored_water(ArrayList<Integer> height){
        int max = 0;    // To store the maximum area
        // Traversing the arraylist
        for(int i=0;i<height.size();i++){
            // For every element, we will find the area with every other element
            for(int j=i+1;j<height.size();j++){
                int width = j-i;     // Width is the distance between the two elements
                int ht =Math.min(height.get(i),height.get(j)); // Height is the minimum of the two elements
                int area=width*ht;   // Area is width*height
                max=Math.max(max, area);   // Update the maximum area if the current area is greater
            }
        }
        return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(stored_water(height));
    }
}
