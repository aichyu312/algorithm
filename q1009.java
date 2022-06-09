import java.util.Scanner;

public class q1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int target = 1;

            for (int j = 0; j < b; j++) {
                target = target*a % 10;
            }

            if(target == 0) {
                System.out.println(10);
            } else {
                System.out.println(target);
            }

        }

    }
}
