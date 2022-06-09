import java.util.Scanner;

public class q2798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        int cardnum[] = new int[n];
        int totalnum, result = 0;

        for (int a = 0; a < n; a++){
            cardnum[a] = sc.nextInt();
        }

        for (int i = 0; i < cardnum.length-2; i++ ) {
            for (int j = i+1; j < cardnum.length-1; j++){
                for (int k = j+1; k < cardnum.length; k++) {
                    totalnum = cardnum[i] + cardnum[j] + cardnum[k];
                    if (totalnum > result && totalnum <= m) {
                        result= totalnum;
                    }
                    if (totalnum == m) {
                        break;
                    }
                }
            }
        }
        System.out.println(result);

        sc.close();

    }

}
