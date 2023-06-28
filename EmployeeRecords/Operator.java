package EmployeeRecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operator {
	
	    private List<Employee> employees = new ArrayList<>();
	    private Scanner scanner = new Scanner(System.in);
	    private int nextId = 1;
	    
	    public void insert() {
	        System.out.println("Enter name: ");
	        String name = scanner.next();
	        
	        System.out.println("Enter age: ");
	        int age = scanner.nextInt();
	        
	        
	        System.out.println("Enter Salary: ");
	        double Salary= scanner.nextDouble();
	        
	        Employee employee = new Employee(nextId++, name, age, Salary);
	        employees.add(employee);
	        
	        System.out.println("Employee added: " + employee);
	    }
	    
	    public void getRead(int id) {
	        for (Employee employee : employees) {
	            if (employee.getEmp_id() == id) {
	                System.out.println("Employee found: " + employee);
	                return;
	            }
	        }
	        System.out.println("Employee with id " + id + " not found.");
	    }
	    
	    public void getReadAll(){
	    	 System.out.println("All employees:");
	         for (Employee employees : employees) {
	             System.out.println(employees);
	         }
	    }
	    
	    public void update(int id) {
	        for (Employee employee : employees) {
	            if (employee.getEmp_id() == id) {
	            	
	                System.out.print("Enter The Employee Name: ");
	                String name = scanner.next();
	                
	                System.out.println("Enter The Age Of The Employee: ");
	                int age = scanner.nextInt();
	              System.out.println("Enter The Employee Salary: ");
	              double salary = scanner.nextDouble();
	              employee.setEmp_name(name);
	              employee.setEmp_sal(salary);
	              employee.setEmp_age(age);
	              System.out.println("Employee Details Updated!!!");
	            }
	        }
	        
	    }
	    
	    public void delete(int id) {
	        for (int i = 0; i < employees.size(); i++) {
	            Employee employee = employees.get(i);
	            if (employee.getEmp_id() == id) {
	                employees.remove(i);
	                System.out.println("Employee deleted: " +employees );
	                return;
	            }
	        }
	        System.out.println("Employee with id " + id + " not found.");
	    }


}
