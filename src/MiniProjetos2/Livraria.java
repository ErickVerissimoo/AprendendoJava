package MiniProjetos2;

import java.util.ArrayList;

public final class Livraria implements LivrariaRegras{
	static ArrayList <Livro> livros = new ArrayList<>();
	private static int estoqueTotal = 0;
	@Override
	public void CadastrarLivro() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Vender() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Login() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void AdicionarAoCarrinho() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void AplicarDesconto() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String... args) {
		// TODO Auto-generated method stub

	}

	static int getEstoqueTotal() {
		return estoqueTotal;
	}

	static void setEstoqueTotal() {
		for (Livro Livros : livros) {
			estoqueTotal++;
			
		}
	
	}

	
}
