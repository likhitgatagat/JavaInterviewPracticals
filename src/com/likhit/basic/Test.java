package com.likhit.basic;

import java.util.HashMap;
import java.util.TreeMap;

class Test {
    public static void main(String args[] ) throws Exception {
        HashMap<String,Integer> hash=new HashMap<String,Integer> ();
        hash.put("hack",1);
        hash.put("earth",1);
        System.out.println(hash);
        hash.clear();
        TreeMap <String,Integer> tm=new TreeMap <String,Integer> (hash);
        System.out.println(tm);
    }
}