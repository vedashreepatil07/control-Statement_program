package program;
import java.util.Scanner;
//tax salary<10000--->no tax
//100000<salray >10000 --->10%
//above 100000-->20%
public class L13_Tax_calculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
System.out.println("Enter your Salary:");
int salary =sc.nextInt();
if(10000<=salary &&salary>=100000) {
	System.out.println("You need to pay 10% taxes...");
}else if(salary<10000)
{
	System.out.println("you don't need to pay taxes");
}else
{
	System.out.println("you need to pay 20% taxes");
}
		
	}

}
