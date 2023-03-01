package ProtectionProxyPattern.Proxy;

import ProtectionProxyPattern.Beans.HotelPerson;
import ProtectionProxyPattern.InvocationHandler.HotelGuestInvocationHandler;
import java.lang.reflect.Proxy;

public class HotelGuestProxy {
	public static HotelPerson getHotelGuestProxy(HotelPerson hotelPerson){
		//pass the HotelGuestInvocationHandler class, and the class and interfaces of the hotelPerson interface
		return (HotelPerson) Proxy.newProxyInstance(hotelPerson.getClass().getClassLoader(),hotelPerson.getClass().getInterfaces(),new HotelGuestInvocationHandler(hotelPerson));
	}
}
