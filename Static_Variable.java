package QSPIDERS;


class Student
{
	static String name="Sanjana";
}
public class Static_Variable {

	public static void main(String[] args) {
		
		System.out.println(Student.name);
		Student.name="Ramesh";
		System.out.println(Student.name);
		

	}

}
