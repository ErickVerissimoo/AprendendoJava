package source.introduçãoAProgramaçãoOrientadaObjeta;
import java.util.Scanner;
import source.classes.Empresa;
public class TerceiroPrograma_metodos_e_objetos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		/*
		 * Instancia o objeto empresa, permitindo manipular suas informações e atributos
		 * Como já dito anteriormente, um objeto é uma derivação direta de uma classe
		 */
		Empresa empresa1 = new Empresa();
		int escolha;
		while (true) {
		System.out.print("\n\tO que você quer fazer? \n\t1 - Demitir \n\t2 - Contratar");
		escolha = entrada.nextInt();
		/*
		 * Cada if chama um método contido em outro arquivo. 
		 */
		if (escolha ==1) {
			empresa1.demitir();
		}
		if(escolha == 2) {
			empresa1.contratar();
		}
		if(escolha!= 1 && escolha!=2) {
			System.out.println("\n\tInválido");
			break;
		}}entrada.close();}}


