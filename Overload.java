
public class Overload {
	void print()
	{
		System.out.println("Null arguements");
	}
	void print(int a)
	{
		System.out.println("One integer arguement="+a);
	}
	void print(float b)
	{
		System.out.println("One float arguement="+b);
	}
public static void main(String[] args)
{
	Overload ov=new Overload();
	int a=2;
	float b=2.4f;
	ov.print();
	ov.print(a);
	ov.print(b);
}
}
