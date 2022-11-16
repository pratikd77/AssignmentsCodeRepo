package Nov6;

public class Method_This_Keyword {

	public void Mtd1(int a)
	{
		System.out.println("1 parameter method");
		this.Mtd1(1, 2);
	}
	
	public void Mtd1(int a,int b)
	{
		System.out.println("2 parameter method");
	}
	
	public void Mtd1(int a, int b,int c)
	{
		System.out.println("3 parameter method");
		this.Mtd1(1, 2, 3, 4);
	}
	
	public void Mtd1(int a,int b,int c,int d)
	{
		System.out.println("4 parameter method");
		this.Mtd1(1);
	}
	
	public static void main(String[] args)
	{
		Method_This_Keyword obj = new Method_This_Keyword();
		obj.Mtd1(0, 0,0);
	}
}

