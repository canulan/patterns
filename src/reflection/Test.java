package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ender on 21/01/15.
 */
public class Test {

    public Test(String param) {

    }

    public static void staticMethod() {
        System.out.println("Static.");
    }

    public void instanceMethod() {
    }

    public void instanceMethod(String param) {
        System.out.println("Instance." + param);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Method instanceMethod = Test.class.getDeclaredMethod("instanceMethod", String.class);
        Constructor<Test> constructor = Test.class.getConstructor(String.class);
        Test test = constructor.newInstance("");
        // Test test = Test.class.newInstance();
        instanceMethod.invoke(test, "param");

        Method staticMethod = Test.class.getMethod("staticMethod");
        staticMethod.invoke(null);

    }

}
