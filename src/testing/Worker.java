package testing;

public class Worker {
    private int age;
    private String name;
    private double salary;

    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " work");
    }

    public String toString() {
        return "Name:" + name + "\tAge:" + age + "\tSalary:" + salary;
    }
}
