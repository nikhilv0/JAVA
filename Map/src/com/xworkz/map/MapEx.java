package com.xworkz.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {


    Map<String,Integer[]> map=new HashMap<>();
    map.put("bahubali", new Integer[]{400, 600});
//    map.put("kgf",500);

        System.out.println(Arrays.toString(map.get("bahubali")));
    }
}
