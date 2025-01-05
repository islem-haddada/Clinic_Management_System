package tpgl;

import java.util.*;

class Doctor {
    private String name;
    private String specialty;
    private List<String> availableAppointments;  // List of available appointment times

    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.availableAppointments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public List<String> getAvailableAppointments() {
        return availableAppointments;
    }

    public void addAppointment(String appointment) {
        availableAppointments.add(appointment);
    }

    // Enter diagnosis, including prescription as part of the diagnosis
    public Diagnosis enterDiagnosis(Scanner scanner) {
        System.out.print("Enter diagnosis condition: ");
        String condition = scanner.nextLine();
        System.out.print("Enter additional notes: ");
        String notes = scanner.nextLine();
        System.out.print("Enter prescribed medicine: ");
        String medicine = scanner.nextLine();
        System.out.print("Enter dosage: ");
        String dosage = scanner.nextLine();
        return new Diagnosis(condition, notes, medicine, dosage);
    }
}
