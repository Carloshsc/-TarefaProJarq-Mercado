import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Fachada fachada = new Fachada();

        fachada.addList(CarrinhoClient.getInstance());

        System.out.println("Bem-Vindo a loja \n");

        boolean compra = true;

        while(compra){


            System.out.println("O que você gostaria de fazer?");


            System.out.println("1 - Comprar algo");
            System.out.println("2 - Ver seu carrinho");
            System.out.println("3 - Pagar o carrrinho");

            int op = sc.nextInt();

            for(int i=0; i<50; i++){System.out.println("\n");}

            switch(op){
                case 1:
                    fachada.listaProd();
                    System.out.println("Digite o número do produto que você gostaria de comprar");
                    int id = sc.nextInt();

                    while (id < 1 || id > 5) {
                        System.out.println("Valor invalido, tente de novo");
                        id = sc.nextInt();
                    }

                    fachada.addCarrinho(id);
                    for (int i = 0; i < 50; i++) {
                        System.out.println("\n");
                    }
                    break;
                
                case 2:
                    System.out.println("Seu carrinho:");
                    fachada.listaCarrinho();
                    break;
                
                case 3:
                    fachada.metodoPag();
                    fachada.encerraCompra(); 
                    compra = false;
                    break;

                default: 
                    System.out.println("Número Invalido");
                    break;

            }
            
                        
        }

    }
}