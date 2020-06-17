import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Fachada {
    
    private final List<ClienteObserver> observers = new ArrayList<>(); 
    ListProd produtos = new ListProd();
    Scanner sc = new Scanner(System.in);

    public void addList(ClienteObserver obs){
        this.observers.add(obs);

    }


    public void addCarrinho(int i){
        EventProd event = new EventProd(produtos.getProd(i));
        for(ClienteObserver x : this.observers){
            x.addProd(event);
        }

    }

    public void metodoPag(){
        MtPagamento modo = null;
        boolean pronto=true;

        while(pronto){
            System.out.println("\nEscolha seu método de pagamento:");
            System.out.println("1 - Cartão de Débito");
            System.out.println("2 - Cartão de Crédito");
            System.out.println("3 - Boleto Bancário");
            System.out.println("4 - PayPal");
            System.out.println("5 - Cancelar Compra");

            int op = sc.nextInt();

            if(op>=1 && op<=5){
                modo = FactoryMtPagamento.tipoPag(op);
                pronto = false;
            }else{
                System.out.println("Valor invalido, tente de novo");
            }
        }

        modo.tipoPag();
        double valorCompra = CarrinhoClient.getInstance().valorTotal();
        modo.valor(valorCompra);

    }

    public void listaCarrinho(){
        System.out.println(CarrinhoClient.getInstance().listaProd());
    }

    public void listaProd(){
        System.out.println(produtos.display());
    }

    public void encerraCompra(){
        System.out.println("Sessão Encerrada!");


    }


}