package q04_599;

import java.util.Arrays;


// Minimum Index Sum of Two Lists
// https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(
            Arrays.toString(solution.findRestaurant(list1, list2))
        );
    }
}