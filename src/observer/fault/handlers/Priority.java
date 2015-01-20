package observer.fault.handlers;

/**
 * Created by ender on 20/01/15.
 */

public enum Priority {

    LOW {
        @Override
        public void method() {
            System.out.println("Low method");
        }
    }, MEDIUM, HIGH;

    public void method() {
        System.out.println("General method");
    }

    public static void main(String[] args) {

        for (Priority p : Priority.values()) {
            System.out.println(p.ordinal() + ":" + p.name());
        }

        Priority.LOW.method();
        Priority.MEDIUM.method();

    }


}
