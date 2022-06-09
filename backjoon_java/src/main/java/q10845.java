//https://www.acmicpc.net/problem/10845 성공


import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class q10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int last = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");


            switch (input[0]) {
                case "push":
                    last = Integer.parseInt(input[1]);
                    queue.add(Integer.parseInt(input[1]));
                    break;
                case  "pop":
                    if(queue.size() < 1){
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(queue.poll()+"\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()){
                        bw.write("1"+"\n");
                    } else {
                        bw.write("0"+"\n");
                    }
                    break;
                case "front":
                    if(queue.size() < 1){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(queue.peek()+"\n");
                    }
                    break;
                case "back":
                    if(queue.size() < 1){
                        bw.write("-1"+"\n");
                    } else {
                        bw.write(last+"\n");
                    }
                    break;

            }
        }
        bw.flush();
        bw.close();


    }
}