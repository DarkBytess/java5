public class Main {
    public static boolean verificarPalindromo(String texto) {
        String textoFormatado = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int inicio = 0;
        int fim = textoFormatado.length() - 1;

        while (inicio < fim) {
            if (textoFormatado.charAt(inicio) != textoFormatado.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    public static void main(String[] args) {
        String texto = "A base do teto desaba";
        if (verificarPalindromo(texto)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
