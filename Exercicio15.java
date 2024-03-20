public class Exercicio15 {
    public static void executar() {
        double x1 = Prompt.lerDecimal("Digite o x1: ");
        double y1 = Prompt.lerDecimal("Digite o y1");
        double x2 = Prompt.lerDecimal("Digite o x2: ");
        double y2 = Prompt.lerDecimal("Digite o y2: ");

        double d = Math.sqrt (( Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

        Prompt.imprimir("Distancia: " + d);
    }
}
