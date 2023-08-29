package cursoJava.basico;
/*
 * Classe demonstrativas de variáveis e constantes.
 * 
 * vesão: 1.0
 * 
 * autor: Erika Pimentel
 *  
 */
public class VariaveisEConstantes {

	public static void main(String[] args) {
		//Criação de constantes
		final double ACELERACAO_GRAVIDADE_TERRA = 9.80665;
		
		//Criação de variáveis
		String nome="José";
		
		int idade=48;
		
		double peso=73.4, altura=1.73;
		
		char sexo='m', cnh='a';
		
		boolean doadorOrgaos=true;
		
		System.out.println("Nome: "+nome);
		
		System.out.println("Idade: "+idade);
		
		System.out.println("Peso: "+peso);
		
		System.out.println("Altura: "+altura);
		
		System.out.println("Sexo: "+sexo);
		
		System.out.println("Habilitação: "+cnh);
		
		System.out.println("É doador de órgãos: "+doadorOrgaos);
		
		System.out.println("Gravidade na terra é: "+ACELERACAO_GRAVIDADE_TERRA+" m/s2");
	}

}
