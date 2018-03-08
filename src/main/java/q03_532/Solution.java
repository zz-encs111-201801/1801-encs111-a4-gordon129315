package q03_532;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// K-diff Pairs in an Array
// https://leetcode.com/contest/leetcode-weekly-contest-22/problems/k-diff-pairs-in-an-array/

public class Solution {

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            map.put(key, 1 + map.getOrDefault(key, 0));
        }
        int cnt = 0;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        if (k == 0) {

            for (Map.Entry<Integer, Integer> entry: entries) {
                if (entry.getValue() > 1) {
                    cnt++;
                }
            }
            return cnt;
        }

        for (Map.Entry<Integer, Integer> entry: entries) {
            int target = entry.getKey() + k;
            if (map.containsKey(target)) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        System.out.println(solution.findPairs(nums, k));



    }

}
