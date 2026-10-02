class Cavalo {
    private String nome;
    private String avatar;
    private double distancia;

    // Construtor
    public Cavalo(String nome) {
        this.nome = nome;
        this.distancia = 0;

        if (nome.equals("branquinho")) {
            avatar = "B>";
        } else if (nome.equals("malhadinho")) {
            avatar = "M>";
        } else if (nome.equals("pretinho")) {
            avatar = "P>";
        } else {
            System.out.println("Nome inválido!");
        }
    }

    // Correr
    public double correr() {
        distancia = distancia + Math.random();
        mostrar();
        return distancia;
    }

    // Mostrar (privado)
    private void mostrar() {
        String espacos = "";
        for (int i = 0; i < (int) distancia; i++) {
            espacos = espacos + " ";
        }
        System.out.println(nome.toUpperCase() + ": " + espacos + avatar);
    }

    public String getNome() {
        return nome;
    }
}

public class CavalinhoDoBozo {
    public static void main(String[] args) throws InterruptedException {
        Cavalo branquinho = new Cavalo("branquinho");
        Cavalo malhadinho = new Cavalo("malhadinho");
        Cavalo pretinho = new Cavalo("pretinho");

        double b = 0, m = 0, p = 0;

        while (b < 60 && m < 60 && p < 60) {
            for (int i = 0; i < 25; i++) {
                System.out.println();
            }

            b = branquinho.correr();
            m = malhadinho.correr();
            p = pretinho.correr();

            Thread.sleep(100); // espera 300 milissegundos
        }

        if (b >= m && b >= p) {
            System.out.println("Campeão: " + branquinho.getNome());
        } else if (m >= p) {
            System.out.println("Campeão: " + malhadinho.getNome());
        } else {
            System.out.println("Campeão: " + pretinho.getNome());
        }
    }
}