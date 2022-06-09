import java.io.*;

public class q2775 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[][] apart = new int[15][15];

        for (int i = 0; i < 15; i++) {
            apart[i][1] = 1;
            apart[0][i] = i;
        }

        for (int k = 1; k < 15; k++) {
            for (int n = 2; n < 15; n++) {
                apart[k][n] = apart[k][n-1]+apart[k-1][n];
            }
        }
        for (int i = 0; i < T; i++) {

            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());

            bw.write(apart[K][N] + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
