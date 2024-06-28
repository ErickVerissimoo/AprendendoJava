/*
 * Este é o segundo programa de microconteudos. Aqui falaremos brevemente 
 * sobre como chamar um método construtor de uma superclasse e repassar
 * os parâmetros da superclasse para a subclasse.
 * 
 * Exemplificando, temos a superclasse animal, que contém um método construtor.
 * Caso a classe que herde os atributos deseje utilizar o mesmo método construtor
 * da superclasse, usamos o "super" para indicar que o método construtor da 
 * classe recebe os parâmetros da superclasse.
 */

package source.microConteudos;
import source.superClasse.*;
public class Felino extends Animal {
	public Felino(String categoria, int idade, boolean marinho) {
		/*´
		 * Usamos o comando abaixo para chamar o construtor de uma 
		 * superclasse. Podemos passar qualquer parâmetro aqui, desde
		 * que atenda aos requisitos contidos no método construtor do
		 * arquivo da superclasse. Por exemplo, podemos substituir "categoria"
		 * por qualquer palavra, assim como podemos substituir "int" por qualquer
		 * valor INTEIRO.
		 */
		super(categoria, idade, marinho);}
	public static void main(String[] args) {
		Felino gato = new Felino("Felino", 5, false);
                System.out.print(gato);
}}