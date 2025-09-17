package devops;
import java.util.Scanner;

public class factorial {
	public static int fact(int n) {
		int fact=1,i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter a number:");
		n=s.nextInt();
		System.out.print(fact(n));
		
	}

}
