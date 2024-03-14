public class Exercicio11 {
    public static void executar() {
        int num1 = Prompt.lerInteiro("Digite um número: ");
        int num2 = Prompt.lerInteiro("Digite outro número: ");
        int num3 = Prompt.lerInteiro("Digite outro número: ");

        if (num1 < num2 && num1 < num3 && num2 < num3) {
            Prompt.imprimir("|" + num1 + "|" + num2 + "|" + num3 + "|");
        } else if (num2 < num1 && num2 < num3 && num1 < num3) {
            Prompt.imprimir("|" + num2 + "|" + num1 + "|" + num3 + "|");
        } else if (num3 < num1 && num3 < num2 && num2 < num1) {
            Prompt.imprimir("|" + num3 + "|" + num2 + "|" + num1 + "|");
        }
    }
}
