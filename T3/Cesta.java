package pob_T3;

public class Cesta {
    Produto[] itens = new Produto[12];
    int contItens = 0;

    public void adicionarItem(Produto item){
        if(contItens < 12){
            itens[contItens] = item;
            contItens++;
        }
        else {
            System.out.println("A cesta está cheia!");
        }
    }

    public double calcularTotal(){
        double soma = 0;

        for(int i = 0; i < contItens; i++){
            soma += itens[i].getPreco() * itens[i].getQtde();
        }

        return soma;
    }

    public void listarCesta(){
        for(int i = 0; i < contItens; i++){
            System.out.println((i + 1) + " - " + itens[i].getNomeFruta() + " (" + itens[i].getQtde() +") " + " - R$" + itens[i].getPreco());
        }
        System.out.printf("Preço total da cesta - R$ %.1f \n\n",calcularTotal());
    }
}
