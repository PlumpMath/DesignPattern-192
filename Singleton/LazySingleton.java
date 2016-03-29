public class LazySingleton {

    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        // double-checked locking
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    } 

}
