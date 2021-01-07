public class Produto {
    private String nome;
    private Float valor;

    public Produto(String nome, Float valor){
        this.nome = nome;
        this.valor = valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public float getValor(){
        return valor;
    }

}
