package Exception;

public class Test4 {
public static void main(String[] args) {
	try {
	Class.forName("A.java.cj.jdbc.Driver");
	}catch(ClassNotFoundException e )
	{
		System.out.println("class not found");
	}
	
}
}
