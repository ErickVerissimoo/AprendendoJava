package MiniProjetos;

import java.util.*;
public class geradorEmail {
    public static int escolha2=0, escolha=0;
    public static  Scanner entrada = new Scanner (System.in);
	public static void Gerar() {
		Random carac = new Random();
                int [] vetor = new int[18];
		int i = 0;
		String caracteres = "AhbcJNDAJSBoa asdkbJNJASND-IWQ9I3480938%r(&@*&@(*@)(NDNLXCDOHF]~ÇQP2=02475HD*-";
		System.out.print("\n\tBem vindo ao gerador de email e senha para um funcionario contratado"
				+ "\n\tdigite o nome do funcionario:");
		String nome = entrada.next();
		System.out.print("\n\tDigite o sobrenome:");
		String sobrenome = entrada.next();
		System.out.print("\n\tDigite o ano de nascimento:");
		int ano = entrada.nextInt();
		System.out.printf("\n\temail: %s%s%d@empresa.com", nome, sobrenome, ano);
                while(i<16){
                    vetor [i] = carac.nextInt(0, 17);
                    i++;}
				System.out.printf("\n\tA sua senha é: %s%s%s%s%s%s%s%s%s%s"
						+ "%s%s%s%s%s%s%s",caracteres.charAt(vetor[0]),
						caracteres.charAt(vetor[1]),caracteres.charAt(vetor[2]),
						caracteres.charAt(vetor[3]),caracteres.charAt(vetor[4]),
						caracteres.charAt(vetor[5]),caracteres.charAt(vetor[6]),
						caracteres.charAt(vetor[7]), caracteres.charAt(vetor[8]),
						caracteres.charAt(vetor[9]), caracteres.charAt(vetor[10]),
						caracteres.charAt(vetor[11]), caracteres.charAt(vetor[12]),
						caracteres.charAt(vetor[13]), caracteres.charAt(vetor[14]),
						caracteres.charAt(vetor[15]), caracteres.charAt(vetor[16]));
								
			}
	public static void main(String[] args) {
               
          
            System.out.print("\n\tBem vindo ao gerador de email e senha! \n\tVocê deseja gerar uma senha? "
                    + "\n\t1- Sim"
                    + "\n\t2 - Não"
                    + "\n\tDigite: ");
           escolha = entrada.nextInt();
            while(escolha==1 || escolha2 ==1){
		Gerar();
                System.out.print("\n\tVocê deseja continuar gerando credenciais? "
                                                                        + "\n\t1 - Sim"
                                                                        + "\n\t2 - Não"
                                                                        + "\n\tDigite: ");
                                                                 escolha2 = entrada.nextInt();
                                                                 if(escolha2!=1 || escolha!= 1){
                                                                     System.out.print("\n\tPrograma encerrado");
                                                                     break;
                                                                 }
	}}}


