import java.util.Scanner;

public class q1110 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int cnt = 0;
        int cycle = N;

        while (true) {
            N=(N%10)*10+((N/10 + N%10)%10);
            cnt++;

            if (cycle==N){
                break;
            }

        }
        System.out.println(cnt);

    }
}