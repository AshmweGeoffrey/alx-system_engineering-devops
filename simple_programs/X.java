class X
{
	int area(int l,int w)
	{
		int A=l*w;
		if (A >= 100)
		{
			System.out.println("the area of the rectangle is big");
		}
		else
		{
			System.out.println("the area of the recatngle is small");
		}
		return A;
	}
	public static void main(String[]args)
        {
                X q=new X();
                q.area(4,5);
        }

}
