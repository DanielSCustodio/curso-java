import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int z;
		double y;
		char a;
		
		x = sc.next();
		z = sc.nextInt();
		y = sc.nextDouble();
		a = sc.next().charAt(z);
		
		System.out.println("Dados digitados:");
		System.out.println(x+z+y+a);
		System.out.println(z);
		System.out.println(y);
		System.out.println(a);

		sc.close();
	}

}

