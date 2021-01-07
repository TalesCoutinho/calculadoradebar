import java.util.HashMap;

public class Cliente {

    private String nome;
    private float conta = (float)0.0;
    private HashMap<Produto, Integer> lista = new HashMap<>();

    public Cliente(String nome){
        this.nome = nome;
    }

    public void addProduto(Produto item){
        Integer valorAtual = lista.get(item);
        if(lista.containsKey(item)) lista.replace(item,valorAtual++);
        else{
            lista.put(item, 1);
        }
    }

    //assume-se aqui que o cliente possui o produto em sua lista
    public void removeProduto(Produto item, Integer quantidadeASerRetirada){
        Integer valorAtual = lista.get(item);
        if(valorAtual > quantidadeASerRetirada) lista.replace(item, valorAtual - quantidadeASerRetirada);
            else lista.remove(item);
    }

    public HashMap<Produto, Integer> getLista(){
        return lista;
    }

    public float getConta(){
        return conta;
    }

    public void addConta(float valor){
        conta += valor;
    }

    public String getNome(){
        return nome;
    }
}

