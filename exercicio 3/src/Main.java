public class Main {

    public static int calcularPotencia(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * calcularPotencia(x, y - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int expoente = 3;

        int resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }
}
