package interfacelearning;

public class Rectangle implements Geometry {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double countArea() {
        return height * width;
    }

    @Override
    public double countPerimeter() {
        return height * 2 + width * 2;
    }
}
