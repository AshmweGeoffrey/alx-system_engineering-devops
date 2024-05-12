class calculator
{
	int add(int a,int b)
	{
		return (a+b);
	}
	int sub(int a,int b)
	{
		return (a-b);
	}
	int mul(int a, int b)
	{
		return (a*b);
	}
	//method overload
	int add(int a,int b,int x)
	{
		return(a+b);
	}
}
class scn extends calculator
{
	int sub(int a,int b)
	{
		// overriring add method
		return (b-a);
	}
}
public class doit
{
	public static void main(String[] args)
	{
		calculator sample = new calculator();
		scn sample1 = new scn();
		int x=sample.add(1,4);
		int y=sample.sub(4,1);
		int z=sample.mul(1,7);
		int v=sample1.sub(5,6);
		System.out.println("sum in base class :"+ x);
		System.out.println("sub in base class :"+ y);
		System.out.println("mul in base class :"+ z);
		System.out.println("sub in child class(overriding) :"+ v);
	}
}
