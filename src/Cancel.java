public class Cancel implements MtPagamento {

    
    @Override
    public void tipoPag() {
        
    }

    @Override
    public void valor(final double preco) {
        System.out.println("A compra no total de R$ " + preco + ", foi cancelada");
    }
    
}