import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class q9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            String vps = br.readLine();
            int length = vps.length();

            for (int j = 0; j < length; j++) {
                char ch = vps.charAt(j);

                if(ch == '(') {
                    stack.push(ch);
                } else {
                    if(stack.size() == 0) {
                        stack.push(ch);
                        break;
                    } else {
                        stack.pop();
                    }
                }

            }
            if(stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();

        }

    }
}

