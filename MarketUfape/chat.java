import java.util.ArrayList;
import java.util.List;

public class Chat {

    // Atributos
    private int id;
    private Usuario comprador;
    private Usuario vendedor;
    private Produto produto;
    private List<Mensagem> mensagens;

    // Construtor
    public Chat(int id, Usuario comprador, Usuario vendedor, Produto produto) {
        this.id = id;
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.produto = produto;
        this.mensagens = new ArrayList<>();
    }

    // Métodos

    public void abrirChat() {
        System.out.println("Chat aberto!");
    }

    public void fecharChat() {
        System.out.println("Chat fechado!");
    }

    public void finalizarNegocio() {
        System.out.println("Negócio finalizado!");
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}