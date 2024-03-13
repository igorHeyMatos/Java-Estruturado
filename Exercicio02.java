public class Exercicio02 {
    public static void executar() {

        double num1 = Prompt.lerDecimal("Digite um número: ");
        double num2 = Prompt.lerDecimal("Digite outro número: ");

        double soma = num1 + num2;

        Prompt.imprimir("Soma: " + soma);
    }
}
