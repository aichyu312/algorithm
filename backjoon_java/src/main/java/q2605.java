import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q2605 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int line = sc.nextInt();
            arr.add(line,i);
        }
        Collections.reverse(arr);
        for (int i = 0; i < T; i++) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
