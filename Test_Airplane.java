import java.time.LocalTime;

public class Test_Airplane {

	public static void main(String[] args) {
		Airplane flight1 = new Airplane("JE2345","Delhi",LocalTime.of(10,22)); 
		Airplane flight2 = new Airplane("DE9876","JAmmu",LocalTime.of(14,0)); 
		Airplane flight3 = new Airplane("PR54F","South Korea",LocalTime.of(13,22)); 
		System.out.println("Flight Status:"); 
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
		flight3.delay(13);
		flight1.delay(120);
		System.out.println("Current Flight Status:"); 
		flight1.checkStatus();
		flight2.checkStatus();
		flight3.checkStatus();
	}

}
