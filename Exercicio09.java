public class Exercicio09 {
    public static void executar() {
        double A = Prompt.lerDecimal("Digite um número: ");
        double B = Prompt.lerDecimal("Digite outro número: ");

        if (A == B) {
            Prompt.imprimir("Os números são iguais!");
        } else if (A != B) {
            Prompt.imprimir("Os números são diferentes!");
            if (A > B) {
                Prompt.imprimir("A é maior que B! Número: " + A);
            } else {
                Prompt.imprimir("B é maior que A! Número: " + B);
            }
        }
    }
}
