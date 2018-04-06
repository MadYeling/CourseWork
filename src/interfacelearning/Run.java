package interfacelearning;

public class Run {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(12, 16);

        System.out.println("圆面积为：" + circle.countArea());
        System.out.println("圆周长为：" + circle.countPerimeter());
        System.out.println("矩形面积为：" + rectangle.countArea());
        System.out.println("矩形周长为：" + rectangle.countPerimeter());
    }
}
