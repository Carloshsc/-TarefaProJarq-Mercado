import java.util.ArrayList;

public class ListProd {

    public ArrayList<Produto> estoque;

    public ListProd(){
    estoque = new ArrayList<>();
    estoque.add(new Produto("Cavalo", 5000));
    estoque.add(new Produto("Pinguim", 2500));
    estoque.add(new Produto("Tartaruga", 500));
    estoque.add(new Produto("Ração", 20));
    }

    public String display(){
        String lista = "";
        int n = 1;

        for(int i=0; i<estoque.size(); i++){            
            lista += n + " - " + estoque.get(i).toString() + "\n";
            n++;
        }

        return lista;
    }

    public Produto getProd(int i){
        if(i<=0 || i>estoque.size()){
            return null;
        }
        return estoque.get(i-1);
    }

    
}