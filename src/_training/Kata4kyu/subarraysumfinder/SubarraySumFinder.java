package _training.Kata4kyu.subarraysumfinder;

import java.util.*;

public class SubarraySumFinder {

    public static List<List<Integer>> findSubarraysWithSum(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            List<Integer> sub = new ArrayList<>();
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                sub.add(nums[end]);
                if (sum == targetSum) {
                    result.add(new ArrayList<>(sub));
                }
            }
        }

        return result;
    }
}

