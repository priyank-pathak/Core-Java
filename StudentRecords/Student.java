package StudentRecords;

public class Student {
	
	int i;
	String name;
	int age;
	

	public Student(int i, String name, int age) {
		super();
		this.i = i;
		this.name = name;
		this.age = age;
	}


	public int getI() {
		return i;
	}


	public void setI(int i) {
		this.i = i;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [i=" + i + ", name=" + name + ", age=" + age + "]";
	}
	


}
