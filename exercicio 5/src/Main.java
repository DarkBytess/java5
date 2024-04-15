public class Main {

    public static int buscaBinariaRecursiva(int[] array, int elemento, int inicio, int fim) {
        if (fim >= inicio) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == elemento)
                return meio;

            if (array[meio] > elemento)
                return buscaBinariaRecursiva(array, elemento, inicio, meio - 1);

            return buscaBinariaRecursiva(array, elemento, meio + 1, fim);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        int elementoBuscado = 10;
        int resultado = buscaBinariaRecursiva(array, elementoBuscado, 0, array.length - 1);

        if (resultado == -1)
            System.out.println("Elemento não encontrado");
        else
            System.out.println("Elemento encontrado na posição: " + resultado);
    }
}
