import java.util.Scanner;

public class Credito implements MtPagamento {

    Scanner sc = new Scanner(System.in);

    @Override
    public void tipoPag() {
        System.out.println("Digite o número de seu cartão:");
        final String cartao = sc.nextLine();
        System.out.println("Digite a data de validade de seu cartão:");
        final String data = sc.nextLine();
        System.out.println("Digite o código CVV de seu cartão:");
        final String cvv = sc.nextLine();
    }

    @Override
    public void valor(final double preco) {
        System.out.println("Total da compra R$ " + preco);
        System.out.println("Compra concluida");
    }

}