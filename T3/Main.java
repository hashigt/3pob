package pob_T3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        Cesta minhaCesta = new Cesta();

        int resp = 0;

        while (resp != 4){
            System.out.println("1 - Adicionar\n2 - Mostrar\n3 - Limpar\n4 - Sair");
            System.out.print("Escolha uma opção: ");
            resp = get.nextInt();

            if (resp == 1){
                System.out.println("\n1 - Banana\n2 - Limão\n3 - Mamão\n4 - Maça\n5 - Morango\n6 - Pera\n7 - Uva");
                System.out.print("Qual fruta quer? ");
                int frut = get.nextInt();

                System.out.print("Quantidade? ");
                int quant = get.nextInt();

                Produto p = null;

                if(frut == 1) p = new Banana();
                else if (frut == 2) p = new Limao();
                else if (frut == 3) p = new Mamao();
                else if (frut == 4) p = new Maca();
                else if (frut == 5) p = new Morango();
                else if (frut == 6) p = new Pera();
                else if (frut == 7) p = new Uva();

                if (p != null) {
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                    System.out.println("Produto adicionado com sucesso!\n");
                } else {
                    System.out.println("Opção de fruta inválida!\n");
                }
            }
            else if (resp == 2) {
                System.out.println("\n--- CONTEÚDO DA CESTA ---");
                minhaCesta.listarCesta();
            }
            else if (resp == 3) {
                minhaCesta.limparCesta();
            }
        }
        get.close(); 
    }
}
