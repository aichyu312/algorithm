import java.util.Scanner;

public class q3034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int target = sc.nextInt();
            if(W*W+H*H >= target*target) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }

        }
    }
}
