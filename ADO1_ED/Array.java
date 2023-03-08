import java.util.Random;

public class Array {

    private static livro[] lista = new livro[3];
    private static int indice = 0;

    static Random gerar = new Random();
    
    /** 
     * @param p
     */
    public static void inserir(livro p) {
        if (indice < lista.length) {
            lista[indice++] = p;
        } else {
            lista = alocarNovoArray();
            inserir(p);
        }

        p.setId(gerar.nextInt(100));
    }

    /** 
     * @return livro[]
     */
    private static livro[] alocarNovoArray() {

        livro[] novo = new livro[lista.length + 4];

        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    /**
     * Exibe o conteúdo relevante do array.
     */
    public static void mostrar() {
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i]);
        }
    }

    /**
     * Realiza a busca, por id, de um objeto no vetor lista.
     *
     * @param id int
     * @return Pessoa
     */
    public static int buscar(int id) {
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == lista[meio].getId()) {
                return meio;
            } else if (id > lista[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
    
    /** 
     * @param id
     * @return boolean
     */
    public static boolean remover(int id) {
        int rem = buscar(id);
        if (rem != -1) {
            for (int i = rem; i < indice - 1; i++) {
                lista[i] = lista[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }
}