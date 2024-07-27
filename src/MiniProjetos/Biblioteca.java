package MiniProjetos;

import java.util.*;


public class Biblioteca {
    public static ArrayList <Livro> armazenamento = new ArrayList<>();
    public static Livro livro;
    public static Scanner entrada;

    public static void AdicionarLivro(){
        entrada = new Scanner (System.in);
        System.out.print("Você escolheu adicionar livro \n\tEntre com o autor");
        String autor = entrada.nextLine();
        
      
        genero GENERO;
        System.out.println("Entre com o ano: ");
        int ano = entrada.nextInt();
      
        System.out.println("Entre com o id:");
        int id = entrada.nextInt();
        
        System.out.println("entre com o genero: \n\t1 - Suspense \n\t2- Ação \n\t3 - Romance"
        +  "\n\t4 - Biografico \n\t5 - Infatil \n\t6 - Fabula \n\t7 - erotico");
        int gender = entrada.nextInt();
        switch (gender) {
            case 1:
            GENERO = genero.SUSPENSE;
          
            livro = new Livro(autor, id, ano, GENERO);
                break;
            case 2:
            GENERO = genero.AÇÃO;
        
            livro = new Livro(autor, id, ano, GENERO);
            case 3:
            GENERO = genero.ROMANCE;
          
            livro = new Livro(autor, id, ano, GENERO);
            case 4:
            GENERO = genero.BIOGRAFICO;
           
            livro = new Livro(autor, id, ano, GENERO);
            case 5: 
            GENERO = genero.INFANTIL;
        
            livro = new Livro(autor, id, ano, GENERO);
            case 6:
            GENERO = genero.FABULA;
          
            livro = new Livro(autor, id, ano, GENERO);
            case 7: 
            GENERO = genero.EROTICO;
             
            livro = new Livro(autor, id, ano, GENERO);
            default:
            System.out.println("Entrada invalida");
                break;
        }
        armazenamento.add(livro);
        System.out.println("Livro adicionado com sucesso");
        
    }
    public static void main(String[] args) {
        System.out.print("Bem vindo ao gerenvciamento da biblioteca ");
        AdicionarLivro();
        System.out.println(livro.getGenero().toCapitali);
    }
}
