// https://www.acmicpc.net/problem/11637

import java.io.*;

public class q11637 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = T; i > 0; i--) {

            int maxValue = 0;
            int maxIndex = 0;
            int allVotes = 0;
            int votesCnt = 0;

            int n = Integer.parseInt(br.readLine());

            for(int j = 1; j <= n; j++){
                int nowValue = Integer.parseInt(br.readLine());
                allVotes += nowValue;

                if (nowValue > maxValue) {
                    maxValue = nowValue;
                    maxIndex = j;
                    votesCnt = 1;
                } else if (nowValue == maxValue){
                    votesCnt = votesCnt +1;
                }
            }
            if (votesCnt > 1) {
                bw.write("no winner" +"\n");

            }else if (allVotes/2 < maxValue) {
                bw.write("majority winner " +maxIndex+"\n");
            } else if(allVotes/2 >= maxValue){
                bw.write("minority winner " + maxIndex + "\n");
            }
            }bw.flush();

        }

    }
