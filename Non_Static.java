package QSPIDERS;

class demo
{
	int a=10; // non static variable
	
	
	//constructor call
	
	demo()
	{
		System.out.println("constructor");
	}
	 
	//non static method
	
	void func()
	{
		System.out.println("non static method");
	}
	
	//anonymous block or non static multi line initilializer
	
	{
		System.out.println("non static multil line intializer");
	}
}

public class Non_Static {

	public static void main(String[] args) {
		
		
		System.out.println("main");
		
		demo d=new demo();
		
		System.out.println(d.a);

	}

}
