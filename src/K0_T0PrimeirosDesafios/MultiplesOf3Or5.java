package K0_T0PrimeirosDesafios;

public class MultiplesOf3Or5 {
    public static void main(String[] args) {
        int valor = 1000;
        long resultado = 0;

        for (int i = 0; i < valor; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                resultado += i;
            }
        }
        System.out.println(resultado);
    }
}
