package day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 32);
        person1.put("job_title", "Developer");
        person1.put("salary", 100000.5);
        person1.put("hired_date", LocalDate.of(2021, 1, 15));
        person1.put("married", true);
        System.out.println(person1);


        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("name", "Nora");
        person2.put("gender", 'F');
        person2.put("age", 32);
        person2.put("job_title", "Backend Developer");
        person2.put("salary", 90000.5);
        person2.put("hired_date", LocalDate.of(2022, 1, 15));
        person2.put("married", true);
        System.out.println(person2.get("name"));
        System.out.println(person2.get("job_title"));

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("name", "Cora");
        person3.put("gender", 'F');
        person3.put("age", 33);
        person3.put("job_title", "Frontend Developer");
        person3.put("salary", 910000.5);
        person3.put("hired_date", LocalDate.of(2022, 5, 15));
        person3.put("married", true);
        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("name", "Julia");
        person4.put("gender", 'F');
        person4.put("age", 22);
        person4.put("job_title", "Automation tester");
        person4.put("salary", 80000.5);
        person4.put("hired_date", LocalDate.of(2022, 6, 15));
        person4.put("married", true);
        Map<String, Object> person5 = new LinkedHashMap<>();
        person5.put("name", "Mike");
        person5.put("gender", 'M');
        person5.put("age", 32);
        person5.put("job_title", "Backend Developer");
        person5.put("salary", 120000.5);
        person5.put("hired_date", LocalDate.of(2021, 8, 15));
        person5.put("married", false);

        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person2);
        System.out.println(listOfMaps);
        listOfMaps.addAll(Arrays.asList(person3, person4, person5));

        System.out.println("--------------Iterating each map---------------");
        System.out.println(listOfMaps);
        for (Map<String, Object> eachMap : listOfMaps) {
            System.out.println(eachMap);
        }
        System.out.println("--------------Iterating each map with each pair---------------");
        for (Map<String, Object> eachMap : listOfMaps) {
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }
        System.out.println("------display the names of the employee who are hired this year (2022)-----");

        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("hired_date")) {
                    if (((LocalDate) eachEntry.getValue()).getYear() == 2022) {
                        System.out.println(eachMap.get("name"));
                    }
                }
            }

        }


        System.out.println("-----------------------------------------");

        listOfMaps.get(0).replace("name","Vasil");

        System.out.println(listOfMaps);

        listOfMaps.get(listOfMaps.size()-1).replace("salary",((Double)listOfMaps.get(listOfMaps.size()-1).get("salary"))+50000);

        listOfMaps.get(1).replace("age",((Integer)listOfMaps.get(1).get("age"))+4);
        System.out.println(listOfMaps);


        Map<String,Object> car1=new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("Model","X5");
        car1.put("Year",2021);
        car1.put("color","Red");
        car1.put("price",45000.5);
        Map<String,Object> car2=new LinkedHashMap<>();
        car2.put("brand","BMW");
        car2.put("Model","X5");
        car2.put("Year",2021);
        car2.put("color","Red");
        car2.put("price",45000.5);
        Map<String,Object> car3=new LinkedHashMap<>();
        Map<String,Object> car4=new LinkedHashMap<>();


        List<Map<String,Object>>cars=new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3,car4));


    }
}

