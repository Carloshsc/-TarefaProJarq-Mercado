public class FactoryMtPagamento {

    public static MtPagamento tipoPag(int i){
        switch(i){
            case 1: return new Debito();
            case 2: return new Credito();
            case 3: return new Boleto();
            case 4: return new Paypal();
            case 5: return new Cancel();
        }
        return null;
    }
    
}