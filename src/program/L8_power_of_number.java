package program;
import java.util.Scanner;
public class L8_power_of_number {
//power of number
	//num=5
//power=2
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int result=1;
System.out.println("enter the num");
int n=sc.nextInt();
System.out.println("enter the power");
int p=sc.nextInt();
 
for(int i=1;i<=p;i++) {
 result=result*n;
}
System.out.println(result);

	}

}
