import java.util.Scanner;

public class Retangulo {
    static Scanner teclado = new Scanner(System.in);

    static int lerNumero() {
        int valor;
        System.out.print("Digite um numero positivo: ");
        valor = teclado.nextInt();
        return valor;
    }

    static String linhaCheia(int tamanho) {
        String linha = "";
        for (int i = 0; i < tamanho; i++) {
            linha += 'X';
        }
        return linha;
    }

    static String linhaVazia(int tamanho) {
        String linha = "X";
        for (int i = 1; i < tamanho - 1; i++) {
            linha += ' ';
        }
        linha += 'X';
        return linha;
    }

    public static void main(String[] args) {
        int altura = lerNumero();
        int largura = lerNumero();

        System.out.println(linhaCheia(largura));

        for (int i = 0; i < altura - 2; i++) {
            System.out.println(linhaVazia(largura));
        }

        System.out.println(linhaCheia(largura));
    }
}
