import java.util.Scanner;


public class PatientDriverApp {

	public static void main(String[] args) {
		
	String patientFName,
		   patientMName,
		   patientLName,
		   patientSAddress,
		   patientCity,
		   patientState,
		   patientPhone,
		   emergencyName,
		   emergencyPhone;
	int patientZIP;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Enter your first name: ");
	patientFName = keyboard.nextLine();
	
	System.out.print("Enter your middle name: ");
	patientMName = keyboard.nextLine();
	
	System.out.print("Enter your last name: ");
	patientLName = keyboard.nextLine();
	
	System.out.print("Enter your street address: ");
	patientSAddress = keyboard.nextLine();
	
	System.out.print("Enter your city: ");
	patientCity = keyboard.nextLine();
	
	System.out.print("Enter your state(XX): ");
	patientState = keyboard.nextLine();
	
	System.out.print("Enter your ZIP code: ");
	patientZIP = keyboard.nextInt();
	
	keyboard.nextLine();
	
	System.out.print("Enter your phone number: ");
	patientPhone = keyboard.nextLine();
	
	System.out.print("Enter your emergency contact name: ");
	emergencyName = keyboard.nextLine();
	
	System.out.print("Enter your emergency contact phone number: ");
	emergencyPhone = keyboard.nextLine();
		   
	Patient patient1 = new Patient(patientFName, patientMName, patientLName, patientSAddress,
									patientCity, patientState, patientZIP, patientPhone,
									emergencyName, emergencyPhone);
	
	Procedure procedure1 = new Procedure();
	Procedure procedure2 = new Procedure("Blood Test", "09/29/2024");
	Procedure procedure3 = new Procedure("Chemotherapy", "10/05/2024", "Dr. Jhonson", 3268.95);
	
	displayPatient(patient1);
	
	displayProcedure(procedure1);
	displayProcedure(procedure2);
	displayProcedure(procedure3);
	
	double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
	
	System.out.printf("\nTotal Charges: $%,.2f", totalCharges);
	
	System.out.println("\n");
	
	System.out.print("Student Name: ");
	String name = keyboard.nextLine();
	
	System.out.print("MC#: ");
	String MCNumber = keyboard.nextLine();
	
	System.out.print("Due Date: ");
	String date = keyboard.nextLine();
	
	keyboard.close();
	}
	
	
	public static void displayPatient(Patient pa) {
		
		System.out.println("\n");
		
		System.out.println("Patient info:");
		
		System.out.println("  Name: " + pa.buildFullName());
		System.out.println("  Address: " + pa.buildAddress());
		System.out.println("  Emergency Contact: " + pa.buildEmergencyContact() + "\n");
	}
	
	
	public static void displayProcedure(Procedure pr) {
		
		System.out.println("  \tProcedure: " + pr.getProcedureName());
		System.out.println("  \tProcedure Date = " + pr.getProcedureDate());
		System.out.println("  \tPractitioner = " + pr.getPractitionerName());
		System.out.println("  \tCharge = " + pr.getProcedureCharges());
	}
	
	public static double calculateTotalCharges(Procedure pr1, Procedure pr2, Procedure pr3) {
		
		double charge1 = pr1.getProcedureCharges();
		double charge2 = pr2.getProcedureCharges();
		double charge3 = pr3.getProcedureCharges();
		
		return charge1 + charge2 + charge3;
	}

}