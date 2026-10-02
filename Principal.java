import java.util.Scanner;

class Veiculo {
    private int capacidade;
    private int assentosVendidos;
    private String origem;
    private String destino;

    // Construtor 
    public Veiculo(int capacidade, String origem, String destino) {
        this.capacidade = capacidade;
        this.origem = origem;
        this.destino = destino;
        this.assentosVendidos = 0; // Sempre inicia vazio
    }

    // Método para comprar passagem
    public boolean comprar() {
        if (assentosVendidos < capacidade) {
            assentosVendidos++;
            return true;
        }
        return false;
    }

    public int getNumAssentosDisponiveis() {
        return capacidade - assentosVendidos;
    }

    public int getNumAssentos() {
        return capacidade;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}

public class Principal {
    
    // Método auxiliar para simular as vendas iniciais e atingir a ocupação da lista
    private static void preencherAssentos(Veiculo v, int qtdVendidos) {
        for (int i = 0; i < qtdVendidos; i++) {
            v.comprar();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] frota = new Veiculo[12];
        
        // Inicializando os veículos e preenchendo os assentos ocupados
        // A lógica é: (Capacidade Total) - (Assentos Disponíveis da lista) = (Assentos a vender)
        
        frota[0] = new Veiculo(20, "RJ", "SP");
        preencherAssentos(frota[0], 15); // 5 disponíveis de 20

        frota[1] = new Veiculo(15, "MG", "RS");
        preencherAssentos(frota[1], 5);  // 10 disponíveis de 15

        frota[2] = new Veiculo(21, "MS", "RO");
        preencherAssentos(frota[2], 18); // 3 disponíveis de 21

        frota[3] = new Veiculo(10, "BA", "SE");
        preencherAssentos(frota[3], 4);  // 6 disponíveis de 10

        frota[4] = new Veiculo(20, "SC", "RJ");
        preencherAssentos(frota[4], 19); // 1 disponíveis de 20

        frota[5] = new Veiculo(60, "AM", "AC");
        preencherAssentos(frota[5], 60); // 0 disponíveis de 60

        frota[6] = new Veiculo(20, "AL", "CE");
        preencherAssentos(frota[6], 0);  // 20 disponíveis de 20

        frota[7] = new Veiculo(35, "PR", "SC"); // Ônibus 08 (inserido para completar 12)
        preencherAssentos(frota[7], 10); // 25 disponíveis de 35

        frota[8] = new Veiculo(45, "RR", "GO");
        preencherAssentos(frota[8], 31); // 14 disponíveis de 45

        frota[9] = new Veiculo(30, "RN", "PE");
        preencherAssentos(frota[9], 29); // 1 disponíveis de 30

        frota[10] = new Veiculo(40, "SP", "BA");
        preencherAssentos(frota[10], 10); // 30 disponíveis de 40

        frota[11] = new Veiculo(10, "SC", "ES");
        preencherAssentos(frota[11], 10); // 0 disponíveis de 10

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- Lista de Ocupação da Viação Tartaruga ---");
            
            for (int i = 0; i < frota.length; i++) {
                Veiculo v = frota[i];
                System.out.printf("%02d: %s-%s (%d assentos disponíveis de %d)\n", 
                                 (i + 1), v.getOrigem(), v.getDestino(), 
                                 v.getNumAssentosDisponiveis(), v.getNumAssentos());
            }

            System.out.print("\nDigite o número do ônibus para comprar (1 a 12) ou 0 para sair: ");
            opcao = scanner.nextInt();

            if (opcao > 0 && opcao <= 12) {
                boolean sucesso = frota[opcao - 1].comprar();
                
                if (sucesso) {
                    System.out.println("Passagem comprada com sucesso para o ônibus " + opcao + "!");
                } else {
                    System.out.println("Desculpe, não há mais assentos disponíveis neste ônibus.");
                }
            } else if (opcao != 0) {
                System.out.println("Número de ônibus inválido! Digite um valor entre 1 e 12.");
            }
        }
        
        System.out.println("Programa finalizado. Volte sempre!");
        scanner.close();
    }
}