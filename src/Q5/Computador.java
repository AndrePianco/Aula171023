package Q5;

public class Computador {
    private Teclado myTeclado = new Teclado();
    private Monitor myMonitor = new Monitor();
    private Memoria myMemoria = new Memoria();
    private PlacaMae myPlaca = new PlacaMae();

    public Computador() {

    }

    public Teclado getMyTeclado() {
        return myTeclado;
    }

    public Monitor getMyMonitor() {
        return myMonitor;
    }

    public Memoria getMyMemoria() {
        return myMemoria;
    }

    public PlacaMae getMyPlaca() {
        return myPlaca;
    }

    public void setarMemoria(int quant, String freq) {
        myMemoria.setQuantidade(quant);
        myMemoria.setFrequencia(freq);
    }

    public void setarMonitor(int tamanho, String resolucao) {
        myMonitor.setTamanho(tamanho);
        myMonitor.setResolucao(resolucao);
    }

    public void setarPlacamae(String socket, String tamanho) {
        myPlaca.setSocket(socket);
        myPlaca.setTamanho(tamanho);
    }

    public void setarTeclado(int numTecla, String tipo){
        myTeclado.setNumTecla(numTecla);
        myTeclado.setTipo(tipo);
    }
}

