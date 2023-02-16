package StatePattern;

public class Client {
	public static void main(String[] args) {
		Project project=new Project();


		project.startDev();//Will transition to InDevelopment

		project.test();//Invalid action

		project.submitToQA(); //Will transition to InTesting

		project.startDev();//Invalid action

		project.test();////Will transition either to Closed or InDevelopment based upon test results
	}//main
}//Client
