package org.pdpp;

public class Employee extends Sample {
protected void hdfcBank() {
System.out.println("hdfcbank provides 10% interest");
}
protected void rbiBank() {
System.out.println("RbiBank provides 25% interest");
}
public static void main(String[] args) {
	Employee e = new Employee();
	e.hdfcBank();
	e.rbiBank();
	e.banuSakthi();
	e.suryaSakthi();
	
	Sample s = new Sample();
	s.banuSakthi();
	s.suryaSakthi();
	
	
}
}
