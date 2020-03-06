package problem3 ;
import java.util.Scanner ;
public class problem{
	public static void main(String[] args) {
		int a=1 ;
		int b=0 ;
		int c=0 ;
		for (a=1; a<=10 ; a++)
		{ 
			for(b=1 ; b<=a; b++) {
				c=a*b ;
				System.out.print(c+" ") ;
			}
			System.out.println(" ") ;
		}
	}
}

