package work.expertin.springboot21.core.feature;

import java.util.ArrayList;

/**
 * since JDK 10
 */
public class VarExample {

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        for (var item : list) {
            System.out.println(item);
        }
    }
}
