package VinteCinco;
import java.util.Scanner;

public class Jir { public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite um Número: ");
	int frase = scanner.nextInt();
	System.out.print("Digite outro Número : ");
	int frase2 = scanner.nextInt();
	
	int soma = frase + frase2;
	System.out.print("A soma é: " + soma);
}

}
