package RemoteProxyPattern;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import RemoteProxyPattern.SalesOfficeRemote;

public class RemoteProgram extends SalesOffice {
	public RemoteProgram(){ }

	public static void main(String[] args) {

		try{
			SalesOffice salesOffice=new SalesOffice();

			//Note that we add the impl object here, and cast it to type of the interface
			SalesOfficeRemote salesOfficeRemote=(SalesOfficeRemote)UnicastRemoteObject.exportObject(salesOffice,0);

			/*binds salesOffice to mySalesOffice. "mySalesOffice" is the name that will be used to look up in the rmi registry*/

			/*rmiregistry has to be started from the same folder containing the classes, in this case src folder. It is also the folder from where
			* the RemoteProgram and LocalClient are run*/
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("mySalesOffice", salesOfficeRemote);
			System.err.println("RemoteProgram Server is ready");
		}
		catch (Exception e) {
			System.err.println("RemoteProgram Server exception:"+e.toString());
			e.printStackTrace();
		}


	}//main
}
