import java.time.LocalDate;

public class HistoricoVendas {

    // Atributos
    private int id;
    private Usuario vendedor;
    private Produto produto;
    private LocalDate dataVenda;
    private int quantidadeVendida;

    // Construtor vazio
    public HistoricoVendas() {

    }

    // Construtor completo
    public HistoricoVendas(int id, Usuario vendedor, Produto produto,
                           LocalDate dataVenda, int quantidadeVendida) {

        this.id = id;
        this.vendedor = vendedor;
        this.produto = produto;
        this.dataVenda = dataVenda;
        this.quantidadeVendida = quantidadeVendida;
    }

    // Método

    public void gerarRegistro() {
        System.out.println("Registro de venda gerado com sucesso!");
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    @Override
    public String toString() {
        return "HistoricoVendas{" +
                "id=" + id +
                ", vendedor=" + vendedor +
                ", produto=" + produto +
                ", dataVenda=" + dataVenda +
                ", quantidadeVendida=" + quantidadeVendida +
                '}';
    }
}
