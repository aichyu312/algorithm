package programmers;

public class prog_120861 {
    class Solution {
        public int[] solution(String[] keyinput, int[] board) {
            int[] answer = {0,0};
            int xlim = board[0]/2;
            int ylim = board[1]/2;

            for (int i = 0; i < keyinput.length; i++) {
                switch (keyinput[i]) {
                    case "left":
                        if (answer[0] > -xlim) {
                            answer[0]--;
                        }
                    break;
                    case "right":
                        if (answer[0] < xlim) {
                            answer[0]++;
                        }
                    break;
                    case "up":
                        if (answer[1] < ylim) {
                            answer[1]++;
                        }
                    break;
                    case "down":
                        if (answer[1] > -ylim) {
                            answer[1]--;
                        }
                    break;
                }
            }
            return answer;
        }
    }
}
