package tpgl;

class Diagnosis {
	 private String condition;
	 private String notes;
	 private String medicine;
	 private String dosage;

	 public Diagnosis(String condition, String notes, String medicine, String dosage) {
	     this.condition = condition;
	     this.notes = notes;
	     this.medicine = medicine;
	     this.dosage = dosage;
	 }

	 public String getDetails() {
	     return "Condition: " + condition + ", Notes: " + notes + ", Medicine: " + medicine + ", Dosage: " + dosage;
    }
}
