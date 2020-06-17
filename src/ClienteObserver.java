public interface ClienteObserver {
    
    void addProd(EventProd event);
    String listaProd();
    double valorTotal();

}