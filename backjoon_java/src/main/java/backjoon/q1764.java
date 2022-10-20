package backjoon;

import java.io.*;
import java.util.*;

public class q1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 0;

        HashSet<String> arrN = new HashSet<>();
        for (int i = 0; i < N; i++) {
            arrN.add(br.readLine());
        }
        String[] arrM = new String[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = br.readLine();
        }
        ArrayList<String> arrNM = new ArrayList<>();

            for (int i = 0; i < M; i++) {
                if (arrN.contains(arrM[i])) {
                    arrNM.add(arrM[i]);
                    cnt++;
                }
            }

        Collections.sort(arrNM);
        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.println(arrNM.get(i));
        }
    }
}
