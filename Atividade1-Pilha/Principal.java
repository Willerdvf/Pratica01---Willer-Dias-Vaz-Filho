public class Principal{
    public static void main(String[] args){
        Pilha<String> pilha = new Pilha<String>("Linguagens de Programação");

        pilha.push("Java");
        pilha.push("Python");
        pilha.push("C");

        System.out.println("=== Pilha com três linguagens ===");
        pilha.imprimePilha();
        
        System.out.println("\n=== Removendo o topo da pilha ===");
        System.out.println("Elemento removido: " + pilha.pop());

        
        pilha.push("JavaScript");
        pilha.push("Kotlin");

        System.out.println("\n=== Pilha após adicionar mais duas linguagens ===");
        pilha.imprimePilha();
    }
}