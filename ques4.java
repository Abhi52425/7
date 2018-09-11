import java.util.Scanner;
public class ques4
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1: ");
		String str = sc.nextLine();
		System.out.println("Enter string2: ");
		String fs = sc.nextLine();
		
		boolean res = str.contains(fs);
		
		System.out.println(res);
	}
}
