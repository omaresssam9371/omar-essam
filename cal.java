package calcu;



	

	import java.io.IOException;
	import java.util.Scanner;


	public class cal {
		public static void main(String[] args) throws IOException {
			int num1,num2;    String x;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter 1st number:");
			num1=in.nextInt();
			System.out.println("Enter 2nd Number:");
			num2=in.nextInt();
			System.out.println("Enter The Operation:(+,-,*,/,%)");
			x=in.next();
			if (x.equalsIgnoreCase("+")) {System.out.println("Sum = "+(num1+num2));}
			else if (x.equalsIgnoreCase("-")) {System.out.println("Substract = "+(num1-num2));}
			else if (x.equalsIgnoreCase("*")) {System.out.println("Multiplication = "+(num1*num2));}
			else if (x.equalsIgnoreCase("/")) {System.out.println("Division = "+(num1/num2));}
			else if (x.equalsIgnoreCase("%")) {System.out.println("Mod = "+(num1%num2));}
			else  {System.out.println("please enter valid sign");}
			System.out.println("Enter any button to exit");
			System.in.read();
			
		}

	}
