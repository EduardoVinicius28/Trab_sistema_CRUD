import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            boolean iniciar = true; 
            int menu;
            
            ArrayList<Produto> listaProdutos = new ArrayList<>();

            while (iniciar) {
                //MENU!
                System.out.println("\n-------China Lanches-------\n");
                System.out.println("Menu do operador\n");
                System.out.println("1-Cadastrar Produto");
                System.out.println("2-Listar Produtos");
                System.out.println("3-Consultar Produto por Codigo");
                System.out.println("4-Atualizar Produto");
                System.out.println("5-Deletar Produto");
                System.out.println("6-Sair\n");
                menu = scanner.nextInt();


                switch (menu) {
                    case 1://cadastrar
                    System.out.print("Código: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    listaProdutos.add(new Lanche(codigo, nome, preco)); //ira gravar as informações no array
                    System.out.println("Produto cadastrado com sucesso!");
                        break;
                    case 2:
                    for(int i = 0; i < listaProdutos.size(); i++){
                    System.out.println(listaProdutos.get(i).exibirInformacoes() + "\n");
                    }
                        break;

                    case 3://pesquisar produto
                    System.out.println("Digite o codigo do produto que deseja pesquisar:");
                    int codigoPesquisar = scanner.nextInt();
                    boolean encontrado = false;

                    for(Produto i : listaProdutos){//percorre os produtos do array
                        if(i.getCodigo() == codigoPesquisar){ //compara os codigos
                            System.out.println("Produto encontrado.");
                            System.out.println(i.exibirInformacoes());//imprime as infor. do prod.
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Produto com codigo " + codigoPesquisar + "não encontrado.");
                    }
                    break;
                    case 4://atualizar produto
                    for(Produto i : listaProdutos){
                        System.out.println("Informe o codigo do produto que deseja atualizar: ");
                        int codigoUptd = scanner.nextInt();
                        scanner.nextLine(); //evitar bugs com o nextLine
                        boolean atualizado = false;

                        if(i.getCodigo() == codigoUptd){//compara os codigos
                            System.out.println("Produto atual:\n" + i.exibirInformacoes());//inf. atuais do produto
                            System.out.println("Novo nome:");
                            String novoNome = scanner.nextLine();
                            i.setProduto(novoNome);
                            System.out.println("Novo preço:");
                            double novoPreco = scanner.nextDouble();
                            i.setPreco(novoPreco);
                        
                            System.out.println("Produto atualizado com sucesso");
                            atualizado = true;
                            break;
                        }
                        if (!atualizado) {
                            System.out.println("Produto do codigo " + codigoUptd + " não foi encontrado.");
                        }
                    }
                    break;
                    case 5://deletar produto
                    System.out.println("Digite o codigo do produto que deseja deletar: ");
                    int codigoDeletar = scanner.nextInt();
                    boolean removido = false; //serve para constar se o produto foi removido ou nao

                    for(int i = 0; i < listaProdutos.size(); i++){
                        if(listaProdutos.get(i).getCodigo() == codigoDeletar){ //codigo do produto é igual ao codigo digitado?
                            listaProdutos.remove(i); //remove
                            System.out.println("Produto removido com sucesso.");
                            removido = true; 
                            break;
                        }
                        if (!removido) { //serve para constar se o produto foi removido ou nao
                            System.out.println("Produto com código " + codigoDeletar + " não foi encontrado.");
                        }
                    }
                        break;
                    case 6:
                    System.out.println("Fechando o programa...");
                    iniciar = false;
                        break;
                    default:
                    System.out.println("item invalido!");
                        break;
                }
            }
            scanner.close();
        } catch (InputMismatchException e) {//se o usuario digitar uma letra no lugar de um numero
            System.out.println("ERRO! Você digitou um valor inválido!");
            } finally{
                System.out.println("\nBy: Eduardo Vinicius || Elias Bezerra \nGitHub: EduardoVinicius28\nLink do projeto: https://github.com/EduardoVinicius28/Trab_sistema_CRUD");
                System.out.println("Sistema encerrado.");
            }
    }
}
