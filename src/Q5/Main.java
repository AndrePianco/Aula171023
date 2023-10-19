package Q5;
import java.util.Scanner;

public class Main {
    public static Scanner sc1 = new Scanner(System.in);
    public static Scanner sc2 = new Scanner(System.in);

    public static void main(String[] args) {
        Computador myComputador = new Computador();
        System.out.println("Informe os dados do seu computador:");
        System.out.println("Tamanho da sua placa mãe:");
        String tam = sc1.nextLine();
        System.out.println("Socket da sua placa mãe:");
        String soc = sc1.nextLine();
        myComputador.setarPlacamae(soc, tam);

        System.out.println("Tamanho do monitor:");
        int tamanhoMonitor = sc2.nextInt();
        System.out.println("Resolução do monitor:");
        String resolucaoMonitor = sc1.nextLine();
        myComputador.setarMonitor(tamanhoMonitor, resolucaoMonitor);

        System.out.println("Quantidade de memória:");
        int quantidadeMemoria = sc2.nextInt();
        System.out.println("Frequência da memória:");
        String frequenciaMemoria = sc1.nextLine();
        myComputador.setarMemoria(quantidadeMemoria, frequenciaMemoria);

        System.out.println("Número de teclas do teclado:");
        int numTeclasTeclado = sc2.nextInt();
        System.out.println("Tipo de teclado:");
        String tipoTeclado = sc1.nextLine();
        myComputador.setarTeclado(numTeclasTeclado, tipoTeclado);

        System.out.println("Dados informados pelo usuário:");
        System.out.println("Tamanho da placa mãe: " + myComputador.getMyPlaca().getTamanho());
        System.out.println("Socket da placa mãe: " + myComputador.getMyPlaca().getSocket());
        System.out.println("Tamanho do monitor: " + myComputador.getMyMonitor().getTamanho());
        System.out.println("Resolução do monitor: " + myComputador.getMyMonitor().getResolucao());
        System.out.println("Quantidade de memória: " + myComputador.getMyMemoria().getQuantidade());
        System.out.println("Frequência da memória: " + myComputador.getMyMemoria().getFrequencia());
        System.out.println("Número de teclas do teclado: " + myComputador.getMyTeclado().getNumTecla());
        System.out.println("Tipo de teclado: " + myComputador.getMyTeclado().getTipo());


    }
}
