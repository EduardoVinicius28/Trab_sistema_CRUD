public abstract class Produto implements interf{ //Classe base com os dados comuns dos produtos

    private int codigo;
    private String produto;
    private double preco;
    //Construtor
    public Produto(){};
    public Produto(int codigo, String produto, double preco){
        this.codigo = codigo;
        this.produto = produto;
        this.preco = preco;
    };
    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getProduto() {
        return produto;
    }
    public void setProduto(String produto) {
        this.produto = produto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
