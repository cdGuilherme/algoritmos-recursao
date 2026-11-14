// # Algoritmos de Recursão v0.1.0
//
// ## Algoritmos para implementar:
// - Cálculo de potência
// - Conversão de decimal para binário
// - Soma dos elementos de um vetor
//
// ## Algoritmos já implementados:
// - Soma dos algarismos

import java.util.Scanner;

void main() {
    Utils.LimparConsole();
    Scanner s = new Scanner(System.in);

    int opcao;
    int input;

    // Loop principal de execução no terminal
    do {
        System.out.println("<< Algoritmos de Recursão >>");
        System.out.println("1 - Soma dos Algarismos");
        System.out.println("2 - Cálculo de Potência");
        System.out.println("3 - Conversão de Decimal para Binário");
        System.out.println("4 - Soma dos Elementos de um Vetor");
        System.out.println("0 - Sair");

        System.out.print("Selecione uma opção: ");
        opcao = s.nextInt();
        System.out.println();

        // Usuário seleciona uma opção
        switch (opcao) {
            // Soma dos Algarismos
            case 1 -> {
                System.out.print("Digite um número inteiro não negativo: ");
                input = s.nextInt();
                while (input < 0) {
                    System.out.println("Não foi possível executar o algoritmo pois " + input + " é um número negativo!");
                    System.out.print("Digite um número inteiro não negativo: ");
                    input = s.nextInt();
                }
                int resultado = Algoritmos.SomaAlgarismos(input);
                System.out.println("A soma é: " + resultado);
            }


            // Cálculo de Potência
            case 2 -> {
            }


            // Conversão de Decimal para Binário
            case 3 -> {
            }


            // Soma dos Elementos de um Vetor
            case 4 -> {
            }


            // Sair
            case 0 -> {
            }


            // Opção inválida
            default -> {
                System.out.println("\nOpção inválida!");
                Utils.EsperarEnter();
            }
        }
        System.out.println();
    } while (opcao != 0);
}