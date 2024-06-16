package work.expertin.springboot21.core.feature;

/**
 * since JDK 13
 */
public class TextBlockExample {

    public static void main(String[] args) {
        String textBlock = """
                111   123
                222
                333
                """;
        System.out.println(textBlock);
    }
}
