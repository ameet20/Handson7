import java.util.Scanner;
//pull request
public class Constructor {
	
	public static void main(String[]args){
		constructortest Obj1, Obj3, Obj2;
		Scanner in = new Scanner(System.in);  
		System.out.println("Enter value ");
		String str=in.nextLine();
		Obj1 = new constructortest ();
		Obj2 = new constructortest (Integer.parseInt(str));
		Obj3 = new constructortest (Float.parseFloat(str));
		
	
		
		
	}

}
