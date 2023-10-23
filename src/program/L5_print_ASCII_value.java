package program;
//print ASCII value
//a-->97
import java.util.Scanner;
public class L5_print_ASCII_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the char:");
		char c=sc.next().charAt(0);
		
		int a=(char)c;
		System.out.println("ASCII:"+ a);
	}

}
