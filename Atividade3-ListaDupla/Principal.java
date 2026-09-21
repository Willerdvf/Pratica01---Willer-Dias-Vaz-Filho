public class Principal{
    public static void main(String[] args){
        ListaDupla<Produto> lista = new ListaDupla<Produto>("Produtos");

    
        lista.addInicio(new Produto("Arroz", 25.90));
        lista.addFinal(new Produto("Leite", 5.49));
        lista.addMeio(new Produto("Queijo", 32.00), 1);

        System.out.println("=== Lista com três produtos ===");
        lista.imprimeLista();

        System.out.println("\n=== Removendo o segundo produto da lista ===");
        System.out.println("Produto removido: " + lista.removeMeio(1));

        
        lista.addInicio(new Produto("Manteiga", 12.75));
        lista.addFinal(new Produto("Biscoito", 4.99));

        System.out.println("\n=== Lista após adicionar um produto no início e um no final ===");
        lista.imprimeLista();
    }
}