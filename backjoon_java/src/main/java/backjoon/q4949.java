package backjoon;

import java.util.Scanner;
import java.util.Stack;

public class q4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals(".")) {
                break;
            }
            Stack<String> stack = new Stack<>();
            String[] input = str.split("");

            for (String string : input) {
                if (string.equals("(") || string.equals("[")) {
                    stack.push(string);
                } else if (string.equals(")") && !stack.isEmpty() && stack.peek().equals("(")) {
                    stack.pop();
                } else if (string.equals("]") && !stack.isEmpty() && stack.peek().equals("[")) {
                    stack.pop();
                } else if (string.equals(")") || string.equals("]")) {
                    stack.push(string);
                }
            }

            if (stack.empty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
