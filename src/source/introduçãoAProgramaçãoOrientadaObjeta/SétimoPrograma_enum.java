package source.introduçãoAProgramaçãoOrientadaObjeta;
import source.classes.Estado_civil;
import source.classes.usuario;
public class SétimoPrograma_enum {

	public static void main(String[] args) {
		/*
		 * O enum é basicamente a criação de uma váriavel na qual tem a ela
		 * atribuido um conjunto de valores constantes pré estabelecidos. Caso
		 * você queira ver em detalhes o enum que eu criei, vá em ignore->classes->Estado_civil.
		 * Isso vale para qualquer import que eu fizer aqui. Por favor cheque os diretórios dos
		 * pacotes para ver o código em detalhes, e não apenas eu chamando o método na classe
		 * principal de outro arquivo.
		 */
		usuario User = new usuario(1.80, 59, "Erick", true, true, Estado_civil.divorciado);
		/*
		 * Usamos o get para obter o valor atribuido a variavel estado civil que contém nela
		 * o enum "Estado_civil" e pode retornar qualquer valor contido no enum. Retornamos
		 * o valor divorciado.
		 */
		System.out.println(User.getEstado());



		}

	}

