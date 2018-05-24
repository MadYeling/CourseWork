package testing;

import java.util.ArrayList;
import java.util.Iterator;

public class Lists {
    public static void main(String[] args) {
        Worker worker1 = new Worker("zhang3", 18, 3000);
        Worker worker2 = new Worker("li4", 25, 3500);
        Worker worker3 = new Worker("wang5", 22, 3200);

        ArrayList<Worker> al = new ArrayList<>();
        al.add(worker1);
        al.add(worker2);
        al.add(worker3);

        Worker worker4 = new Worker("zhao5", 24, 3300);
        al.add(1, worker4);

        al.remove(worker3);

        for (Object obj : al)
            System.out.println(obj.toString());


        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());

    }
}
