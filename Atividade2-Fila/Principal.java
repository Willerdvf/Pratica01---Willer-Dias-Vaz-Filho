public class Principal{
    public static void main(String[] args){
        Fila<String> fila = new Fila<String>("Alunos");

        fila.enfileirar("Ana");
        fila.enfileirar("Bruno");
        fila.enfileirar("Carla");

        System.out.println("=== Fila com três alunos ===");
        fila.imprimeFila();

        System.out.println("\n=== Removendo o primeiro aluno da fila ===");
        System.out.println("Aluno removido: " + fila.desenfileirar());

        
        fila.enfileirar("Daniel");
        fila.enfileirar("Eduarda");

        System.out.println("\n=== Fila após adicionar mais dois alunos ===");
        fila.imprimeFila();
    }
}