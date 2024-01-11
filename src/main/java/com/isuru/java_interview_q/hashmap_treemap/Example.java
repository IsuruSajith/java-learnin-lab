package com.isuru.java_interview_q.hashmap_treemap;

import java.util.HashMap;
import java.util.Map;

public class Example {
    // difference between hashmap and treemap

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("isuru", 13231);
        hashMap.put("sajith", 13231);
        hashMap.put("isuru", 13230);
        System.out.println(hashMap);

    }


}
