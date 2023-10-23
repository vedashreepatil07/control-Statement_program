package program;
//sum of n natural numbers
import java.util.*;
public class L2_sum_of_num {
public static void main(String[] args) {
	int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++) {
		sum=sum+i;
	}
	System.out.println("sum:" +sum);
}
}
