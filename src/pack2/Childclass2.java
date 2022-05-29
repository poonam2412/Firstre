package pack2;

public class Childclass2 extends childclass1
{
	
	public void method1()
	{
		int d=80;
		int c=70;
		int b=d+c;
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		Childclass2 m= new Childclass2();
		m.method1();
		

	}

}
