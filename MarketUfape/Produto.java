public class Produto {

    // Atributos
    private int id;
    private String nome;
    private String descricaoProduto;
    private String fotoProduto;
    private double preco;
    private boolean disponivel;
    private Usuario vendedor;
    private Categoria categoria;
    private int quantidadeDisponivel;
    private String turnoDisponibilidade;
    private String formasPagamento;

    // Construtor vazio
    public Produto() {

    }

    // Construtor completo
    public Produto(int id, String nome, String descricaoProduto,
                   String fotoProduto, double preco,
                   boolean disponivel, Usuario vendedor,
                   Categoria categoria, int quantidadeDisponivel,
                   String turnoDisponibilidade,
                   String formasPagamento) {

        this.id = id;
        this.nome = nome;
        this.descricaoProduto = descricaoProduto;
        this.fotoProduto = fotoProduto;
        this.preco = preco;
        this.disponivel = disponivel;
        this.vendedor = vendedor;
        this.categoria = categoria;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.turnoDisponibilidade = turnoDisponibilidade;
        this.formasPagamento = formasPagamento;
    }

    // Métodos

    public void cadastrarProduto() {
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void editarProduto() {
        System.out.println("Produto editado com sucesso!");
    }

    public void excluirProduto() {
        System.out.println("Produto excluído com sucesso!");
    }

    public void registrarVenda() {
        System.out.println("Venda registrada com sucesso!");
    }

    public void buscarPorCategoria() {
        System.out.println("Buscando por categoria...");
    }

    public void buscarPorTurno() {
        System.out.println("Buscando por turno...");
    }

    public void buscarPorFormaPagamento() {
        System.out.println("Buscando por forma de pagamento...");
    }

    public void buscarPorFiltrosCombinados() {
        System.out.println("Buscando por filtros...");
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getFotoProduto() {
        return fotoProduto;
    }

    public void setFotoProduto(String fotoProduto) {
        this.fotoProduto = fotoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTurnoDisponibilidade() {
        return turnoDisponibilidade;
    }

    public void setTurnoDisponibilidade(String turnoDisponibilidade) {
        this.turnoDisponibilidade = turnoDisponibilidade;
    }

    public String getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(String formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                '}';
    }
}
