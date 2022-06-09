import java.util.Scanner;

public class q2753 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int leapYear = sc.nextInt();
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}