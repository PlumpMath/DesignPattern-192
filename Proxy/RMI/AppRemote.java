import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AppRemote extends Remote {

    String invoke() throws RemoteException;

}
