package introdução_ao_java;
import java.util.Scanner;

public class DécimoSextoPrograma_implementacao {
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		final String palavra = "palavra";
		String palavra2;
		System.out.print("\n\tBem vindo ao jogo da forca \n\tTente adivinhar a palavra: ");
		palavra2 = entrada.next();
		for (int tentativas = 7; tentativas >=0; tentativas--) {
			if (tentativas <1) {
				System.out.print("\n\tVocê perdeu");
				break;}
		if (!palavra2.equals(palavra)) {
			System.out.print("\n\tPalavra errada, tente novamente Lhe restam: " + tentativas + "\n\tDigite a palavra: " );
			palavra2 = entrada.next();		
		}else {
			System.out.println("\n\tVocê acertou a palavra!");
			break;

			}
		}
		entrada.close();}

		
}
		