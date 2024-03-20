public class Exercicio14 {
    public static void executar() {

        double a1 = Prompt.lerDecimal("Digite um número: ");
        double n = Prompt.lerDecimal("Digite um número: ");
        double r = Prompt.lerDecimal("Digite um número: ");

        double an = a1 + (n - 1) * r;

        Prompt.imprimir("O resultado é: " + an);

    }
}
