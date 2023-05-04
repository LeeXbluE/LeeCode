package com.leex.alg.BM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author 李翔
 * @date 2023/5/4
 * @description
 */
public class L451_FrequencySort {


    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char aChar : chars) {
            charFrequencyMap.put(aChar, charFrequencyMap.getOrDefault(aChar, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        priorityQueue.addAll(charFrequencyMap.entrySet());
        int size = priorityQueue.size();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            Map.Entry<Character, Integer> poll = priorityQueue.poll();
            for (int j = 0; j < poll.getValue(); j++) {
                result.append(poll.getKey());
            }
        }
        return result.toString();
    }


   /* public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> list = new ArrayList<Character>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < map.get(list.get(i)); j++){
                res.append(list.get(i));
            }
        }
        return res.toString();
    }*/
}
