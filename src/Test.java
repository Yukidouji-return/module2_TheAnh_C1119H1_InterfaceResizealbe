public class Test {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        Circle circle = new Circle(1);
        Square square = new Square(2);
        Rectangle rectangle = new Rectangle(5,6);
        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;
        System.out.println("before: ");
        for (Resizeable shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("after: ");
        for (Resizeable shape : shapes) {
            shape.resize((Math.random() * 100) + 1);
            System.out.println(shape);
        }


    }
}
