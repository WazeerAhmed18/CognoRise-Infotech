import java.util.*;
public class Calculator {
	public static void main (String[]args)
	{
		try {
			int n1,n2,ans;
			char op;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Two Numbers : ");
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			System.out.println("Enter the operator(+ , - , * , / )");
			op = scan.next().charAt(0);
			switch(op) {
			case '+' : ans = n1+n2;
			break;
			case '-' : ans = n1-n2;
			break;
			case '*' : ans = n1*n2;
			break;
			case '/' : ans = n1/n2;
			break;
			default: System.out.println("Error !");
			return;
			}
		
			System.out.println("Answer is : "+ ans);
		}
			catch(Exception e){
				System.out.println("You can't divide by Zero");
			}	
	}
}
