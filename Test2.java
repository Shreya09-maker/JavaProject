package Exception;

public class Test2 {
public static void main(String[] args) {
	
	try {
	String str=null;
	System.out.println(str.length());
	}catch(NullPointerException e)
	{
		System.out.println(e);//we can print mg of system
	}
	System.out.println("main end");
}
}
