public class HomeTask1 {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(2, 9);
        System.out.println(rectangle.toString());


        Figure square = new Square(4);
        System.out.println(square.toString());

        Figure rhombus = new Rhombus(2, 10);
        System.out.println(rhombus.toString());

        Circle circle = new Circle(3);
        System.out.println(circle.toString());

        Figure triangle = new Triangle(2, 3, 4, 5);
        System.out.println(triangle.toString());


    }
}
