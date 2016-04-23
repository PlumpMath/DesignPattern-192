import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Admin proxy = getAdminProxy();
        Context.setRole("administrator");
        proxy.setPassword("123");
        Context.setRole("guest");
        proxy.setPassword("456");
    }

    private static Admin getAdminProxy() {
        Admin admin = new AdminBean();
        return (Admin) Proxy.newProxyInstance(admin.getClass().getClassLoader(), admin.getClass().getInterfaces(), new AdminInvocationHandler(admin));
    }

}
