import java.util.*;

public class Cadastro {

    
    /** 
     * @param args
     */
    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);
        int n = 0;

        do{
            System.out.print("=== MENU === \n1.Inserir\n2.Remover\n0.Sair\nR:");
            n = l.nextInt();
            if(n == 1){
                System.out.print("=== CADASTRAR === \nTitulo: ");
                String titulo = l.next();
                System.out.print("Ator: ");
                String ator = l.next();
                System.out.print("Preço: ");
                double preço = l.nextDouble();
                Array.inserir(new livro(titulo, ator, preço));
                Array.mostrar();
            }

            if(n == 2){
                System.out.print("=== REMOVER ===\n id: ");
                int id = l.nextInt();
                Array.remover(id);

            }
        }while(n != 0);
        Array.mostrar();
    }

}