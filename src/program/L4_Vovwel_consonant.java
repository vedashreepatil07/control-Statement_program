package program;
//vowels or consonants
import java.util.*;
public class L4_Vovwel_consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("enter the chractor:");
char c=sc.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
	System.out.println("This is the vowel...");
	}
else {
	System.out.println("this is consonant...");
}
}

}
