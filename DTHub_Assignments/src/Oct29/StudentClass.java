package Oct29;

public class StudentClass {
	int rollno, age;

	public void display1() {
		System.out.println("Welcome to all of you");
	}

	public void display2() {
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {

		StudentClass student = new StudentClass();
		student.display1();
		student.display2();
		student.rollno = 1;
		student.age = 10;
		System.out.println(student.rollno);
		System.out.println(student.age);
	}

}
