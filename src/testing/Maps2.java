package testing;

import java.util.HashMap;
import java.util.Map;

public class Maps2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");

        map.put("Allen", "JDBC");

        map.put("Lucy", "CoreJava");


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("教师：" + entry.getKey() + "\t教授课程：" + entry.getValue());
        }

        System.out.println();

        System.out.println("教JSP的教师有：");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals("JSP")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
