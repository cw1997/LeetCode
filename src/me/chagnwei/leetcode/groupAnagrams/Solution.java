package me.chagnwei.leetcode.groupAnagrams;

import java.util.*;

/**
 * @author cw1997 <867597730@qq.com>
 * @file null.java
 * @date 2020/9/10 20:19
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(new Solution().groupAnagrams(new String[]{"ddddddddddg","dgggggggggg"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length);
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String s = Arrays.toString(ca);
            if (map.containsKey(s)) {
                map.get(s).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s, list);
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }

    private static Set<Character> strToCharSet(String str) {
        char[] ca = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c: ca) {
            set.add(c);
        }
        return set;
    }

    private static Set<Character> checkExist(Set<Set<Character>> setSet, String str) {
        char[] ca = str.toCharArray();
        for (Set<Character> set: setSet) {
            if (checkExistInSet(set, ca)) {
                return set;
            }
        }
        return null;
    }

    private static boolean checkExistInSet(Set<Character> set, char[] ca) {
        for (char c: ca) {
            set.remove(c);
        }
        return set.isEmpty();
    }
}
