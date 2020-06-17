import java.util.Scanner;

public class Paypal implements MtPagamento {

    Scanner sc = new Scanner(System.in);

    @Override
    public void tipoPag() {
        System.out.println("Digite o seu email:");
        final String email = sc.nextLine();
        System.out.println("Digite sua senha:");
        final String senha = sc.nextLine();
    }

    @Override
    public void valor(final double preco) {
        System.out.println("Total da compra R$ " + preco);
        System.out.println("Compra concluida");
    }
    
}