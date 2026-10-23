package pob_T3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        Cesta minhaCesta = new Cesta();

        int resp = 1;

        while (resp >= 1 && resp <=3){
            System.out.println("1 - Adicionar\n2 - Mostrar\n3 - Limpar\n4 - Sair");
            resp = get.nextInt();

            if (resp == 1){
                System.out.println("1 - Banana\n2 - Limão\n3 - Mamão\n4 - Maça\n5 - Morango\n6 - Pera\n7 - Uva\n");

                System.out.println("Qual fruta quer?");
                int frut = get.nextInt();
                if(frut > 7 || frut < 1){
                    System.out.println("Erro! Número não dispónivel");
                    return;
                }

                System.out.println("Quantidade?");
                int quant = get.nextInt();

                if(frut == 1){
                    Produto p = new Banana();
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                }
                else if (frut == 2) {
                    Produto p = new Limao();
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                }
                else if (frut == 3) {
                    Produto p = new Mamao();
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                }
                else if (frut == 4) {
                    Produto p = new Maca();
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                }
                else if (frut == 5) {
                    Produto p = new Morango();
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                }
                else if (frut == 6) {
                    Produto p = new Pera();
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                }
                else if (frut == 7) {
                    Produto p = new Uva();
                    p.setQtde(quant);
                    minhaCesta.adicionarItem(p);
                }
            }
            else if (resp == 2) {
                minhaCesta.listarCesta();
            }
            else if (resp == 3) {
                minhaCesta.contItens = 0;
            }

        }
        System.out.println("Encerrando...");
        get.close();
    }
}
