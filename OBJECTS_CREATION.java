package QSPIDERS;


class employee{
	int a;
	void fun()
	{
		System.out.println("this is a method");
	}
}
public class OBJECTS_CREATION {

	public static void main(String[] args) {
		employee e1=new employee();
		employee e2=new employee();
		employee e3=new employee();
		System.out.println(e1);
		System.out.println(e2);

		employee e4=e1;
		employee e5=e1;
		System.out.println(e4==e5);
	}

}
