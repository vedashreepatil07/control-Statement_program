package program;
import java.util.*;
public class L11_Count_number_digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int count=0;
	System.out.println("enter the number:");
	int n=sc.nextInt();
while(n>0) {
	n=n/10;
	count++;
}
	System.out.println(count);
}
}
