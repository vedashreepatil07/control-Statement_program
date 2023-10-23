package program;
import java.util.Scanner;
public class L1_odd_even_program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
			for(int i=0;i<=n;i=i+2) {
				System.out.println(i);
			}
		}else
		{
			for(int i=1;i<=n;i=i+2) {
				System.out.println(i);
			}
		}
	}

}
