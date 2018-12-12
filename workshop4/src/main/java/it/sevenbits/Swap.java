package it.sevenbits;

import java.util.*;

public class Swap {
    public List<String> doSwap(final List<String> list) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String str;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            hashMap.put(str.charAt(0), i);
            if (hashMap.containsKey(str.charAt(0))) {
                if (hashMap.get(str.charAt(0)) != -1) {
                    Collections.swap(list, list.get(i).indexOf(str), i);
                    hashMap.put(str.charAt(0), -1);
                }
            }
        }
        System.out.println(hashMap);
        return list;
    }
}

