package MiniProjetos2;

public class Ebook extends Livro{
	@Override
	protected double AplicarDesconto(double porcentagem) {
		
		if(porcentagem*0.01 >10) {
			System.err.print("entrada invalida, o desconto não"
					+ "pode ser superior a 10 porcento do valor"
					+ "do livro fisico"); return 0;}
	
	
		return super.AplicarDesconto(porcentagem);}
	}

