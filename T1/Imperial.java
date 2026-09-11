import java.util.Scanner;

public class Imperial {
    public static void main(String[] args){
        // Cria o scanner para conseguir pegar o valor do terminal
        Scanner getNum = new Scanner(System.in); 

        System.out.println("Digite um número em centimetros: ");
        double numCent = getNum.nextDouble();

        // chamando as funções de conversão
        double polegada = centPole(numCent);
        double pes = polePe(polegada);
        double jardas = pesJar(pes);
        double milhas = jarMilh(jardas);

        // mostrando os resultados
        System.out.printf("\nTabela de Conversão: %.2fcm\n",numCent); 
        System.out.println("-----------------------------"); 
        System.out.printf("=> %.2f polegadas             \n", polegada); 
        System.out.printf("=> %.2f pés                   \n", pes); 
        System.out.printf("=> %.4f jardas                \n", jardas, pes);
        System.out.printf("=> %.6f milhas                ", milhas);

        getNum.close();
    }

    public static double centPole(double cent){
        //(cent*10) converte de cm para mm, possibilitando os demais cálculos
        return (cent * 10) / 25.3995; 
    }

    public static double  polePe(double pole){
        return pole/ 12;
    }

    public static double  pesJar(double pes){
        return pes / 3;
    }

    public static double  jarMilh(double jar){
        return jar / 1760;
    }

}
