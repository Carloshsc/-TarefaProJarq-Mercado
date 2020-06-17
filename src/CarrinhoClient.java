import java.util.ArrayList;

public class CarrinhoClient implements ClienteObserver {

    private ArrayList<Produto> estoque;
    private static CarrinhoClient ins;

    private CarrinhoClient(){
        this.estoque = new ArrayList<Produto>(); 
    }

    public static CarrinhoClient getInstance() {
        if(ins==null){
            ins = new CarrinhoClient();
        }
        return ins;
    }


    @Override
    public void addProd (EventProd event) {
        estoque.add(event.getProduto());
    }

    @Override
    public String listaProd() {
        String lista = "";
        for (int i = 0; i < estoque.size(); i++) {
            lista += estoque.get(i).toString() + "\n";
        }
        return lista;
    }

    @Override
    public double valorTotal() {
        double total=0;
        for(int i=0; i<estoque.size(); i++){
            total += estoque.get(i).getPreco();
        }
        return total;
    }


    
}