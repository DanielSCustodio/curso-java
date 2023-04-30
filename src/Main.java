import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int x = 1000000000;
		double y = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Olá, Mundo!");
		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n", y);
		System.out.println("Resultado: "+x+" quilômetros");
		System.out.printf("Resultado: %.3f metros %n", y);
		System.out.printf("%s tem %d anos e seu salário é de R$%.2f/por mês. %n", nome, idade, renda);
	}

}
