//Brute force approach
//Sorted array 
import java.util.*;
public class Pair_SumBF {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        //Iterating list holding a element then taking other and checking
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target)
                    return true;
            }
        } return false;
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
