import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.Naming;
import java.net.MalformedURLException;

public class Client {

    public static void main(String[] args) {
        try {
            AppRemote app = (AppRemote) Naming.lookup("rmi://" + args[0] + "/RemoteApp");
            System.out.println(app.invoke());
        } catch (RemoteException | NotBoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
