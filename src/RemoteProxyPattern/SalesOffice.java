package RemoteProxyPattern;

public class SalesOffice implements SalesOfficeRemote {

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
