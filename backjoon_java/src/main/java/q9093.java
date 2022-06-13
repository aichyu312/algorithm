import java.util.Scanner;

public class q9093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i <= T; i++) {
            String str = sc.nextLine();
            String reverse = "";

            String[] arr = str.split(" ");
            for (int j = 0; j < arr.length; j++) {

            }



            for (int j = str.length()-1; j >= 0; j--) {
                reverse = reverse + str.charAt(j);
            }
            String[] arr = reverse.split(" ");
            for (int j = arr.length-1; j >= 0; j--) {

                if(j != 0){
                    System.out.print(arr[j]+" ");
                } else {
                    System.out.print(arr[j]);
                }
            }
        }
    }
}
