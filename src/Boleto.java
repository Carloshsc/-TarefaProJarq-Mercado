import java.util.Scanner;

public class Boleto implements MtPagamento {

    Scanner sc = new Scanner(System.in);

    @Override
    public void tipoPag() {
        System.out.println("O código de barra de seu boleto é: 34191.75041 38244.392528 50040.380003 2 000 ");
       
    }

    @Override
    public void valor(final double preco) {
        System.out.println("Pague o boleto de valor R$ "+ preco + ", na loterica mais proxima");
    }

}