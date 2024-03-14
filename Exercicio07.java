public class Exercicio07 {
    public static void exercutar() {
        double num = Prompt.lerDecimal("Digite um número: ");

        if (num >= 100 && num <= 200) {
            Prompt.imprimir("O número está entre 100 e 200.");
        } else {
            Prompt.imprimir("O número está fora do intervalo");
        }
    }
}
