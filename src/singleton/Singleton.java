package singleton;

public class Singleton {
    // a static member
    private static Singleton singleton = null;
    // constructor must be private, because no new instance should be created by any other person
    private Singleton() throws IllegalAccessException {
        if(singleton != null) throw new IllegalAccessException();
    }
    // Static method can only access static members
    // public because only this method is accessible to get instance
    public static Singleton getInstance() throws IllegalAccessException {
        // check if instance is already created
        if(singleton == null){
            singleton =  new Singleton();
        }
        return singleton;
    }

}
