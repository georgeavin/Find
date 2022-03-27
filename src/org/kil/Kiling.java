package org.kil;


public class  Kiling{

	private void empName() {
		System.out.println("Employee Name : Raj");
	}
	
	private void empId() {
		System.out.println("Employee Id : 1234");
	}
	
	private void empNew() {
		System.out.println("New Employee pin : 56245");
	}
	
	private void empVin() {
		System.out.println("Employee Vin");
	}

	public static void main(String[] args) {
		
		Kiling k=new Kiling();
		
		k.empId();
		k.empName();
		k.empVin();
		
	}

}
