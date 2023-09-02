public class Main {

    public static void main(String[] args) {

        Shape square = new Square(5,10, 15);
        Shape circle = new Circle(15, 20, 7);
        Shape rhombus = new Rhombus(-10, 5, 8, 6);
        Shape triangle = new Triangle(25,-15,3,4,5);
        Text description = new Text(0,0);


        description.insertText("Hi, this is my first Java OOP project!");
        description.printText();
        System.out.println();
        System.out.println("circle.getName() = " + circle.getName());
        System.out.println("circle.calculateArea() = " + circle.calculateArea());
        System.out.println();
        System.out.println("rhombus.getName() = " + rhombus.getName());
        System.out.println("rhombus.calculateArea() = " + rhombus.calculateArea());
        System.out.println();
        System.out.println("triangle.getName() = " + triangle.getName());
        System.out.println("triangle.calculateArea() = " + triangle.calculateArea());
    }

}
