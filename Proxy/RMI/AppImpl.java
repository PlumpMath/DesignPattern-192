import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AppImpl extends UnicastRemoteObject implements AppRemote {

    public AppImpl() throws RemoteException {
    }

    public String invoke() {
        return "SUCCESSFUL";
    }

}
