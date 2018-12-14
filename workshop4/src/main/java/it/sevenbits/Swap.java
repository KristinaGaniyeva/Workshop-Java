package it.sevenbits;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class Swap
 */
public class Swap {
    /**
     * Class for swap element
     * @param list List
     * @return List
     */
    public List<String> doSwap(final List<String> list) {
        Map<Character, Integer> hashMap = new HashMap<>();
        String str;
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            hashMap.putIfAbsent(str.charAt(0), i);
            if (hashMap.containsKey(str.charAt(0))) {
                if (hashMap.get(str.charAt(0)) != -1 && i > hashMap.get(str.charAt(0))) {
                    Collections.swap(list, hashMap.get(str.charAt(0)), i);
                    hashMap.put(str.charAt(0), -1);
                }
            }
        }
        return list;
    }
}

