package programmers;

import java.util.HashSet;

public class prog_1845 {
    public int solution(int[] nums) {
        int max = nums.length / 2;

        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        if (numsSet.size() > max) {
            return max;
        } else {
            return numsSet.size();
        }
    }
}
