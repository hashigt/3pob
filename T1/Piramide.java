import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=0; //atribui num de linhas como 0 para permitir entrada no loop
        
        //Pergunta ao usuário o número de linhas
        while (n < 1 || n > 9){
            System.out.print("Digite o número de linhas (1 a 9): ");
            n = sc.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }

        // Pirâmide
        for (int i = 1; i <= n; i++) {

            // Imprime os espaços onde não haverão numeros impressos
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Imprime números crescente até a metade da coluna
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Imprime números decrescentes após a metade da coluna
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }
}
