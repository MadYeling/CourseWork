package set;

import java.util.ArrayList;
import java.util.ListIterator;

public class name {
    public static void main(String[] args) {
        names names1 = new names("f1", "l1");
        names names2 = new names("f2", "l2");
        names names3 = new names("f3", "l3");
        names names4 = new names("f4", "l4");

        ArrayList al = new ArrayList();
        al.add(names1);
        al.add(names2);
        al.add(names3);
        al.add(names4);

//        for (int i = 0; i < al.size(); i++)
//        System.out.println(al.toString());

//        ListIterator ll = al.listIterator();
//        while (ll.hasNext())
//            System.out.println(ll.next());

        for (Object obj : al)
            System.out.println(obj);
    }

}

class names {
    private String firstName, lastName;

    public names(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "First name:" + firstName + "  Last  name:" + lastName;
    }
}