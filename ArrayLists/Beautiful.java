import java.util.*;
public class Beautiful {
    public static void beautiful(ArrayList<Integer> list,int start,int increment,int n){
        if(start+increment>n){
            list.add(start);
            return;
        }
        beautiful(list,start,2*increment,n);
        beautiful(list,start+increment,2*increment,n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:\t");
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        beautiful(list, 1, 1, n);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }    
    }
}
