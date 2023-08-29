package cursoJava.basico;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto");
		double valor = leitor.nextDouble();
		
		double aVista = valor - (valor*0.1);
		
		double parcelado03 = valor, parcela03 = valor/3;
		
		double parcelado10 = valor + (valor*0.05), parcela10 = valor/10;
		
		System.out.println("à vista: "+aVista+" uma parcela : "+aVista);
		
		System.out.printf("Parcelado em três: %.2f três parcelas: %.2f\n",parcelado03,parcela03);
		
		
		System.out.printf("Parcelado em três: %.2f três parcelas: %.2f\n",parcelado10,parcela10);
		
	}
}
