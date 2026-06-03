//Two pointer approach
//Sorted and rotated array 
import java.util.*;
public class PairSum_rotated {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        // finding the break point(smaller element)
        int bp=-1;int k=list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i; // break point is the index of larger element
                break;  // if there is no break point then it is not rotated and we can apply normal two pointer approach
            }
        }
    
        int lp=bp+1;int rp=bp; 
        // looping until they become same
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp-1)%k;  // lp-1 because we are moving in clockwise direction and %k because we have to come back to the start if we reach the end
            }else{
                rp=(k-1+rp)%k;  
            }
        } return false;    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the targeted sum: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum(list,n));
        
    }
}
