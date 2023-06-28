
package StudentRecords;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Operation {
	 private List<Student> students = new ArrayList<>();
	    private Scanner scanner = new Scanner(System.in);
	    private int nextId = 1;
	    
	    public void insertStudent() {
	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter age: ");
	        int age = scanner.nextInt();
	        scanner.nextLine(); 
	        
	        Student student = new Student(nextId++, name, age);
	        students.add(student);
	        
	        System.out.println("Student added: " + student);
	    }
	    
	    public void getRead(int id) {
	        for (Student student : students) {
	            if (student.getI() == id) {
	                System.out.println("Student found: " + student);
	                return;
	            }
	        }
	        System.out.println("Student with id " + id + " not found.");
	    }
	    
	    public void getReadAll(){
	    	 System.out.println("All students:");
	         for (Student student : students) {
	             System.out.println(student);
	         }
	    }
	    
	    public void update(int id) {
	        for (Student student : students) {
	            if (student.getI() == id) {
	                System.out.print("Enter name (leave blank to keep current value of " + student.getName() + "): ");
	                String name = scanner.nextLine();
	                if (!name.isEmpty()) {
	                    student.setName(name);
	                }
	                
	                System.out.print("Enter age (leave blank to keep current value of " + student.getAge() + "): ");
	                String ageStr = scanner.nextLine();
	                if (!ageStr.isEmpty()) {
	                    int age = Integer.parseInt(ageStr);
	                    student.setAge(age);
	                }
	                
	                System.out.println("Student updated: " + student);
	                return;
	            }
	        }
	        System.out.println("Student with id " + id + " not found.");
	    }
	    
	    public void deleteStudent(int id) {
	        for (int i = 0; i < students.size(); i++) {
	            Student student = students.get(i);
	            if (student.getI() == id) {
	                students.remove(i);
	                System.out.println("Student deleted: " + student);
	                return;
	            }
	        }
	        System.out.println("Student with id " + id + " not found.");
	    }
}