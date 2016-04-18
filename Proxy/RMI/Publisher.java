import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class Publisher {

    public static void main(String[] args) {
        try {
            AppRemote app = new AppImpl();
            Naming.rebind("RemoteApp", app);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
