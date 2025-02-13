import java.util.Scanner;

public class App {
    /**
     * LER NOTAS DE EXERCICIOS
     * LER NOTAS DE PROVAS
     * LER NOTA DE TRABALHO
     * 
     * CALCULAR A NOTA PONDERADA DE EXERCICIOS
     * CALCULAR A NOTA PONDERADA DE PROVAS
     * CALCULAR A NOTA FINAL
     * 
     * MOSTRAR NOTA COM DOIS DECIMAIS
     */
    static Scanner teclado;

    static double lerNumero(String mensagem) {
        double valor;
        System.out.print("\t" + mensagem + ": ");
        valor = teclado.nextDouble();
        return valor;
    }

    static void lerNotas(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = lerNumero("Digite a nota: ");
        }
    }

    static double calcularMedia(double[] vetor) {
        double soma = 0d;
        for (int i = 0; i < vetor.length; i++) {
            soma = +vetor[i];
        }
        return (soma / vetor.length);
    }

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        double[] exercicios = new double[4];
        double[] provas = new double[2];
        double notaTrabalho, mediaExercicios, mediaProvas, notaFinal;

        lerNotas(exercicios);
        lerNotas(provas);
        notaTrabalho = lerNumero("Digite a nota de trabalho:");
        mediaExercicios = calcularMedia(exercicios);
        mediaProvas = calcularMedia(provas);
        notaFinal = mediaExercicios + mediaProvas + notaTrabalho;
        System.out.println("Nota final: " + notaFinal);
        teclado.close();

    }
}
