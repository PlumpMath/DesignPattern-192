// Better solution
public class LazySingletonViaInnerStaticClass {

    private LazySingletonViaInnerStaticClass() {
    }

    public static LazySingletonViaInnerStaticClass getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        public static LazySingletonViaInnerStaticClass instance = new LazySingletonViaInnerStaticClass();
    }

}

