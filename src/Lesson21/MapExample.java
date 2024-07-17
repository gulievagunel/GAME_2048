package Lesson21;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
        public static void main(String[] args) {
            Map<String, Double> salaries = new HashMap<>();
            salaries.put("Tural", 2000.0);
            salaries.put("Arzu", 2500.0);

            Double salary = salaries.get("Arzu");
            System.out.println("Arzu's salary:" + salary);

            salaries.remove("Tural");

            System.out.println("Map size: " + salaries.size());

            for (Map.Entry<String, Double> entry : salaries.entrySet()) {
                System.out.println("Name: " + entry.getKey() + ", Salary: " + entry.getValue());
            }
        }
    }

