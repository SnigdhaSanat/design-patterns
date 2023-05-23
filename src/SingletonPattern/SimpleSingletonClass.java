package SingletonPattern;

public class SimpleSingletonClass {

	//PRIVATE ctor
	private SimpleSingletonClass(){};

	private static SimpleSingletonClass theOnlyObject;

	public static synchronized SimpleSingletonClass getSingletonInstance1(){
		System.out.println("Calling getSingletonInstance1");
		if(theOnlyObject==null){
			theOnlyObject=new SimpleSingletonClass();
		}
		return theOnlyObject;
	}

	public static SimpleSingletonClass getSingletonInstance2(){
		System.out.println("Calling getSingletonInstance2");
		if(theOnlyObject==null){
			synchronized (SimpleSingletonClass.class){
				if(theOnlyObject==null){
					theOnlyObject=new SimpleSingletonClass();
				}//inner null check
			}//synchronised block

		}//outer null check
		return theOnlyObject;
	}
}//SimpleSingletonClass


