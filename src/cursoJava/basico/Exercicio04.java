package cursoJava.basico;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota01 = leitor.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double nota02 = leitor.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double nota03 = leitor.nextDouble();
		
		double mediaPonderada = (nota01*4 + nota02*5 + nota03*6) / 15;
		
		String resultado = mediaPonderada >= 6.0 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado+" nota: "+mediaPonderada);
	}
}
