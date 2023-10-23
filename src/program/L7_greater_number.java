package program;
//greater number between two numbers
import java.util.Scanner;
public class L7_greater_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("enter the first num:");
int n1=sc.nextInt();
System.out.println("enter the second num:");
int n2=sc.nextInt();

if(n1>n2)
{
System.out.println("number" + n1+"is the greater number..");	

}
else
{
	System.out.println("number" + n2+"is the greater number..");	
}
}

}
