package backjoon;

import java.util.Scanner;

public class q2947 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean chk = true;
        while (chk) {
            chk = false;
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    chk = true;
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
                }
            }

        }

    }
}




