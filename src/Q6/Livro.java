package Q6;

public class Livro {
    private Titulo myTitulo = new Titulo();
    private Autor myAutor = new Autor();
    private Capitulo myCapitulo = new Capitulo();
    private Editora myEditora = new Editora();

    public Livro(){

    }

    public Titulo getMyTitulo() {
        return myTitulo;
    }

    public Autor getMyAutor() {
        return myAutor;
    }

    public Capitulo getMyCapitulo() {
        return myCapitulo;
    }

    public Editora getMyEditora() {
        return myEditora;
    }

    public void setarTitulo(String nome){
        myTitulo.setNome(nome);
    }

    public void setarAutor(String nome, String nacao){
        myAutor.setNome(nome);
        myAutor.setNacional(nacao);
    }

    public void setarCapitulo(int pagI, int pagF){
        myCapitulo.setPaginaIni(pagI);
        myCapitulo.setPaginaFim(pagF);
    }

    public void setarEditora(String nome, String endereco){
        myEditora.setNome(nome);
        myEditora.setEndereco(endereco);
    }

}