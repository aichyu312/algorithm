package programmers;

public class prog_120905 {
    class Solution {
        public int[] solution(int n, int[] numlist) {
            int cnt = 0;
            int[] array = new int[numlist.length];
            for (int i = 0; i < numlist.length; i++) {
                if (numlist[i] % n == 0) {
                    array[cnt] = numlist[i];
                    cnt++;
                }
            }
            int[] answer = new int[cnt];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = array[i];
            }
            return answer;
        }
    }
}
