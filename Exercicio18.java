public class Exercicio18 {
    public static void executar() {
        double nota1 = Prompt.lerDecimal("Digite a nota1: ");
        double nota2 = Prompt.lerDecimal("Digite a nota2: ");
        double nota3 = Prompt.lerDecimal("Digite a nota3: ");

        double mediaHarm = (3 / ((1 / nota1) + (1 / nota2) + (1 / nota3)));

        Prompt.imprimir("Média harmônica: " + mediaHarm);
    }
}
