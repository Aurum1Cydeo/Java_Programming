package day41_maps;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {


        Map<String, Integer> hashMap = new HashMap<>();//the order is random/faster/accepts null key/key cannot be duplicated
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        //  hashMap.put("Daniel", 75000);
        // hashMap.put("Daniel", 85000);
        hashMap.put("Breanna", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 220000);
        System.out.println("hashMap =" + hashMap);
        System.out.println("------------------------------------");


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();//keeps insertion order/slower /accepts null key
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        //  linkedHashMap.put("Daniel", 75000);
        // linkedHashMap.put("Daniel", 85000);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 220000);
        System.out.println("linkedHashMap =" + linkedHashMap);
        System.out.println("------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>();//sorted Key by Ascending ASCII table order/does not accept null key
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        //  treeMap.put("Daniel", 75000);
        //treeMap.put("Daniel", 85000);
        treeMap.put("Breanna", null);//value can be null
        // treeMap.put(null,120000);//key cannot be null but
        //treeMap.put(null,220000);
        treeMap.put("Aaron", 85000);
        System.out.println("treeMap= " + treeMap);


        System.out.println("------------------------------------");
        Map<String, Integer> hashTable = new Hashtable<>();//has random order/ does not accept null key&value /Synchronized thread-safe(one thread at a time executed)
        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        //  hashTable.put("Daniel", 75000);
        // hashTable.put("Daniel", 85000);
        // hashTable.put("Breanna",null); value cannot be null
        try {
            hashTable.put("Diana", 120000); //key can not be null
    }catch (RuntimeException e){
            e.printStackTrace();
        }

        hashTable.put("Aaron",220000);
        System.out.println("hashTable="+hashTable);

    }
}
