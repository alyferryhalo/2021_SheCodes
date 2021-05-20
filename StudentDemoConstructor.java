public class Student {
	String name;
	int age;
	double gpa;
	
	// конструктор
	Student(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student Masha = new Student("Masha", 17, 5.0);
		Student Alla = new Student("Alla", 14, 4.7);
		System.out.println(Alla.name);
	}
}
