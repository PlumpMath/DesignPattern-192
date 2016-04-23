import java.lang.reflect.*;
import java.lang.IllegalAccessException;

public class AdminInvocationHandler implements InvocationHandler {

    private Admin admin;

    public AdminInvocationHandler(final Admin admin) {
        this.admin = admin;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        if(Context.getRole() != "administrator") {
            throw new IllegalAccessException("Permission Denied!");
        }
        try {
            return method.invoke(admin, args);
        } catch(IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
