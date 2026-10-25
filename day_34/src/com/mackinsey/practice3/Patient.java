package com.mackinsey.practice3;
/**
 * Patient class is responsible to tell about the patient detail 
 */
public class Patient {
	int patientId;
	String patientName;
	int age;
	String appointmentTime;
	Patient(){
		
	}
	public Patient(int patientId, String patientName, int age, String appointmentTime) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.appointmentTime = appointmentTime;
	}
	/**
	 * 
	 * @param patient
	 * displayPatients method to print details of the patient
	 */
	public void displayPatients(Patient[] patient) {
		for(int i =0;i<patient.length;i++) {
			System.out.println(patient[i].patientName+" "+patient[i].age);
		}
	}
	/**
	 * 
	 * @param patient
	 * display emergencyPatient information only
	 */
	public void emergencyPatient(Patient[] patient) {
		for(int i =0;i<patient.length;i++) {
			if(patient[i].age>60) {
				System.out.println(patient[i].patientName+" --"+ patient[i].appointmentTime);
				System.out.println("priority Patient");
			}else {
				System.out.println("Regular Patient");
			}
		}
	}
	/**
	 * @param patient
	 * @return
	 * count the number of emergencyPatient present to be treated
	 */
	public int countEmergencyPatient(Patient[] patient) {
		int count = 0;
		for(int i =0;i<patient.length;i++) {
			if(patient[i].age>60) {
				count++;
			}
		}
		return count;
	}
	public int countRegularPatient(Patient[] patient) {
		int count =0;
		for(int i =0;i<patient.length;i++) {
			if(patient[i].age<60) {
				count++;
			}
		}
		return count;
	}
	/**
	 * 
	 * @param patient
	 * @return
	 * Total number of patient available in the hospital 
	 */
	public int countPatient(Patient[] patient) {
		return patient.length;
	} 
	
}
