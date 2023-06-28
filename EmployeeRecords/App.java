package EmployeeRecords;

import java.util.Scanner;

public class App {
	private static Scanner scanner = new Scanner(System.in);
	private static Operator operation=new Operator();
	public static void main(String[] args) {
		System.out.println("EMPLOYEE MANAGEMENT SYSTEM!!!!!");
		while (true) {
			
			System.out.println("Enter which operation you want to perform : ");
			
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. ReadAll");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("6. Exit");
			String choice=scanner.next();
            
			
            scanner.nextLine(); 
            
            switch (choice) {
            case "Create":
            	operation.insert();
                break;
                
            case "Read":
                System.out.print("Enter student id: ");
                int id = scanner.nextInt();
                scanner.nextLine(); 
                operation.getRead(id);
                break;
                
            case "ReadAll":
                operation.getReadAll();
                break;
                
            case "Update":
                System.out.print("Enter student id: ");
                id = scanner.nextInt();
                scanner.nextLine(); 
                operation.update(id);
                break;
                
            case "Delete":
                System.out.print("Enter student id: ");
                id = scanner.nextInt();
                scanner.nextLine(); 
                operation.delete(id);
                break;
                
            case "Exit":
                System.out.println("Exiting program...");
                System.exit(0);
            default:
                System.out.println("Invalid choice, please enter choice as mentioned.");
            }
        }

	}

}
