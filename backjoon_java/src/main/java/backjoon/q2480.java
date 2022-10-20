package backjoon;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int cnt = 1;

        for (int i = 0; i < 3; i++) {
            int dice = sc.nextInt();
            arr[i] = dice;
        }
        Arrays.sort(arr);

        for (int i = 0; i < 2; i++) {
            if (arr[i] == arr[i + 1]) {
                cnt++;
            }
        }

        switch (cnt) {
            case 3:
                System.out.println(10000 + arr[0] * 1000);
                break;
            case 2:
                System.out.println(1000 + arr[1] * 100);
                break;
            case 1:
                System.out.println(arr[2] * 100);
                break;
        }
    }

}