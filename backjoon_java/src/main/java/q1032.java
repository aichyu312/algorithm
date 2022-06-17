import java.util.Scanner;

public class q1032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        StringBuilder sb = new StringBuilder();
        boolean chk = true;
        for (int i = 0; i < arr[0].length(); i++) {
            char c = arr[0].charAt(i);

            chk = true;
            for (int j = 1; j < N; j++) {
                if (c != arr[j].charAt(i)) {
                    chk = false;
                    break;
                }
            }
            if (chk) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.println(sb.toString());
    }
}
