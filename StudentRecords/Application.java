package StudentRecords;

import java.util.Scanner;

public class Application {
	private static Scanner scanner = new Scanner(System.in);
	private static Operation operation=new Operation();
	public static void main(String[] args) {
		while (true) {
			System.out.println("enter which operation you want to perform : ");
			
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
            	operation.insertStudent();
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
                operation.deleteStudent(id);
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
