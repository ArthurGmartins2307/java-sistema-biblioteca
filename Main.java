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

class Livro{
    String titulo;
    String autor;
    boolean emprestado;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        emprestado = false;
    }

    public void emprestar(){
        emprestado = true;
    }
    public void devolver(){
        emprestado = false;
    }
    public void mostrarLivro(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        if (!emprestado) {
            System.out.println("Estado: Disponível para alugar!");
        }else{
            System.out.println("Estado: Indisponível para alugar.");
        }
    }
}

class Usuario{
    String nome;
    String cpf;


    public Usuario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void mostrarUsuario(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}

class Biblioteca{
    Livro[] livros;
    Usuario[] usuarios;
    int quantidadeLivros;
    int quantidadeUsuarios;

    public Biblioteca(int maxLivros, int maxUsuarios){
        this.livros = new Livro[maxLivros];
        this.usuarios = new Usuario[maxUsuarios];
    }
    
    public void cadastrarLivro(Livro novoLivro){
        livros[quantidadeLivros] = novoLivro;
        quantidadeLivros++; 
    }
    public void cadastrarUsuario(Usuario novoUsuario){
        usuarios[quantidadeUsuarios] = novoUsuario;
        quantidadeUsuarios++;
    }

    public void listarLivros(){
        for(int i = 0; i < quantidadeLivros; i++){
            livros[i].mostrarLivro();
            System.out.println("---------------");
        }
    }
    public void listarUsuarios(){
        for(int i = 0; i < quantidadeUsuarios; i++){
            usuarios[i].mostrarUsuario();
            System.out.println("---------------");
        }
    }

    public void emprestarLivro(int l, int u){
        System.out.println("Livro: " + livros[l].titulo + " emprestado para: " + usuarios[u].nome);
        livros[l].emprestar();;
    }
    public void devolverLivro(int l){
        livros[l].emprestado = false;
    }
}

