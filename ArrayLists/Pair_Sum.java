//Two pointer approach
//Sorted array 
import java.util.*;
public class Pair_Sum {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        // taking two point one first element and other at last
        int lp=0, rp=list.size()-1;
        // looping utill they become same
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target)
                return true;
            // since less that target moving the lower element beacuse it depends on lower one
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the targeted sum: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairSum(list,n));
        
    }
}
