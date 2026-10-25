package com.mackinsey.practice3;

public class Hospital {
	int hospitalId;
	String hospitalName;
	Patient[] patient;
	
	public Hospital(int hospitalId, String hospitalName,Patient[] patient) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.patient = patient;
	}
	public void totalNumberOFPatient(Patient[] patient){
		Patient p = new Patient();
		int result = p.countPatient(patient);
		System.out.println(result);
	}
	
	
}
