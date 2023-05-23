package SingletonPattern;

public class Client {
	public static void main(String[] args) {
		SimpleSingletonClass object1=SimpleSingletonClass.getSingletonInstance1();
		SimpleSingletonClass object2=SimpleSingletonClass.getSingletonInstance2();
	}//main
}
