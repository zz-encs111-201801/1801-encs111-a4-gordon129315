package q04_599;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

// Minimum Index Sum of Two Lists
// https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        ListToMap(map1, list1);
        ListToMap(map2, list2);

        //find out common restaurants and their sum of index
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                int point = map1.get(key) + map2.get(key);
                map3.put(key, point);
            }
        }

        //find out the lowest sum of index
        LinkedList<Integer> points = new LinkedList<>();
        points.addAll(map3.values());
        Collections.sort(points);
        int lowest_sum = points.getFirst();

        //find out the restaurants which have the lowest_sum
        LinkedList<String> restaurants = new LinkedList<>();
        for (String key : map3.keySet()) {
            if (map3.get(key) == lowest_sum) {
                restaurants.add(key);
            }
        }
        String[] strings = restaurants.toArray(new String[restaurants.size()]);

        return strings;
    }

    public void ListToMap(HashMap<String, Integer> map, String[] list) {
        for (int i = 0; i < list.length; i++) {
            map.put(list[i], i);
        }
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