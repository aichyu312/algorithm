package backjoon;

import java.util.Scanner;

public class q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        String result = String.valueOf(A*B*C);


        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < result.length(); j++) {
                if (i == result.charAt(j) - '0') {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
