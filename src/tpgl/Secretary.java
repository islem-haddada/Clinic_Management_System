package tpgl;

import java.util.*;

class Secretary {
    // Displays available appointments for all doctors
    public void showAvailableAppointments(List<Doctor> doctors) {
        System.out.println("Available Appointments:");
        for (Doctor doctor : doctors) {
            System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialty() + ")");
            for (String appointment : doctor.getAvailableAppointments()) {
                System.out.println("  - " + appointment);
            }
        }
    }

    // Processes the payment for the patient
    public void processPayment(String amount, String paymentMethod) {
        System.out.println("Payment of $" + amount + " received via " + paymentMethod + ".");
    }
}
