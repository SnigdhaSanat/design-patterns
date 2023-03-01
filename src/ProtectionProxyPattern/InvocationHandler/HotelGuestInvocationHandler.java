package ProtectionProxyPattern.InvocationHandler;

import ProtectionProxyPattern.Beans.HotelPerson;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HotelGuestInvocationHandler implements InvocationHandler {
	HotelPerson hotelPerson;

	//get the HotelPerson interface in its constructor
	public HotelGuestInvocationHandler(HotelPerson hotelPerson){
		this.hotelPerson=hotelPerson;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try{
			String methodName=method.getName();
			switch(methodName) {
				case "checkIn":
				case "checkOut":
				case "rate":
					//invoke the method that was called on the proxy, but on the CONCRETE hotelPerson
					return method.invoke(hotelPerson,args);

				case "accessKitchen":
				case "AccessMonitorRoom":
				//default:
					throw new IllegalAccessException();

			}//switch
		}
		catch (InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}//invoke
}
