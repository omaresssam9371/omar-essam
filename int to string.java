package problem2;
import java.util.Scanner;

public class problem02 {
	  public static void main(String args[]){
		  Scanner in = new Scanner(System.in);
		   System.out.println ("enter int");
   int  num =in.nextInt();
   String str ="";
   String reverse ;
   reverse= "";
    while (num>0) {
      str+= num%10;
      num/=10;
    }
   for(int i =str.length()-1 ;i>=0;i--)
   {
	   reverse = reverse + str.charAt(i);
   }
   System.out.println(reverse) ;
  
}
}