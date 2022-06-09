import java.util.Scanner;

public class q21312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;

        switch (A%2) {
            case 1: a = A;
            break;
            case 0:
            break;
        }
        switch (B%2) {
            case 1: b = B;
            break;
            case 0:
            break;
        }
        switch (C%2) {
            case 1: c = C;
            case 0:
            break;
        }
        if (A%2 == 0 && B%2 ==0 && C%2 ==0){
            a = A;
            b = B;
            c = C;
        }
        System.out.println(a*b*c);
    }
}
