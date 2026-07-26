public class Avaliacao {

    // Atributos
    private int id;
    private int nota;
    private String comentario;
    private Usuario autor;
    private Usuario vendedorAvaliado;

    // Construtor
    public Avaliacao(int id, int nota, String comentario,
                     Usuario autor, Usuario vendedorAvaliado) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
        this.autor = autor;
        this.vendedorAvaliado = vendedorAvaliado;
    }

    // Método

    public void publicarAvaliacao() {
        System.out.println("Avaliação publicada com sucesso!");
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Usuario getVendedorAvaliado() {
        return vendedorAvaliado;
    }

    public void setVendedorAvaliado(Usuario vendedorAvaliado) {
        this.vendedorAvaliado = vendedorAvaliado;
    }
}