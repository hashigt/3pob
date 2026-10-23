package pob_T3;

public abstract class Produto {
    private int qtde;

    public abstract double getPreco();

    public void setQtde(int quant){
        this.qtde = quant;
    }

    public int getQtde(){
        return this.qtde;
    }

    public String getNomeFruta() {
        return  this.getClass().getSimpleName();
    }
}
