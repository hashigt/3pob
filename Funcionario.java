public class Funcionario {
    private String nome;
    private int matricula;
    private double salario;

    public Funcionario(String nome, int matricula, double salario){
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void setNome(String name){
        this.nome = name;
    }

    public String getNome(){
        return nome;
    }

    public void setMat(int mat){
        this.matricula = mat;
    }

    public int getMat(){
        return matricula;
    }

    public void setSal(double sal){
        this.salario = sal;
    }

    public double getSal(){
        return salario;
    }

    public double calcularInss(){
        if(salario <= 720.0){
            return (salario * 0.0765) + salario;
        }
        else if(salario <=1200.0){
            return (salario * 0.09) + salario;
        }
        else if (salario <= 2400.0) {
            return (salario * 0.11) + salario;
        }
        return 0;
    }
}
