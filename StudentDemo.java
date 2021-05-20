public class Student {
	String name;
	int age;
	double gpa;
	
	void read(String book){
		System.out.println("I am reading " + book);
	}
	
	void write(String text){
		System.out.println("I am writing " + text);
	}
	
	void run(String goal){
		System.out.println("I am running " + goal);
	}
}

class StudentDemo{
	public static void main(String[] args){
		Student student = new Student();
		student.read("War and Peace");
		student.write("an essay about ecology");
		student.run("from my responsibilities");
	}
}
