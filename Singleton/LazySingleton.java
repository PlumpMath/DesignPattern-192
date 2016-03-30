public class LazySingleton {

    private volatile static LazySingleton instance;

    // Note: It is not thread-safe if not using the 'volatile' keyword. The problem is a thread could read a partially constructed instance, while another thread is constructing the instance. It is because of the reordering of cpu instructions, there could be a chance that the writing thread set the reference before initiating the new instance.
    // volatile guarantees the write happens before the read.
    // See section 16.2.4 of the "Java Concurrency In Practice" book.

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
