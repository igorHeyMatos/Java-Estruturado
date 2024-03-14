public class Exercicio05 {
    public static void executar() {

        double A = Prompt.lerDecimal("Digite um valor:");
        double B = Prompt.lerDecimal("Digite outro valor para ser trocado: ");

        Prompt.imprimir("Valor original: " + A);
        Prompt.imprimir("Valor original: " + B);

        double aux = B;
        B = A;
        A = aux;

        Prompt.imprimir("Valor trocado: " + A);
        Prompt.imprimir("Valor trocado: " + B);

    }
}
