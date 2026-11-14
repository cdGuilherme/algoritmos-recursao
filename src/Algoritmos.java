public class Algoritmos {
    // Classe com funções implementando os algoritmos //
    // /////////////////////////////////////////////////


    // Soma dos Algarismos
    // Recebe um número inteiro não negativo e retorna a soma de seus algarismos
    public static int SomaAlgarismos(int num) {
        if (num == 0) return 0;                          // Caso base
        return num % 10 + SomaAlgarismos(num / 10); // Caso recursivo
        // num % 10 retorna o algarismo mais à direita do número. Ex: 1024 → 4
        // num / 10 remove o algarismo mais à direita do número. Ex: 1024 → 102
        // A soma não é realizada imediatamente. Apenas quando a execução chega
        // no caso-base e retorna as chamadas acumuladas na pilha de execução
    }


    // Cálculo de Potência
    // Recebe uma base inteira e um expoente inteiro não negativo, retornando o resultado da base elevada ao expoente
    public static long CalculoPotencia(int base, int exp) {
        if (exp == 0) return 1;                            // Caso base
        return base * CalculoPotencia(base, exp - 1); // Caso recursivo
        // O retorno do caso base é 1, pois ele é o elemento neutro da multiplicação
        // Um cálculo de potência é recursivo, pois você multiplica a mesma base n vezes (chamado expoente)
        // Por exemplo: 2^5 é o mesmo que 2*2*2*2*2
        // Cada chamada o expoente é reduzido para que o programa não
        // entre em um loop infinito e consiga alcançar o caso base
    }
}
