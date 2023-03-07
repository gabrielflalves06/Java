
class livro{
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAtor() {
        return ator;
    }

    public void setAtor(String ator) {
        this.ator = ator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livro["+ "id:"+ id + ", Ator:" + ator  + ", Titulo:" + titulo + ", Preço:" + preço + ']';
    }
}

