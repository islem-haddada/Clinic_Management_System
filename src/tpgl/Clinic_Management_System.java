package tpgl;

import java.util.*;

public class Clinic_Management_System {

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Sample doctors for demonstration purposes
            Doctor doc1 = new Doctor("John doe", "Cardiology");
            Doctor doc2 = new Doctor("Emily Brown", "Dermatology");

            // Adding available appointments for doctors
            doc1.addAppointment("2024-12-06 10:00 AM");
            doc1.addAppointment("2024-12-06 11:00 AM");
            doc2.addAppointment("2024-12-06 01:00 PM");

            List<Doctor> doctors = Arrays.asList(doc1, doc2);

            Secretary secretary = new Secretary();

            // Collect patient information
            System.out.print("Enter patient name: ");
            String patientName = scanner.nextLine();
            Patient patient = new Patient(patientName);

            // Display available appointments
            System.out.println("Welcome, " + patient.getName() + ". Please choose a doctor and appointment.");
            secretary.showAvailableAppointments(doctors);

            // Select a doctor
            System.out.print("Enter doctor name: ");
            String chosenDoctorName = scanner.nextLine();
            Doctor chosenDoctor = null;
            for (Doctor doc : doctors) {
                if (doc.getName().equalsIgnoreCase(chosenDoctorName)) {
                    chosenDoctor = doc;
                    break;
                }
            }

            if (chosenDoctor == null) {
                System.out.println("Doctor not found. Exiting.");
                return;
            }

            // Select an appointment time
            System.out.print("Enter desired appointment time: ");
            String chosenAppointmentTime = scanner.nextLine();

            // Attempt to book the selected appointment
            if (patient.bookAppointment(chosenAppointmentTime, chosenDoctor)) {
                System.out.println("Appointment booked successfully!");

                // Simulate the examination process
                System.out.println("Appointment time has arrived. Proceeding to examination room.");

                // Enter the diagnosis (including prescription) for the patient
                Diagnosis diagnosis = chosenDoctor.enterDiagnosis(scanner);
                System.out.println("Diagnosis: " + diagnosis.getDetails());

                // Bill the patient
                System.out.println("Bill Amount: $");
                String billAmount = scanner.nextLine(); // Example bill amount
                

                // Collect payment from the patient
                System.out.print("Enter payment method (Cash/Credit Card): ");
                String paymentMethod = scanner.nextLine();
                secretary.processPayment(billAmount, paymentMethod);

                System.out.println("Thank you for visiting the clinic, " + patient.getName() + "!");
            } else {
                System.out.println("Selected appointment is unavailable. Please try again.");
            }
        }
    }
}
