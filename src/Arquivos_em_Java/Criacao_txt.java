package Arquivos_em_Java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
public class Criacao_txt {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\Users\\ERICK VERISSIMO\\git\\AprendendoJava\\src\\Arquivos_em_Java\\Java2.txt");
		/* Files.delete(path);
		if(Files.notExists(path)) {
			Files.createFile(path);
			String textinho = "Arquivo criado usando a linguagem java";
			Files.writeString(path, textinho);
		} else {
			System.out.println("Já existe");
		}
	}*/
		List <String> string = Files.readAllLines(path);
		for (String texto:string) {
			System.out.print(texto);
		}
}}
