//Two pointer approach 
import java.util.*;
public class Contained_water {
    public static int stored_water(ArrayList<Integer> height, int li , int ri){
        int max=0;
        // Till the two pointer become same
        while(li<ri){
            int width = ri-li;
            int ht = Math.min(height.get(li),height.get(ri));
            int area = width*ht;
            max=Math.max(max,area);
            // the one which is small is the one which make changes so we hv to move that
            if(height.get(li)<height.get(ri)){
                li++;
            }else {
                ri--;
            }
        }return max;
    }
    public static void main(String args[]){
        ArrayList<Integer> height =  new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(stored_water(height,0,height.size()-1));
    }
}
