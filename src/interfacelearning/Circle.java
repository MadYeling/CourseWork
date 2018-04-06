package interfacelearning;

public class Circle implements Geometry {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double countArea() {
        return pie * radius * radius;
    }

    @Override
    public double countPerimeter() {
        return 2 * pie * radius;
    }

}
