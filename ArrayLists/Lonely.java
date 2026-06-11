import java.util.*;
public class Lonely {
    public static List<Integer> lonely(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            boolean isLonely=true;
           //for previous element
            if(i>0 && 
                (list.get(i).equals(list.get(i-1))||list.get(i)-list.get(i-1)==1)){
                isLonely=false;
            }
            //for next element
            if(i<list.size()-1 && 
                (list.get(i).equals(list.get(i+1))||list.get(i+1)-list.get(i)==1)){
                isLonely=false;
            }
            // if it is lonely then add it to the new list
            if(isLonely){
            newList.add(list.get(i));
            }
        } return newList;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(2);
        System.out.println(lonely(list));
    }
}
