public class Main {

    public static int calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número não pode ser negativo.");
        }
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}
