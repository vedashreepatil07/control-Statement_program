package program;
//Factorial of number
//5-->(5x4x3x2x1)
import java.util.*;

public class L10_Factorial_number {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		int fact=1;
System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		fact=fact*i;
		}
		System.out.println(fact);
	}

}
