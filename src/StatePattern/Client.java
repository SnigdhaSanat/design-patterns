package StatePattern;

public class Client {
	public static void main(String[] args) {
		Project project=new Project();

		project.startDev();
		project.submitToQA();
		project.test();
	}//main
}//Client
