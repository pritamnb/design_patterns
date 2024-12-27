package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleInstance = Singleton.getInstance();
//        Singleton singleton = new Singleton();
        Singleton singletonInstance2 = Singleton.getInstance();

        System.out.println("singleton one = two " + (singleInstance == singletonInstance2));// returns true

        // Reflection
        // 1. Access class
        Class <Singleton> singletonClass = Singleton.class;
        //  other ways to get class
            // 1.1 Class.forname // nothing but Class loading
            // 1.2 object.getClass
        // 2. fetch constructor
        Constructor<Singleton> singletonConstructor = singletonClass.getDeclaredConstructor();
        // 3. Accessible (changed access specifier)
        singletonConstructor.setAccessible(true);
        // 4. create new instance
        Singleton singletonInstance3 = singletonConstructor.newInstance(null);
        // check newly created instance
        System.out.println("singleton one = three " + (singleInstance == singletonInstance3));// returns false
        // returned false means the singleton pattern is broken
    }
}
