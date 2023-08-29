package cursoJava.basico;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercicio02 {
	public static void main(String[] args) {
		int idadeAnos = 25, idadeMeses = 10, idadeDias = 2;
		
		double idadeSomenteEmDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
		
		LocalDate aniversario = LocalDate.of(1997, 10, 26);
		
		long dias = aniversario.until(LocalDate.now(), ChronoUnit.DAYS);
		
		System.out.println("Meu calculo: "+idadeSomenteEmDias);

		System.out.println("Tempo real:"+dias);
	}

}
