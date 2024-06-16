package work.expertin.springboot21.core.feature;

public class RecordsExample {

    public record Point(int x, int y) {}
    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println(point.x);
        System.out.println(point.y());
        System.out.println(point);

    }
}
