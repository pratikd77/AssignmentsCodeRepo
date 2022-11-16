package Nov6;

public class Constructor_This_Keyword {

	public Constructor_This_Keyword()
	{
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	
	public Constructor_This_Keyword(int a)
	{
		this();
		System.out.println("One parameterized constructor");
	}
	
	public Constructor_This_Keyword(int a,int b)
	{
		this(1,2,3);
		System.out.println("Two parameterized constructor");
	}
	
	public Constructor_This_Keyword(int a,int b,int c)
	{
		this(1);
		System.out.println("Three parameterized constructor");
	}
	
	public Constructor_This_Keyword(int a,int b,int c,int d)
	{
		System.out.println("Four parameterized constructor");	
	}
	
	public static void main(String[] args)
	{
		Constructor_This_Keyword constructor_This_Keyword = new Constructor_This_Keyword(1,2);	
	}
}
