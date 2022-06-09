//https://www.acmicpc.net/problem/13410


import java.util.Scanner;

public class q13410 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int cnt = 0;


        for (int i = 1; i < 10;i++){
            if (N%10 <10){
                N = N%10;
                System.out.println(N*i%10*10+N*i/10);
            }

        }


    }
}