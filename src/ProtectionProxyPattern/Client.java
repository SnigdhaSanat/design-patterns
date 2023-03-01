package ProtectionProxyPattern;

import ProtectionProxyPattern.Beans.HotelPerson;
import ProtectionProxyPattern.Beans.HotelPersonImpl;
import ProtectionProxyPattern.Proxy.HotelGuestProxy;
import ProtectionProxyPattern.Proxy.HotelStaffProxy;

public class Client {
	public static void main(String[] args) {
		HotelPerson hotelPerson=new HotelPersonImpl();

		HotelPerson hotelStaffProxy= HotelStaffProxy.getHotelStaffProxy(hotelPerson);
		System.out.println("Created hotel staff proxy");
		System.out.println();

		System.out.println("Hotel staff trying to access kitchen");
		hotelStaffProxy.accessKitchen();

		System.out.println("Hotel staff trying to access the monitor room");
		hotelStaffProxy.AccessMonitorRoom();

		System.out.println("Hotel staff trying to check in");
		hotelStaffProxy.checkIn();

		System.out.println("Hotel staff trying to check out");
		hotelStaffProxy.checkOut();

		System.out.println("Hotel staff trying to rate the hotel");
		hotelStaffProxy.rate();

		System.out.println("-------------------------------");

		HotelPerson hotelGuestProxy= HotelGuestProxy.getHotelGuestProxy(hotelPerson);
		System.out.println("Created hotel guest proxy");
		System.out.println();

		System.out.println("Hotel guest trying to access kitchen");
		hotelGuestProxy.accessKitchen();

		System.out.println("Hotel guest trying to access the monitor room");
		hotelGuestProxy.AccessMonitorRoom();

		System.out.println("Hotel guest trying to check in");
		hotelGuestProxy.checkIn();

		System.out.println("Hotel guest trying to check out");
		hotelGuestProxy.checkOut();

		System.out.println("Hotel guest trying to rate the hotel");
		hotelGuestProxy.rate();

	}//main
}
