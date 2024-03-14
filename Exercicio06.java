public class Exercicio06 {
    public static void executar() {

        double C = Prompt.lerDecimal("Digite a temperatura em Celsius: ");
        double F = (9 * C + 160) / 5;

        Prompt.imprimir("Celsius: " + C);
        Prompt.imprimir("Fahrenheit: " + F);

    }
}
