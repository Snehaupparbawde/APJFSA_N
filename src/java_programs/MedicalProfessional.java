package java_programs;

// Base class representing a Doctor
class Doctor {

	// Method to display the general role of the doctor
	public void displayRole() {
		System.out.println("I am a Doctor.");
	}

	// Method to check if the doctor can perform surgery
	public void performSurgery() {
		System.out.println("Doctor can perform surgery.");
	}
}

// Class Surgeon extending Doctor (Multilevel Inheritance)
class Surgeon extends Doctor {

	// Overriding the displayRole method to provide a more specific role for Surgeon
	@Override
	public void displayRole() {
		System.out.println("I am a Surgeon, a specialized type of Doctor.");
	}

	// Surgeon-specific method for performing surgery
	public void performSurgery() {
		System.out.println("Surgeon is performing a specialized surgery.");
	}

	// Surgeon-specific method for consulting the patient
	public void consultPatient() {
		System.out.println("Surgeon is consulting the patient for surgery.");
	}
}

// Class Nurse extending Doctor (Hierarchical Inheritance)
class Nurse extends Doctor {

	// Overriding the displayRole method to provide a more specific role for Nurse
	@Override
	public void displayRole() {
		System.out.println("I am a Nurse, assisting Doctors.");
	}

	// Nurse-specific method for taking care of the patient
	public void administerMedication() {
		System.out.println("Nurse is administering medication.");
	}
}

// Main class to test the inheritance and method overriding
public class MedicalProfessional {
	public static void main(String[] args) {

		// Creating a Doctor object
		System.out.println("Doctor Object:");
		Doctor doctor = new Doctor();
		doctor.displayRole(); // Calls the method in Doctor class
		doctor.performSurgery(); // Calls the method in Doctor class
		System.out.println();

		// Creating a Surgeon object (Multilevel Inheritance)
		System.out.println("Surgeon Object:");
		Surgeon surgeon = new Surgeon();
		surgeon.displayRole(); // Calls the overridden method in Surgeon class
		surgeon.performSurgery(); // Calls the overridden method in Surgeon class
		surgeon.consultPatient(); // Calls the specific method for Surgeon
		System.out.println();

		// Creating a Nurse object (Hierarchical Inheritance)
		System.out.println("Nurse Object:");
		Nurse nurse = new Nurse();
		nurse.displayRole(); // Calls the overridden method in Nurse class
		nurse.administerMedication(); // Calls the specific method for Nurse
		System.out.println();

		// Polymorphism Example: Using Doctor reference to refer to Surgeon object
		System.out.println("Polymorphism - Doctor reference to Surgeon:");
		Doctor polymorphicSurgeon = new Surgeon();
		polymorphicSurgeon.displayRole(); // Calls the overridden method in Surgeon class
		polymorphicSurgeon.performSurgery(); // Calls the overridden method in Surgeon class

		// Polymorphism Example: Using Doctor reference to refer to Nurse object
		System.out.println("Polymorphism - Doctor reference to Nurse:");
		Doctor polymorphicNurse = new Nurse();
		polymorphicNurse.displayRole(); // Calls the overridden method in Nurse class
	}
}
           /* Output
              Doctor Object:
              I am a Doctor.
              Doctor can perform surgery.
              
              Surgeon Object:
              I am a Surgeon, a specialized type of Doctor.
              Surgeon is performing a specialized surgery.
              Surgeon is consulting the patient for surgery.
              
              Nurse Object:
              I am a Nurse, assisting Doctors.
              Nurse is administering medication.
              
              Polymorphism - Doctor reference to Surgeon:
              I am a Surgeon, a specialized type of Doctor.
              Surgeon is performing a specialized surgery.
              Polymorphism - Doctor reference to Nurse:
              I am a Nurse, assisting Doctors. */
