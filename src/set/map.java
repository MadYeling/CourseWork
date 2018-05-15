package set;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(1, "张三");
        m.put(2, "李四");
        m.put(3, "王五");

        System.out.println(m.get(1));
    }
}
