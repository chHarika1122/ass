package lab13;

import lab13.Employee.EmployeeDetails;

class Employee{
	String name;
	int empid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Employee(String name, int empid) {
		this.name=name;
		this.empid=empid;
	}
	interface EmployeeDetails{
		public Employee getEmployee(String name, Integer id);
	}
}
public class Excercise4 {
	public static void main(String[] args) {
		EmployeeDetails empDetails=Employee::new;
		Employee emObj=empDetails.getEmployee("Gagan", 24);
		System.out.println("Employee Name: "+emObj.getName());
		System.out.println("Employee Id: "+emObj.getEmpid());
	}

}
