package RemoteProxyPattern;

/*RMI or Remote Method Invocation is used to call methods on a object residing in another JVM*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SalesOfficeRemote extends Remote {
	/*The Remote interface makes the methods of the interface or the class implementing it remote, such that non-local objects can invoke them*/

	void showCatalog() throws RemoteException;
	double provideQuote() throws RemoteException;
	void sell() throws RemoteException;
	void providePostSalesService() throws RemoteException;
}
