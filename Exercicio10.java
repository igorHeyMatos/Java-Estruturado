public class Exercicio10 {
    public static void executar() {
        int num = Prompt.lerInteiro("Digite um número de 1 a 5: ");

        if (num == 1) {
            Prompt.imprimir("Um");
        } else if (num == 2) {
            Prompt.imprimir("Dois");
        } else if (num == 3) {
            Prompt.imprimir("Três");
        } else if (num == 4) {
            Prompt.imprimir("Quatro");
        } else if (num == 5) {
            Prompt.imprimir("Cinco");
        } else {
            Prompt.imprimir("Número inválido!");
        }
    }
}
