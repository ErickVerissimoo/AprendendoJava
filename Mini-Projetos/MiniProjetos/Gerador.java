package MiniProjetos;
import superClasse.SerVivo;
import java.util.*;
public class Gerador extends SerVivo {

	protected Gerador(String tipo, int idade, Boolean sexo, Boolean extinto) {
		super(tipo, idade, sexo, extinto);
	}
	public static void main(String[] args) {
		Gerador macaco = new Gerador("Macaco", 22, true, false);	
	}
}
