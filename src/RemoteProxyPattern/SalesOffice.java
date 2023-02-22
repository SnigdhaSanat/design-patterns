package RemoteProxyPattern;

public class SalesOffice implements SalesOfficeRemote {
	/*UnicastRemoteObject generates a dynamic stub, that takes request from the client, and passes it on to this remote object 'SalesOffice'*/
	//private static final long serialVersionUID=2L;



//	public SalesOffice() throws RemoteException {
//	}

	double quote=100000;

	@Override
	public void showCatalog() {
	System.out.println("showCatalog() called in remote");
	}

	@Override
	public double provideQuote(){
		System.out.println("provideQuote() called in remote");
		return this.quote;
	}

	@Override
	public void sell() {
		System.out.println("sell() called in remote");
	}

	@Override
	public void providePostSalesService()  {
		System.out.println("providePostSalesService() called in remote");
	}
}
