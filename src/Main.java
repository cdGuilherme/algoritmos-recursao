// # Algoritmos de Recursão v0.3.0
//
// ## Algoritmos para implementar:
// - Soma dos elementos de um vetor
//
// ## Algoritmos já implementados:
// - Soma dos algarismos
// - Cálculo de potência
// - Conversão de decimal para binário

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
                // Usuário digita um número inteiro não negativo
                System.out.print("Digite um número inteiro não negativo: ");
                input = s.nextInt();

                // Loop caso o usuário digitar um número negativo
                while (input < 0) {
                    System.out.println("Não foi possível executar o algoritmo pois " + input + " é um número negativo!");
                    System.out.print("Digite um número inteiro não negativo: ");
                    input = s.nextInt();
                }

                // Execução do algoritmo
                int resultado = Algoritmos.SomaAlgarismos(input);
                System.out.println("A soma dos algarismos de " + input + " é: " + resultado);
            }


            // Cálculo de Potência
            case 2 -> {
                // Usuário digita uma base inteira não negativa
                System.out.print("Digite uma base inteira não negativa: ");
                input = s.nextInt();

                // Loop caso o usuário digitar uma base negativa
                while (input < 0) {
                    System.out.println(input + " é um número negativo!");
                    System.out.print("Digite uma base inteira não negativa: ");
                    input = s.nextInt();
                }

                int base = input;

                // Usuário digita uma base inteira não negativa
                System.out.print("Digite um expoente inteiro não negativo: ");
                input = s.nextInt();

                // Loop caso o usuário digitar um expoente negativo
                while (input < 0) {
                    System.out.println(input + " é um número negativo!");
                    System.out.print("Digite um expoente inteiro não negativo: ");
                    input = s.nextInt();
                }

                int exp = input;

                // Execução do algoritmo
                long resultado = Algoritmos.CalculoPotencia(base, exp);
                System.out.println("O resultado de " + base + "^" + exp + " é: " + resultado);
            }


            // Conversão de Decimal para Binário
            case 3 -> {
                // Usuário digita um número inteiro não negativo
                System.out.print("Digite um número inteiro não negativo: ");
                input = s.nextInt();

                // Loop caso o usuário digitar um número negativo
                while (input < 0) {
                    System.out.println("Não foi possível executar o algoritmo pois " + input + " é um número negativo!");
                    System.out.print("Digite um número inteiro não negativo: ");
                    input = s.nextInt();
                }

                // Execução do algoritmo
                String resultado = Algoritmos.DecimalParaBinario(input);
                System.out.println(input + " em binário é: " + resultado);
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