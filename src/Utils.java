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
}
