public class Exercicio13 {
    public static void executar(){
        double A = Prompt.lerDecimal("Digite um valor para A: ");
        double B = Prompt.lerDecimal("Digite um valor para B: ");
        String operador = Prompt.lerLinha("Digite o operador: ");
        double valorFinal;

        if(operador.equals("+")){
            valorFinal = A + B;
            Prompt.imprimir("Valor final: "+ valorFinal);
        } else if(operador.equals("-")){
            valorFinal = A - B;
            Prompt.imprimir("Valor final: "+ valorFinal);
        } else if(operador.equals("*")){
            valorFinal = A * B;
            Prompt.imprimir("Valor final: " + valorFinal);
        } else if(operador.equals("/")){
            if(A == 0 || B == 0){
                Prompt.imprimir("Valor inválido!");
            } else {
                valorFinal = A / B;
                Prompt.imprimir("Valor final: "+ valorFinal);
            }
        }
    }
}