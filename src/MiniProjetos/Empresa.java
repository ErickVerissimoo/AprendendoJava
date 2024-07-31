package MiniProjetos;

import java.util.Scanner;

public class Empresa extends Gerenciamento {

	public Empresa(String nome, String CNPJ, int fundacao, String endereco, int funcionarios) {
		super(nome, CNPJ, fundacao, endereco, funcionarios);

	}

	public static void main(String[] args) {
		Scanner entrada;
		entrada = new Scanner (System.in);
		System.out.print("\n\tBem vindo ao gerenciamento da sua empresa");
		System.out.print("\n\tEntre com o nome da sua empresa:");

		String nome = entrada.nextLine();
		System.out.print("\n\n\tEntre com o ano de fundação da sua empresa:");
		Integer ano = entrada.nextInt();
		entrada.nextLine();
		System.out.print("\n\tEntre com o endereço da sua empresa:");
		String endereco = entrada.nextLine();
		System.out.print("\n\tEntre com o numero de funcionarios da sua empresa:");
		int funcionarios = entrada.nextInt();
		entrada.nextLine();

		System.out.print("\n\tEntre com o CNPJ da empresa:");
		String CNPJ = entrada.nextLine();
		Empresa erick;
		erick = new Empresa(nome, CNPJ, ano, endereco, funcionarios);
		System.out.print(erick.toString());
		entrada.close();
		Number x;

}}
