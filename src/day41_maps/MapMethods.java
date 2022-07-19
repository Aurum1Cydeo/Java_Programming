package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("C03", "Nora");
        map.put("C05", "Kora");
        map.put("C06", "Lora");
        map.put("C07", "Aaron");
        map.put("C08", "Aaron");
        map.put("C09", "Aaron");
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("C09"));
        map.put("C07", "Lucy");
        System.out.println(map);

        map.put("C09", "Madiyar");
        System.out.println(map);
        System.out.println(map.get("C06"));
        map.replace("C06","Aseel");
        System.out.println(map);




        map.remove("C09");
        System.out.println(map);
        System.out.println("------------------");
        System.out.println(map.containsKey("C08"));//true
        System.out.println(map.containsKey("C09"));//false

        System.out.println("------------------");
        System.out.println(map.containsValue("Lucy"));//true
        System.out.println(map.containsValue("Sergiy"));//false

        System.out.println(map.isEmpty());//false because we have pairs
        System.out.println(map.equals(map));//it compares map with another map





    }
}
/*
pair: id -name
 */