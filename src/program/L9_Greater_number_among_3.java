package program;
import java.util.Scanner;
public class L9_Greater_number_among_3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=10,b=50,c=90;
	if(a>b&&a>c)
	{
		System.out.println("a is the greater");
	}else if(b>a&&b>c)
	{
		System.out.println("b is the greater");
	}
	else if(c>a&&c>b) {
		System.out.println("c is the greater");
	}
	System.out.println("Another approch");
	
	if(a>b)
	{
		if(a>c) {
			System.out.println("A is the greater...");
		}else {
			System.out.println("C is the graeter...");
		}
	}else {
		if(b>c) {
			System.out.println("b is the greater");
		}else
		{
			System.out.println("C is the greater");
		}
	}
	
}
}
