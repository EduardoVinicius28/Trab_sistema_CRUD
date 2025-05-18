public class Lanche extends Produto{
     public Lanche(int codigo, String nome, double preco) {
        
        super(codigo, nome, preco);
     }
     @Override
    public String exibirInformacoes() {
        return "Codigo: " + getCodigo() + "\n" + "Produto: " + getProduto() +"\n"+ "Preço: R$:" + getPreco();
    }
}
