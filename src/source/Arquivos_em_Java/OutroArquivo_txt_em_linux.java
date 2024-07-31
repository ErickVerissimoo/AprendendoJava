package source.Arquivos_em_Java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class OutroArquivo_txt_em_linux {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("/home/gil/Área de Trabalho/Texto.txt");
		if(Files.notExists(path)) {
			Files.createFile(path);
			String textinho = "Arquivo criado usando a linguagem java";
			Files.writeString(path, textinho);
	}
	}
}
