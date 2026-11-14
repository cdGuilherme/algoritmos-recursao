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
}
