package backjoon;//https://www.acmicpc.net/problem/15552 성공

import java.io.*;

public class q15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i< n;i++){
            String string = br.readLine();
            int a = Integer.parseInt(string.split(" ")[0]);
            int b = Integer.parseInt(string.split(" ")[1]);
            bw.write(a+b+"\n");
        }
        bw.flush();
    }
}