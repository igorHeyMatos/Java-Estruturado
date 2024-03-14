public class Exercicio08 {
    public static void exercutar() {

        double num = Prompt.lerDecimal("Digite um número: ");

        if (num >= 50) {
            Prompt.imprimir("O número é maior ou igual a 50.");
        } else if (num < 50) {
            Prompt.imprimir("O número é menor que 50.");
        }

    }
}
