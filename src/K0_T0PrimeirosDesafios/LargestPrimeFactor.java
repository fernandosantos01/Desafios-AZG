package K0_T0PrimeirosDesafios;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long numero = 600851475143L;
        for (long i = 2; i * i <= numero; i++) {

            while (numero % i == 0) {
                numero = numero / i;
            }
        }
        System.out.println("O maior fator primo é: " + numero);
    }
}
