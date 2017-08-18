package pro.uhoh.com.design_pattern;

/**
 * Created by macmini1 on 8/9/17.
 */

public class ExampleSingleton {
    private static ExampleSingleton instance = null;
    private ExampleSingleton() {
        // customize if needed
    }
    public static ExampleSingleton getInstance() {
        if (instance == null) {
            instance = new ExampleSingleton();
        }
        return instance;
    }
}