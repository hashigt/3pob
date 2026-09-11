import java.util.Scanner;

public class AdivNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos jogadores
        System.out.print("Jogador 1: ");
        String jogador1 = sc.nextLine();

        System.out.print("Jogador 2: ");
        String jogador2 = sc.nextLine();

        // Sorteio do número secreto (1 a 1000)
        int numeroSecreto = (int) (Math.random() * 1000) + 1;

        // Sorteio de quem começa (0 ou 1)
        int sorteio = (int) (Math.random() * 2);

        String jogadorAtual;
        String outroJogador;

        if (sorteio == 0) {
            jogadorAtual = jogador1;
            outroJogador = jogador2;
        } else {
            jogadorAtual = jogador2;
            outroJogador = jogador1;
        }

        System.out.println("Jogador sorteado para comecar: " + jogadorAtual);

        int palpite;
        boolean acertou = false;

        // Loop do jogo
        while (!acertou) {
            System.out.print("Palpite " + jogadorAtual + ": ");
            palpite = sc.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Computador: " + jogadorAtual + " ganhou!");
                acertou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("Computador: numero eh maior");
            } else {
                System.out.println("Computador: numero eh menor");
            }

            // Troca de jogador (se não acertou)
            if (!acertou) {
                String temp = jogadorAtual;
                jogadorAtual = outroJogador;
                outroJogador = temp;
            }
        }

        sc.close();
    }
}
