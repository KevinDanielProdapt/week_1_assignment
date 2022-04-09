package com.iPrimed.week1.q2;
import java.util.Scanner; 

public class SchoolRecords {
	
	static void displayRecord (String a, String b, String c){
		System.out.println("The school Name was "  + a);
		System.out.println("The school ID was "  + b);
		System.out.println("The school Address was "  + c);
	}

	static String addRecord(int value) {
		Scanner input = new Scanner(System.in);
		
		if (value == 1) {
			System.out.println("Enter school id");
			String sId = input.nextLine();
			return sId;
		} else if (value == 0) {
			System.out.println("Enter school name");
			String sName = input.nextLine();
			return sName;
		}else {
			System.out.println("Enter school address");
			String sAddress = input.nextLine();
			return sAddress;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String schoolName;
		String schoolId;
		String schoolAddress;	
		
		String[] container = new String[3];
		
		for (int i=0; i<3; i++) {
			String valCatch = addRecord(i);
			container[i] = valCatch;
		}
		
		schoolName = container[0];
		schoolId = container[1];
		schoolAddress = container[2];
		displayRecord(schoolName, schoolId, schoolAddress);
	}
}
