import java.util.Scanner;

public class q4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        for (int i = 0; i < C; i++) {

            int students = sc.nextInt();
            int score = 0;
            int scoreSum = 0;
            int avg = 0;
            int cnt = 0;
            int[] arr = new int[students];

            for (int j = 0; j < students; j++) {
                score = sc.nextInt();
                arr[j] = score;
                scoreSum += score;
            }

            for (int j = 0; j < students; j++) {
                avg = scoreSum/students;
                if (arr[j] > avg) {
                    cnt++;
                }
            }

            double result = (double) cnt/students;
            System.out.println(String.format("%.3f", result*100) + "%");
        }
    }
}
