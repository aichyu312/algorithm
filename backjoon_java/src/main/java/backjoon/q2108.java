package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class q2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        double sum = 0;
        double avg;
        int mid;
        int range;
        int count = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        int mode = arr[0];
        int max = -1;
        boolean check = false;

        for (int i = 0; i < N - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
                mode = arr[i];
                check = true;
            } else if (max == count && check) {
                mode = arr[i];
                check = false;
            }
        }
        avg = sum / N;
        mid = N / 2;
        range = arr[0] - arr[N-1];

        System.out.println(Math.round(avg));
        System.out.println(arr[mid]);
        System.out.println(mode);
        System.out.println(Math.abs(range));

    }
}
