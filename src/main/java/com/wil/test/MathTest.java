package com.wil.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

/**
 * Created by wil on 2017/11/5.
 */
public class MathTest {

    public static void main(String[] args) {

        int start = 0;
        int end = 0;
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "+");
        map.put(1, "-");
        map.put(2, "*");
        map.put(3, "/");
        HashSet<String> set = new HashSet<>();

        while (set.size() != 10) {
            start = new Random().nextInt(10);
            end = new Random().nextInt(10);
            String res = start + map.get(new Random().nextInt(4)) + end;
            if("/0".endsWith(res)) {
                continue;
            }
            set.add(res);
        }
        for (String s : set) {
            System.out.println(s);
        }

    }




}
