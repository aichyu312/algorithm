import java.util.Scanner;

public class q2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int hour = A;
        int minute = B - 45;

        if (minute < 0) {
            minute = B + 60 - 45;
            hour = A - 1;
            if (hour < 0) {
                hour = 24 - 1;
            }
        }
        System.out.println(hour + " " + minute);
    }
}
