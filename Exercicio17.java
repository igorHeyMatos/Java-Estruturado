public class Exercicio17 {
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Digite a nota1: ");
        double peso1 = Prompt.lerDecimal("Digite o peso1: ");
        double nota2 = Prompt.lerDecimal("Digite a nota2: ");
        double peso2 = Prompt.lerDecimal("Digite o peso2: ");
        double nota3 = Prompt.lerDecimal("Digite a nota3: ");
        double peso3 = Prompt.lerDecimal("Digite o peso3: ");

        double mediaPond = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        Prompt.imprimir("Média ponderada: " + mediaPond);
    }
}
