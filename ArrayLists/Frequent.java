import java.util.*;
public class Frequent {
    public static int countFrequency(ArrayList<Integer> list,int key){
        int arr[]=new int[100]; // assuming the elements are in the range of 0 to 99
        // counting the frequency of the elements that come after the key
        for(int i=0;i<list.size();i++){
            if (list.get(i)==key){
                arr[list.get(i+1)]++; // incrementing the frequency of the element that comes after the key
            }
        }
        // printing the frequency of the elements that come after the key
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                System.out.println(i + " -> " + arr[i]);
            }
        }
        int max=0 , freq=0;
        // finding the element that comes after the key with the maximum frequency
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                freq=i;
            }
        } return freq;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the key :\t");
        int key=sc.nextInt();
        ArrayList<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(20);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(countFrequency(list,key));
    }
}
