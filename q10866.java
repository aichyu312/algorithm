import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class q10866 {
    public static void main(String[] args) throws IOException {
        Deque<String> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            switch (input[0]){
                case "push_front" :
                    deque.addFirst(input[1]);
                    break;
                case "push_back" :
                    deque.add(input[1]);
                    break;
                case "pop_front" :
                    if(deque.size() < 1){
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.pop() + "\n");
                    }
                    break;
                case "pop_back" :
                    if(deque.size() < 1) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.removeLast()+ "\n");
                    }
                    break;
                case "size" :
                    bw.write(deque.size()+"\n");
                    break;
                case "empty" :
                    if(deque.isEmpty()){
                        bw.write("1"+"\n");
                    } else {
                        bw.write("0"+"\n");
                    }
                    break;
                case "front" :
                    if(deque.size() < 1) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.getFirst() + "\n");
                    }
                    break;
                case "back" :
                    if(deque.size() < 1) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.getLast()+ "\n");
                    }
                    break;

            }
        }
        bw.flush();
        bw.close();

    }
}
