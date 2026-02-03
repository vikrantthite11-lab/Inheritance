package inheritance;
import java.util.Scanner;
public class Hospital {

	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	
	public void infopatient() {
		System.out.println("Enter name of patient: ");
		name = sc.nextLine();
		
		System.out.println("Enter age of the patient: ");
		age = sc.nextInt();
	}
}

class people extends Hospital {
	
	public void People() {
		sc.nextLine();
		
		System.out.println("Enter address: ");
		String patientAddress = sc.nextLine();
		
		System.out.println("Enter mobile number: ");
		int patientMobileNo = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Patient details : ");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("address : " + patientAddress);
		System.out.println("Mobile Number : " + patientMobileNo);
	}
	
	people(String name1){
		System.out.println(name);
	}
}