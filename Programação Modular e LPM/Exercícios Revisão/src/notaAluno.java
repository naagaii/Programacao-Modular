import java.util.Scanner;

public class notaAluno {
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
            soma = vetor[i];
        }
        return (soma / vetor.length);
    }

    public static void main(String[] args) throws Exception {
        teclado = new Scanner(System.in);
        double[] exercicios = new double[4];
        double[] provas = new double[2];
        double notaTrabalho, mediaExercicios, mediaProvas, notaFinal;
        double pesoExercicios = 0.2;
        double pesoProvas = 0.6;

        System.out.println("Notas dos exercicios: ");
        lerNotas(exercicios);
        System.out.println("Notas das provas: ");
        lerNotas(provas);
        notaTrabalho = lerNumero("Digite a nota de trabalho:");
        mediaExercicios = calcularMedia(exercicios) * pesoExercicios;
        mediaProvas = calcularMedia(provas) * pesoProvas;
        notaFinal = mediaExercicios + mediaProvas + notaTrabalho;
        System.out.printf("Nota final: %.2f ", notaFinal);
        teclado.close();    

    }
}
