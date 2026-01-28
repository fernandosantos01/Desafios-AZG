package K0_T0PrimeirosDesafios;

public class Main {
    public static void main(String[] args) {
        int valorMaximo = 4000000;
        int valorAnterior = 1;
        int sequencia = 1;
        long resultadoSoma = 0;
        int aux;
        while (sequencia <= valorMaximo) {
            if (sequencia % 2 == 0) {
                resultadoSoma += sequencia;
            }
            aux = valorAnterior;
            valorAnterior = sequencia;
            sequencia = aux + sequencia;
        }
        System.out.printf("Resultado: %d\n", resultadoSoma);
    }
}