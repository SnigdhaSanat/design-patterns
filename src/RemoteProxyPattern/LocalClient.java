package RemoteProxyPattern;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class LocalClient {
	public LocalClient(){}

	public static void main(String[] args)   {
		try{

			Registry registry = LocateRegistry.getRegistry(null);
			//Note that the return type is of type interface SalesOfficeRemote
			SalesOfficeRemote salesOfficeRemoteProxy = (SalesOfficeRemote) registry.lookup("mySalesOffice");

			LocalOffice localOffice=new LocalOffice(salesOfficeRemoteProxy);

			localOffice.showCatalogLocal();
			localOffice.provideQuoteLocal();
			localOffice.sellLocal();
			localOffice.providePostSalesServiceLocal();
		}
		catch(Exception e){
			System.err.println("Client exception:"+e.toString());
			e.printStackTrace();
		}

	}



}
