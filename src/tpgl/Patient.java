package tpgl;

 class Patient {

	 private String name;
	    private String appointmentTime;  // Stores the appointment time as a String
	    private Doctor doctor;  // Doctor associated with the appointment

	    public Patient(String name) {
	        this.name = name;
	        this.appointmentTime = null;
	        this.doctor = null;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAppointmentTime() {
	        return appointmentTime;
	    }

	    public Doctor getDoctor() {
	        return doctor;
	    }

	    // Book an appointment with a specific doctor
	    public boolean bookAppointment(String appointmentTime, Doctor doctor) {
	        if (doctor.getAvailableAppointments().contains(appointmentTime)) {
	            this.appointmentTime = appointmentTime;
	            this.doctor = doctor;
	            return true;
	        }
	        return false;  // Appointment time not available
	    }

	    // Cancel the booked appointment
	    public void cancelAppointment() {
	        this.appointmentTime = null;
	        this.doctor = null;
	    }

}
