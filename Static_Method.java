package QSPIDERS;


class calci
{
	static int add(int a,int b)
	{
		return a+b;
	}
}
public class Static_Method {
	public static void main(String args[])
	{
		int result=calci.add(10,20);
		System.out.println(result);
	}

}
