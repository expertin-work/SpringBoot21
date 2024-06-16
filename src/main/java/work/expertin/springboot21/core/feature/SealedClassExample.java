package work.expertin.springboot21.core.feature;

public class SealedClassExample {

    public sealed static class Shape permits Circle, Rectangle {}

    static final class Circle extends Shape {
        double radius;
        Circle(double radius) {
            this.radius = radius;
        }
    }

    static final class Rectangle extends Shape {
        double length , breadth;
        Rectangle(double length , double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        public String toString() {
            return "length: " + length + ", breadth: " + breadth;
        }
    }

    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4,6);
        System.out.println(shape1);
        System.out.println(shape2);
    }
}
