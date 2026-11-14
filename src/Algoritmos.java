public class Algoritmos {
    // Classe com funções implementando os algoritmos //
    // /////////////////////////////////////////////////


    // ## Soma dos Algarismos
    // - Recebe um número inteiro não negativo e retorna a soma de seus algarismos
    // - Restrição: utilize operações aritméticas para separar os algarismos, sem converter o número em texto.
    public static int SomaAlgarismos(int num) {
        if (num == 0) return 0;                          // Caso base
        return num % 10 + SomaAlgarismos(num / 10); // Caso recursivo
        // num % 10 retorna o algarismo mais à direita do número. Ex: 1024 → 4
        // num / 10 remove o algarismo mais à direita do número. Ex: 1024 → 102
        // A soma não é realizada imediatamente. Apenas quando a execução chega
        // no caso-base e retorna as chamadas acumuladas na pilha de execução
    }


    // ## Cálculo de Potência
    // - Recebe uma base inteira e um expoente inteiro não negativo, retornando o resultado da base elevada ao expoente
    // - Requisitos: não utilize Math.pow. Para este algoritmo, considere que qualquer base elevada a zero retorna 1.
    // Utilize valores de teste cujo resultado caiba no tipo numérico escolhido.
    public static long CalculoPotencia(int base, int exp) {
        if (exp == 0) return 1;                            // Caso base
        return base * CalculoPotencia(base, exp - 1); // Caso recursivo
        // O retorno do caso base é 1, pois ele é o elemento neutro da multiplicação
        // Um cálculo de potência é recursivo, pois você multiplica a mesma base n vezes (chamado expoente)
        // Por exemplo: 2^5 é o mesmo que 2*2*2*2*2
        // Cada chamada o expoente é reduzido para que o programa não
        // entre em um loop infinito e consiga alcançar o caso base
    }


    // ## Conversão de Decimal para Binário
    // - Recebe um número inteiro não negativo em decimal e retorna uma string contendo sua representação em binário
    // - Requisitos: o resultado não deve apresentar zeros à esquerda, exceto na representação do próprio zero. Não
    // utilize Integer.toBinaryString ou conversões prontas equivalentes.
    public static String DecimalParaBinario(int num) {
        if (num <= 1) return String.valueOf(num);          // Caso base
        return DecimalParaBinario(num / 2) + num % 2; // Caso recursivo
        // num / 2 retorna o número dividido por 2 e arredonda para baixo
        // num % 2 retorna o resto da divisão do número por 2 (Ex: número impar == 1; número par == 0)
        // String.valueOf(num) retorna a representação em string de um número inteiro
        // Para converter um número decimal em binário em uma função recursiva precisamos dividir o número por 2 até que
        // ele seja menor ou igual à 1. Assim que ele chegar nessa condição do caso base, iremos concatenar os restos
        // das divisões e retornar o resultado. Os números 0 e 1 já possuem uma representação binária de um único
        // algarismo, então não é necessário passar pelo caso recursivo, apenas retornamos o valor em string
    }
}
