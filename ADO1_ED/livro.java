
class livro{
    public static int length;
    int id;
    String titulo, ator;
    double preço;

    public livro() {
    }

    public livro(String titulo, String ator,double preço) {
        this.titulo = titulo;
        this.ator = ator;
        this.preço = preço;
    }

    
    /** 
     * @return String
     */
    public String getTitulo() {
        return titulo;
    }

    
    /** 
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    /** 
     * @return String
     */
    public String getAtor() {
        return ator;
    }

    
    /** 
     * @param ator
     */
    public void setAtor(String ator) {
        this.ator = ator;
    }

    
    /** 
     * @return int
     */
    public int getId() {
        return id;
    }

    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Livro["+ "id:"+ id + ", Ator:" + ator  + ", Titulo:" + titulo + ", Preço:" + preço + ']';
    }
}

