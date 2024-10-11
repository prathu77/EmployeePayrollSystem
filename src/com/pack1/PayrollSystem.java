package com.pack1;

import java.util.ArrayList;

class PayrollSystem 
{
 private ArrayList<Employee> employeeList; 
 
 public PayrollSystem()
 {
	  employeeList=new ArrayList<>();
 }
 
 public void addEmployee(Employee employee)
 {
	 employeeList.add(employee);
 }
 
 //for removing the employee by using its 'ID'
 
 public void removeEmployee(int id ) 
 {
	  Employee employeeToRemove=null;
	  
	  for(Employee employee : employeeList)
	  {
		  if(employee.getId()==id)
		  {
			  employeeToRemove=employee;
			  break;
		  }
		  
	  }
	  if(employeeToRemove !=null)
	  {
		  employeeList.remove(employeeToRemove);
	  }
 }
 public void displayEmployee()
 {
	 for(Employee employee : employeeList)
	 {
		 System.out.println(employee);
	 }
 }
 public static void main(String[] args) 
 {
   PayrollSystem payrollSystem=new PayrollSystem();
   FullTimeEmployee emp1=new FullTimeEmployee("vikas", 1,70000.0);
   PartTimeEmployee emp2=new PartTimeEmployee("Alexander", 2,40,100 );
   
   
   payrollSystem.addEmployee(emp1);
   payrollSystem.addEmployee(emp2);
   
   System.out.println("------ initial  Employee Details --------");
   payrollSystem.displayEmployee();
   
   System.out.println("****** Removing Employees ******");
   payrollSystem.removeEmployee(2);
   System.out.println("remaining employee details : ");
   payrollSystem.displayEmployee();
   
   System.out.println("***************** Thank You ******************");
   
 }
}
