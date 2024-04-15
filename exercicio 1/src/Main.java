public class Main {
    public static int somaAteN(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + somaAteN(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        int resultado = somaAteN(numero);
        System.out.println("A soma dos números inteiros de 1 até " + numero + " é: " + resultado);
    }
}
