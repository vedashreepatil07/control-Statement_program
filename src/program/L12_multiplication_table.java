package program;
import java.util.*;
public class L12_multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res;
System.out.println("enter the number:");
int num=sc.nextInt();
for(int i=1;i<=10;i++) {
	res=num*i;
	System.out.println(num+"x"+i+"="+res);
}
	}

}
