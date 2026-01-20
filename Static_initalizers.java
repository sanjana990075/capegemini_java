package QSPIDERS;



public class Static_initalizers {
	
	//single line
	 static int a=20;
	
	
	//multi line

	static
	{
		System.out.println("Static block");
	}
	
	void test1()
	{
		System.out.println("test1");
	}
	
	void test2()
	{
		System.out.println("test2");
	}
	public static void main(String[] args) {
		System.out.println("Main Block");
		Static_initalizers s1=new Static_initalizers();
		Static_initalizers s2=new Static_initalizers();
		s1.test1();
		s2.test2();
		

	}

}
