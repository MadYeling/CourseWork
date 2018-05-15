package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class iter {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("黑楼");
        arrayList.add("黑骑");
        arrayList.add("黑暗剑");
        arrayList.add("21");
        arrayList.add("黑骑");
        arrayList.add("rua!");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }

        System.out.println();

        HashSet hashSet = new HashSet();
        hashSet.add("黑楼");
        hashSet.add("黑骑");
        hashSet.add("黑暗剑");
        hashSet.add("21");
        hashSet.add("黑骑");
        hashSet.add("rua!");

        for (Object obj : hashSet)
            System.out.println(obj);
    }
}
