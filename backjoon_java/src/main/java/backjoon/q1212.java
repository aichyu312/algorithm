package backjoon;

import java.util.Scanner;

public class q1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String[] arr = new String[a.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = String.valueOf(a.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            switch (arr[i]) {
                case "0" :
                    if (i == 0){
                        System.out.print("0");
                    } else {
                        System.out.print("000");
                    }
                    break;
                case "1" :
                    if (i == 0){
                        System.out.print("1");
                    } else {
                        System.out.print("001");
                    }
                    break;
                case "2" :
                    if (i == 0){
                        System.out.print("10");
                    } else {
                        System.out.print("010");
                    }
                    break;
                case "3" :
                    if (i == 0){
                        System.out.print("11");
                    } else {
                        System.out.print("011");
                    }
                    break;
                case "4" :
                    System.out.print("100");
                    break;
                case "5" :
                    System.out.print("101");
                    break;
                case "6" :
                    System.out.print("110");
                    break;
                case "7" :
                    System.out.print("111");
                    break;
            }

        }

    }
}

