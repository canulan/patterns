package observer.fault;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ender on 20/01/15.
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("C");
        strings.add("D");
        strings.add("A");
        strings.add("Z");
        strings.add("B");
        Collections.sort(strings);
        System.out.println(strings);
    }

}
