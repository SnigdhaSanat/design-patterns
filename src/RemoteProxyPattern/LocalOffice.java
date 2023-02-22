package RemoteProxyPattern;

import java.rmi.RemoteException;

public class LocalOffice {
	SalesOfficeRemote salesOfficeRemote;
	public LocalOffice(SalesOfficeRemote salesOfficeRemote){
		this.salesOfficeRemote=salesOfficeRemote;
	}

	void showCatalogLocal() throws RemoteException{
		System.out.println("Calling showCatalog() from local");
		this.salesOfficeRemote.showCatalog();
	}
	double provideQuoteLocal() throws RemoteException{
		double quote=this.salesOfficeRemote.provideQuote();
		System.out.println("Calling provideQuote() from local");
		return quote;
	}


	void sellLocal() throws RemoteException {
		System.out.println("Calling sell() from local");
		this.salesOfficeRemote.sell();
	}

	void providePostSalesServiceLocal() throws RemoteException{
		System.out.println("Calling providePostSalesService() from local");
		this.salesOfficeRemote.providePostSalesService();
	}
}
