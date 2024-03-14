public class Exercicio04 {
    public static void executar() {

        double num1 = Prompt.lerDecimal("Digite um número: ");
        double num2 = Prompt.lerDecimal("Digite outro número: ");

        Prompt.imprimir("Soma: " + (num1 + num2));
        Prompt.imprimir("Subtração: " + (num1 - num2));
        Prompt.imprimir("Multiplicação: " + (num1 * num2));
        Prompt.imprimir("Divisão: " + (num1 / num2));

    }
}
