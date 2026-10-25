package com.mackinsey.practice3;

public class HospitalAppointment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1  = new Patient(1,  "Rahul Kumar",      26, "15:45");
		Patient p2  = new Patient(2,  "Anjali Sharma",    60, "09:15");
		Patient p3  = new Patient(3,  "Amit Patel",       45, "10:00");
		Patient p4  = new Patient(4,  "Priya Nair",       70, "11:30");
		
		Patient[] pArray = new Patient[4];
		
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		pArray[3] = p4;
		
		Patient p = new Patient();
		p.displayPatients(pArray);
		int ecount =p.countEmergencyPatient(pArray);
		System.out.println(ecount);
		int totalCount=p.countPatient(pArray);
		System.out.println(totalCount);
		int countRegular = p.countRegularPatient(pArray);
		System.out.println(countRegular);
		p.emergencyPatient(pArray);
	}

}
