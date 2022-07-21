package org.pppd;

import org.pdpp.Employee;

public class College extends Employee {
	static void studentId() {
System.out.println("student id is 13EC013");
}
	static void collegCode() {
System.out.println("College code is 1202");
}
	static void numOfStudents() {
System.out.println("Num of Studen"
		+ "ts are 3000");
}
public static void main(String[] args) {
	College c = new College ();
	c.studentId();
	c.collegCode();
	c.numOfStudents();
	c.hdfcBank();
	c.rbiBank();
	
	
	
	
}
}
