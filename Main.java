// Sistema de biblioteca
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10,5);
        Livro livro1 = new Livro("Clean Code", "Robert C. Martin");
        biblioteca.cadastrarLivro(livro1);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien ");
        biblioteca.cadastrarLivro(livro2);
        Livro livro3 = new Livro("Java: Como Programar", "Paul Deitel e Harvey Deitel");
        biblioteca.cadastrarLivro(livro3);
        Livro livro4 = new Livro("1984", "George Orwell");
        biblioteca.cadastrarLivro(livro4);
        Livro livro5 = new Livro("Dom Casmurro", "Machado de Assis.");
        biblioteca.cadastrarLivro(livro5);
        Usuario user1 = new Usuario("Arthur", "123456789010");
        biblioteca.cadastrarUsuario(user1);
        Usuario user2 = new Usuario("Ana", "123876549010");
        biblioteca.cadastrarUsuario(user2);
        Usuario user3 = new Usuario("João", "323456789030");
        biblioteca.cadastrarUsuario(user3);

        biblioteca.listarLivros();
        biblioteca.listarUsuarios();
        biblioteca.emprestarLivro(0, 1);
        biblioteca.emprestarLivro(3, 0);
        biblioteca.listarLivros();
        biblioteca.devolverLivro(3);
        biblioteca.listarLivros();
    }
}