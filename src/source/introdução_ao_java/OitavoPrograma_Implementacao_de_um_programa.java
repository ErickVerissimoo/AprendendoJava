package source.introdução_ao_java;
import java.util.Scanner;

public class OitavoPrograma_Implementacao_de_um_programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int Nota1=0;
		int Nota2=0;
		String Nome="";
		int Media = 6;
		System.out.print("Bem vindo ao programa de calcular notas \nInsira seu nome:");
		Nome=entrada.next();
		System.out.print("Insira a primeira nota: ");
		Nota1=entrada.nextInt();
		System.out.print("Insira a segunda nota: ");
		Nota2=entrada.nextInt();
		Media= (Nota1+Nota2)/2;
		if (Media<6) {
			System.out.print("Nome do aluno: " + Nome + "\nSituação: Reprovado");	
		} else if (Media>=6) {
			System.out.print("Nome do aluno: " + Nome + "\nSituação: Aprovado");
		} 	
		entrada.close();
		/*
		 * O programa acima é um programa básico, que exibe a situação
		 * do aluno com base nas notas inseridas. Aqui é aplicado todos os
		 * conceitos básicos anteriores. 
		 */
	}
}