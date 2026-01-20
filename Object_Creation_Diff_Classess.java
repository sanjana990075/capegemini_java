package QSPIDERS;


class emp
{
	static void func()
	{
		System.out.println("Class");
	}
}
public class Object_Creation_Diff_Classess {

	public static void main(String[] args) {
		emp.func(); // using class name
		emp e1=new emp();
		e1.func(); //using reference variable or object
		
		

	}

}
