public class Lanche extends Produto{ //Classe Lanche que herda de Produto
     public Lanche(int codigo, String nome, double preco) {
        
        super(codigo, nome, preco);
     }
     //Implementação do método exibirInformacoes
     @Override
    public String exibirInformacoes() {
        return "Codigo: " + getCodigo() + "\n" + "Produto: " + getProduto() +"\n"+ "Preço: R$:" + getPreco();
    }
}
