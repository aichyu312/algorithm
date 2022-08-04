import java.util.Scanner;

public class q9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();

            String[] arr = str.split(" ");

            for (int j = 0; j < arr.length; j++) {

                if (j == arr.length - 1) {
                    System.out.println(new StringBuilder(arr[j]).reverse());
                } else {
                    System.out.print(new StringBuilder(arr[j]).reverse() + " ");
                }
            }
        }


    }
}

