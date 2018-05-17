package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(1, "张三");
        m.put(2, "李四");
        m.put(3, "王五");
        m.put(4, "张三");
        m.put(5, "赵鸡儿");

//        for (int i = 1; i <= m.size(); i++)
//            System.out.println(m.get(i));

//        System.out.println(m);

        Set s = m.keySet();
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            Object Key = iterator.next();
            Object value = m.get(Key);
            System.out.println(Key + "\t" + value);
        }

        System.out.println("=============分割线=============");

        Set es = m.entrySet();
        Iterator i = es.iterator();
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) (i.next());
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println("=============分割线=============");
    }
}
