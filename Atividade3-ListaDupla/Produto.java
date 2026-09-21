public class Produto{
    private String nome;
    private double preco;

    public Produto(){
        this(null, 0.0);
    }

    public Produto(String nome, double preco){
        setNome(nome);
        setPreco(preco);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString(){
        return String.format("Produto[Nome: %s, Preço: R$ %.2f]", getNome(), getPreco());
    }
}