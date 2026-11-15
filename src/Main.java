// # Algoritmos de Recursão v1.0.1

import java.util.Scanner;

void main() {
    Scanner s = new Scanner(System.in);

    int opcao;

    // Loop principal de execução no terminal
    do {
        Utils.LimparConsole();
        System.out.println("<< Algoritmos de Recursão >>");
        System.out.println("1 - Soma dos Algarismos");
        System.out.println("2 - Cálculo de Potência");
        System.out.println("3 - Conversão de Decimal para Binário");
        System.out.println("4 - Soma dos Elementos de um Vetor");
        System.out.println("5 - Testar os Algoritmos");
        System.out.println("0 - Sair");

        try {
            // Usuário seleciona uma das opções fornecidas
            System.out.print("Selecione uma opção: ");
            opcao = s.nextInt();
        } catch (InputMismatchException e) {
            // Usuário digita outra coisa sem ser um número inteiro
            opcao = -1;
            s.nextLine();
        }

        System.out.println();

        // Usuário seleciona uma opção
        switch (opcao) {
            // Soma dos Algarismos
            case 1 -> {
                // Usuário digita um número inteiro não negativo
                System.out.print("Digite um número inteiro não negativo: ");
                int input = s.nextInt();

                // Loop caso o usuário digitar um número negativo
                while (input < 0) {
                    System.out.println("Não foi possível executar o algoritmo pois " + input + " é um número negativo!");
                    System.out.print("Digite um número inteiro não negativo: ");
                    input = s.nextInt();
                }

                // Execução do algoritmo
                int resultado = Algoritmos.SomaAlgarismos(input);
                System.out.println("A soma dos algarismos de " + input + " é: " + resultado);
                Utils.EsperarEnter();
            }


            // Cálculo de Potência
            case 2 -> {
                // Usuário digita uma base inteira não negativa
                System.out.print("Digite uma base inteira não negativa: ");
                int input = s.nextInt();

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
                Utils.EsperarEnter();
            }


            // Conversão de Decimal para Binário
            case 3 -> {
                // Usuário digita um número inteiro não negativo
                System.out.print("Digite um número inteiro não negativo: ");
                int input = s.nextInt();

                // Loop caso o usuário digitar um número negativo
                while (input < 0) {
                    System.out.println("Não foi possível executar o algoritmo pois " + input + " é um número negativo!");
                    System.out.print("Digite um número inteiro não negativo: ");
                    input = s.nextInt();
                }

                // Execução do algoritmo
                String resultado = Algoritmos.DecimalParaBinario(input);
                System.out.println(input + " em binário é: " + resultado);
                Utils.EsperarEnter();
            }


            // Soma dos Elementos de um Vetor
            case 4 -> {
                // Criando o vetor que será utilizado para a soma
                Lista l = new Lista();
                System.out.println("Vamos criar um vetor de números inteiros para executar esse algoritmo");
                System.out.println("Pressione <ENTER> para parar de adicionar elementos e somar o vetor");

                // Usuário informa o primeiro elemento do vetor
                int i = 1;
                System.out.print("Digite o " + i + "º número: ");
                s.nextLine();

                // Usuário informa os demais elementos a serem adicionados no vetor em um loop while. O try vai tentar
                // converter esse input do tipo string para um número inteiro, e se for possível ele adiciona este
                // elemento para o vetor, se não for possível ocorre uma exceção "NumberFormatException" que o catch irá
                // utilizar para sair do loop
                while (s.hasNextLine()) {
                    String input = s.nextLine();

                    try {
                        int num = Integer.parseInt(input);
                        l.add(num);
                        i++;
                        System.out.print("Digite o " + i + "º número: ");
                    } catch (NumberFormatException e) {
                        break;
                    }
                }

                // Execução do algoritmo
                No elemento = l.primeiro;
                int resultado = Algoritmos.SomaElementosVetor(elemento);
                System.out.println("A soma dos números do vetor é: " + resultado);
                Utils.EsperarEnter();
            }


            // Testar os Algoritmos
            case 5 -> {
                int testesValidos = 0;
                int totalTestes = 12;

                // Soma dos Algarismos
                System.out.println("Testando o algoritmo de soma dos algarismos: ");
                testesValidos += Utils.ValidarSomaAlgarismos(1234, 10);
                testesValidos += Utils.ValidarSomaAlgarismos(507, 12);
                testesValidos += Utils.ValidarSomaAlgarismos(0, 0);

                // Cálculo de Potência
                System.out.println("\nTestando o algoritmo de cálculo de potência: ");
                testesValidos += Utils.ValidarCalculoPotencia(2, 5, 32);
                testesValidos += Utils.ValidarCalculoPotencia(3, 3, 27);
                testesValidos += Utils.ValidarCalculoPotencia(7, 0, 1);

                // Conversão de Decimal para Binário
                System.out.println("\nTestando o algoritmo de conversão de decimal para binário: ");
                testesValidos += Utils.ValidarDecimalParaBinario(10, "1010");
                testesValidos += Utils.ValidarDecimalParaBinario(13, "1101");
                testesValidos += Utils.ValidarDecimalParaBinario(0, "0");

                // Soma dos Elementos de um Vetor
                System.out.println("\nTestando o algoritmo de soma dos elementos de um vetor: ");
                // @formatter:off
                Lista l = new Lista(); l.add(2); l.add(4); l.add(6); l.add(8);
                testesValidos += Utils.ValidarSomaElementosVetor(l, 20);
                l = new Lista(); l.add(5); l.add(-2); l.add(3);
                testesValidos += Utils.ValidarSomaElementosVetor(l, 6);
                l = new Lista();
                testesValidos += Utils.ValidarSomaElementosVetor(l, 0);
                // @formatter:on

                // Resultados
                System.out.println();
                System.out.println("Resultado: " + testesValidos + " de " + totalTestes + " testes passaram");
                Utils.EsperarEnter();
            }


            // Sair
            case 0 -> {
            }


            // Opção inválida
            default -> {
                System.out.println("Opção inválida!");
                Utils.EsperarEnter();
            }
        }
        System.out.println();
    } while (opcao != 0);
}