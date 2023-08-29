package cursoJava.basico;
/*
 * Classe de explicação e demonstração dos operadores
 * 
 * versão: 1.0
 * 
 * autor: Erika Pimentel
 * 
 * data: 22/08/2023
 */
public class Operadores {

	public static void main(String[] args) {
		
		int numero1=10, numero2=8;
		
		/*
		// Operadores aritméticos (+ - * / %)
		
		int resultado1 = numero1 + numero2;
		
		System.out.println(resultado1);
		
		int resultado2 = numero1 - numero2;
		
		System.out.println(resultado2);
		
		int resultado3 = numero1 * numero2;
		
		System.out.println(resultado3);
		
		double resultado4 = (double)numero1 / numero2;
		
		System.out.println(resultado4);
		
		int resultado5 = numero1 % numero2;
		
		System.out.println(resultado5);
		*/
		
		
		/*
		//Operadores de incrementação e decrementação
		//pré-incremento: incrementa antes de rodar a linha de código
		System.out.println(++numero1);
		
		//pós-incremento: incrementa após rodar a linha de código
		System.out.println(numero1++);
		System.out.println(numero1);
		*/
		
		
		/*
		//Operadores de igualdade
		System.out.println(numero1 > numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 <= numero2);
		*/
		
		
		//Operadores Lógicos (&& ||)
		System.out.println("--------Tabela verdade do E----------");
		System.out.println("falso E falso: "+(false&&false));
		System.out.println("falso E verdadeiro: "+(false&&true));
		System.out.println("verdadeiro E falso: "+(true&&false));
		System.out.println("verdadeiro e verdadeiro: "+(true&&true));
		System.out.println();
		System.out.println("---------Tabela verdade do OU---------");
		System.out.println("falso E falso: "+(false||false));
		System.out.println("falso E verdadeiro: "+(false||true));
		System.out.println("verdadeiro E falso: "+(true||false));
		System.out.println("verdadeiro e verdadeiro: "+(true||true));
		
		
	}

}
