package program;
import java.util.*;
public class L10_Average_Marks {
//Average of marks
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks");
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=sc.nextInt();
int n4=sc.nextInt();
int n5=sc.nextInt();
float average=n1+n2+n3+n4+n5;
float newa=average/5;
System.out.println("Average:" +newa);
	}
}
