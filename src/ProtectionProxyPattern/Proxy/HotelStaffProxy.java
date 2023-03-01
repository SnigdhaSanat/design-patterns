package ProtectionProxyPattern.Proxy;

import ProtectionProxyPattern.Beans.HotelPerson;
import ProtectionProxyPattern.InvocationHandler.HotelStaffInvocationHandler;
import java.lang.reflect.Proxy;

public class HotelStaffProxy {
	public static HotelPerson getHotelStaffProxy(HotelPerson hotelPerson){
		//pass the HotelStaffInvocationHandler class, and the class and interfaces of the hotelPerson interface
		return (HotelPerson) Proxy.newProxyInstance(hotelPerson.getClass().getClassLoader(),hotelPerson.getClass().getInterfaces(),new HotelStaffInvocationHandler(hotelPerson));
	}
}
