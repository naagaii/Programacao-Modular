import java.util.Scanner;

public class Menu {

    static int lerNumero(Scanner scanner) {
        int valor;
        System.out.print("Digite um numero positivo: ");
        valor = scanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1. Somar dois numeros ");
            System.out.println("2. O maior de dois numeros ");
            System.out.println("3. Somar N numeros ");
            System.out.println("4. Contador de pares de uma sequencia ");
            System.out.println("0. Sair ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    int numero1 = lerNumero(scanner);
                    int numero2 = lerNumero(scanner);

                    int soma = numero1 + numero2;
                    System.out.println("A soma dos numeros é: " + soma);
                    break;

                case 2:

                    int numero = lerNumero(scanner);
                    int numero0 = lerNumero(scanner);

                    if (numero > numero0) {
                        int maior = numero;
                        System.out.println(maior + " é maior. ");
                    } else {
                        int maior = numero0;
                        System.out.println(maior + " é maior. ");
                    }

                    break;

                case 3:

                    System.out.println("Quantos numeros deseja somar? ");
                    int quantidade = scanner.nextInt();
                    int somaTotal = 0;

                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite o numero " + (i + 1) + ": ");
                        int Numero = scanner.nextInt();
                        somaTotal += Numero;
                    }
                    System.out.println("A soma dos " + quantidade + " numeros é: " + somaTotal);
                    break;

                case 4:
                    System.out.println("Sera uma sequencia de quantos numeros? ");
                    int quant = scanner.nextInt();
                    int pares = 0;

                    for (int i = 0; i < quant; i++) {
                        System.out.print("Digite o numero " + (i + 1) + ": ");
                        int num = scanner.nextInt();
                        if (num % 2 == 0) {
                            pares++;
                        }
                    }

                    System.out.println("A quantidade de numeros pares na sequencia é : " + pares);
                    break;
            }

        } while (opcao != 0);
    }
}
