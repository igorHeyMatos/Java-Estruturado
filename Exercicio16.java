public class Exercicio16 {
    public static void executar() {
        double[] notas = new double[3];
        double soma = 0;

        for (int i = 0; i < 3; i++) {
            notas[i] = Prompt.lerDecimal("Digite a nota " + (i + 1) + ":");
            soma = soma + notas[i];
        }

        double media = soma / 3;

        Prompt.imprimir("Média: "+ media);
    }
}
