public class Square  implements Resizeable {
    private double side = 1;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }
    @Override
    public String toString() {
        return "A square with radius="
                + this.side;
    }
    @Override
    public void resize(double percent) {
        this.side =this.side+ ( this.side /100 * percent);
    }
}