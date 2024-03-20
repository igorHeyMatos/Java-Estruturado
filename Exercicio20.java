public class Exercicio20 {
    public static void executar(){

        int tempo = Prompt.lerInteiro("Digite a quantidade de horas: ");
        double velocidade = Prompt.lerDecimal("Digite a velocidade média: ");
        int consumo = 12;
        double distancia = velocidade * tempo;

        double litro = distancia / consumo;

        Prompt.imprimir("Distancia percorrida: " + distancia);
        Prompt.imprimir("Litros gasto: " + litro);
    }
}
