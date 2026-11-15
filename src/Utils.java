import java.util.Scanner;

public class Utils {
    // Funções úteis para a execução do programa //
    // ////////////////////////////////////////////


    // Limpa o console caso suportado pelo terminal
    public static void LimparConsole() {
        try {
            String sistema = System.getProperty("os.name").toLowerCase();

            if (sistema.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Não faz nada caso não seja possível limpar o console.
        }
    }


    // Pausa o programa até o usuário apertar <ENTER>
    public static void EsperarEnter() {
        Scanner s = new Scanner(System.in);
        System.out.print("Pressione <ENTER> para continuar...");
        s.nextLine();
    }


    // Testando os algoritmos //
    // /////////////////////////


    // Validar Soma dos Algarismos
    public static int ValidarSomaAlgarismos(int num, int resultado) {
        int retorno = Algoritmos.SomaAlgarismos(num);
        System.out.println("Entrada: " + num + "; Resultado esperado: " + resultado + "; Retorno: " + retorno);
        if (retorno == resultado) return 1;
        return 0;
    }


    // Validar Cálculo de Potência
    public static int ValidarCalculoPotencia(int base, int exp, int resultado) {
        long retorno = Algoritmos.CalculoPotencia(base, exp);
        System.out.println("Entrada: base " + base + ", expoente " + exp + "; Resultado esperado: " + resultado + "; Retorno: " + retorno);
        if (retorno == resultado) return 1;
        return 0;
    }


    // Validar Conversão de Decimal para Binário
    public static int ValidarDecimalParaBinario(int num, String resultado) {
        String retorno = Algoritmos.DecimalParaBinario(num);
        System.out.println("Entrada: " + num + "; Resultado esperado: " + resultado + "; Retorno: " + retorno);
        if (retorno.equals(resultado)) return 1;
        return 0;
    }


    // Validar Soma dos Elementos de um Vetor
    public static int ValidarSomaElementosVetor(Lista lista, int resultado) {
        No elemento = lista.primeiro;
        int retorno = Algoritmos.SomaElementosVetor(elemento);
        System.out.println("Entrada: " + lista.visualizarLista() + "; Resultado esperado: " + resultado + "; Retorno: " + retorno);
        if (retorno == resultado) return 1;
        return 0;
    }
}
