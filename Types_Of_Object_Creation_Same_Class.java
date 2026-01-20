package QSPIDERS;



public class Types_Of_Object_Creation_Same_Class {
	
	static String mem="Sanjana";

	public static void main(String args[])
	{
		System.out.println(mem);//directly
		
		System.out.println(Types_Of_Object_Creation_Same_Class.mem);//class name
		
		Types_Of_Object_Creation_Same_Class t1=new Types_Of_Object_Creation_Same_Class();
		
		System.out.println(t1.mem);//object or reference variable
		
		
	}
}
