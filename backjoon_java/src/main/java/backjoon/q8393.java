package backjoon;//www.acmicpc.net/problem/8393 성공

import java.util.Scanner;

public class q8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1;i <=N ; i++ ){
            sum += i;
        }
        System.out.println(sum);


    }
}