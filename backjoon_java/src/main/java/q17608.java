import java.util.ArrayList;
import java.util.Scanner;

public class q17608 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        int max = 0;

        int[] arr = new int[N];
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = N; i > 0; i--) {
            if (arr[i-1]>max) {
                max = arr[i-1];
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
