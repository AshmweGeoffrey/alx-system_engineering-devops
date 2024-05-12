abstract class A
{
	void add(int a,int b,int c)
	{
		int x=a+b+c;
		System.out.println("the addition of the values="+x);
	}
}
class B extends A{}
public class Demo
{
	public static void main(String[]args)
	{
		B W=new B();
		W.add(40,20,5);
	}
}
