public class Exercicio03 {
    public static void executar() {

        int A = Prompt.lerInteiro("Digite um número: ");
        int B = Prompt.lerInteiro("Digite outro número: ");

        if (A > B) {
            Prompt.imprimir("A maior que B!");
        } else if (B > A) {
            Prompt.imprimir("B maior que A!");
        } else {
            Prompt.imprimir("Sequência de números inválida!");
        }

    }
}
