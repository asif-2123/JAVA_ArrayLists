import java.util.*;
public class Beautiful {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add even numbers
        for (int i = 2; i <= n; i += 2) {
            list.add(i);
        }
        // Add odd numbers
        for (int i = 1; i <= n; i += 2) {
            list.add(i);
        }
        // Check if the array is beautiful
        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i) + list.get(i + 2) == 2 * list.get(i + 1)) {
                int temp = list.get(i + 1);
                list.set(i+1,list.get(i+2));
                list.set(i+2,temp);
            }
        }
        return list;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(beautifulArray(n));
    }
}