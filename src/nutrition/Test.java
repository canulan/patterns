package nutrition;

/**
 * Created by ender on 21/01/15.
 */
public class Test {

    public static void mainStrTest(String[] args) {

        String sx1 = new String("X");
        String sx2 = new String("X");

        System.out.println(sx1 == sx2);

        String s1 = "X";
        String s2 = "X";

        System.out.println(s1 == s2);

    }


    public static void main(String[] args) {
        String s = new StringBuilder("First")//
                .append("asdasd")//
                .append("asdasdasasdas")//
                .append("xxx").toString();
    }

}
