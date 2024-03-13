public class Exercicio01 {
    public static void executar() {

        // String nome = Prompt.lerlinha("Digite o seu nome: ");
        // double nota = Prompt.lerDecimal("Digite sua nota: ");
        // Prompt.imprimir("Nome: " + nome);
        // Prompt.imprimir("Nota: " + nota);

        /////////

        int num = Prompt.lerInteiro("Digite um número: ");

        if (num > 10) {
            Prompt.imprimir("Número maior que 10!");
        } else if (num <= 10) {
            Prompt.imprimir("Número menor ou igual a 10!");
        }
        
    }
}
