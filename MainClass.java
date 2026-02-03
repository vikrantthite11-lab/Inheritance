package inheritance;

public class MainClass {

	public static void main(String[] args) {
		
        Bird an = new Bird("Animal details :");
        an.running("Dog");
        an.flying("Popat");
        
        
        Motor mo = new Motor("Cae=r details :");
        mo.jeep();
        mo.F1car();
        System.out.println();
        
        
        people pep = new people("Welcom to sidhi hospital:");
        pep.infopatient();
        pep.People();
        System.out.println();
        
		
		Appartment ap = new Appartment();
		System.out.println("House detail :");
		ap.deteils();
		ap.details01();
		System.out.println();
	}
}
