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

		try{
			System.out.println("Hotel staff trying to access kitchen");
			hotelStaffProxy.accessKitchen();
		}
		catch (Exception e){
			System.out.println("Hotel staff cannot access kitchen");
		}
		try{
			System.out.println("Hotel staff trying to access the monitor room");
			hotelStaffProxy.AccessMonitorRoom();
		}
		catch (Exception e){
			System.out.println("Hotel staff cannot access the monitor room");
		}
		try{
			System.out.println("Hotel staff trying to check in");
			hotelStaffProxy.checkIn();
		}
		catch (Exception e){
			System.out.println("Hotel staff cannot check in");
		}
		try{
			System.out.println("Hotel staff trying to check out");
			hotelStaffProxy.checkOut();
		}
		catch (Exception e){
			System.out.println("Hotel staff cannot check out");
		}
		try{
			System.out.println("Hotel staff trying to rate the hotel");
			hotelStaffProxy.rate();
		}
		catch (Exception e){
			System.out.println("Hotel staff cannot rate the hotel");
		}


		HotelPerson hotelGuestProxy= HotelGuestProxy.getHotelGuestProxy(hotelPerson);
		System.out.println("Created hotel guest proxy");
		try{
			System.out.println("Hotel guest trying to access kitchen");
			hotelGuestProxy.accessKitchen();
		}
		catch (Exception e){
			System.out.println("Hotel guest cannot access kitchen");
		}
		try{
			System.out.println("Hotel guest trying to access the monitor room");
			hotelGuestProxy.AccessMonitorRoom();
		}
		catch (Exception e){
			System.out.println("Hotel guest cannot access monitor room");
		}
		try{
			System.out.println("Hotel guest trying to check in");
			hotelGuestProxy.checkIn();
		}
		catch (Exception e){
			System.out.println("Hotel guest cannot check in");
		}
		try{
			System.out.println("Hotel guest trying to check out");
			hotelGuestProxy.checkOut();
		}
		catch (Exception e){
			System.out.println("Hotel guest cannot check out");
		}
		try{
			System.out.println("Hotel guest trying to rate the hotel");
			hotelGuestProxy.rate();
		}
		catch (Exception e){
			System.out.println("Hotel guest cannot rate the hotel");
		}
	}//main
}
