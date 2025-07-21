package Exception;

public class Test {
public static void main(String[] args) {
	System.out.println("main start");
	try {
		System.out.println("try start");
		int a=10/0;
		System.out.println(a);
	}catch(ArithmeticException e)
	{
		System.out.println("enter a non zero value");
		
	}
	System.out.println("main end");
	
}
}
