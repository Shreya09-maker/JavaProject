package Exception;

public class Test1 {
public static void main(String[] args) {
	
	System.out.println("main start");
	try {
	int arr[]= {10,20,30};
	System.out.println(arr[4]);
	}catch(ArrayIndexOutOfBoundsException e)
	{
	
	System.out.println("main end");
}
}
}
