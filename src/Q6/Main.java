package Q6;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner intScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Livro myLivro = new Livro();

        System.out.println("Informe os dados do seu livro:");

        System.out.println("Título do livro:");
        String titulo = scanner.nextLine();
        myLivro.setarTitulo(titulo);

        System.out.println("Nome do autor:");
        String autorNome = scanner.nextLine();
        System.out.println("Nacionalidade do autor:");
        String autorNacionalidade = scanner.nextLine();
        myLivro.setarAutor(autorNome, autorNacionalidade);

        System.out.println("Número da página inicial do capítulo:");
        int paginaIni = intScanner.nextInt();
        System.out.println("Número da página final do capítulo:");
        int paginaFim = intScanner.nextInt();
        myLivro.setarCapitulo(paginaIni, paginaFim);

        System.out.println("Nome da editora:");
        String editoraNome = scanner.nextLine();
        System.out.println("Endereço da editora:");
        String editoraEndereco = scanner.nextLine();
        myLivro.setarEditora(editoraNome, editoraEndereco);

        System.out.println("Dados informados pelo usuário:");
        System.out.println("Título do livro: " + myLivro.getMyTitulo().getNome());
        Autor autor = myLivro.getMyAutor();
        System.out.println("Nome do autor: " + autor.getNome());
        System.out.println("Nacionalidade do autor: " + autor.getNacional());
        Capitulo capitulo = myLivro.getMyCapitulo();
        System.out.println("Número da página inicial do capítulo: " + capitulo.getPaginaIni());
        System.out.println("Número da página final do capítulo: " + capitulo.getPaginaFim());
        Editora editora = myLivro.getMyEditora();
        System.out.println("Nome da editora: " + editora.getNome());
        System.out.println("Endereço da editora: " + editora.getEndereco());
    }
}
