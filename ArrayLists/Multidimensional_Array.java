import java.util.*;
public class Multidimensional_Array {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(5); list3.add(6);
        mainlist.add(list1); mainlist.add(list2); mainlist.add(list3);
        System.out.println(mainlist);
        System.out.println(mainlist.get(1));

        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j) + " ");
            }
        }

    }
}
