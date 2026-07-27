// Sistema de biblioteca
public class Main {
    public static void main(String[] args) {
        System.out.println();
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
        if (emprestado = true) {
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
        for(int i = 0; i < livros.length; i++){
            livros[i] = novoLivro;
            quantidadeLivros++;
        }
    }
    public void cadastrarUsuario(Usuario novoUsuario){
        for(int i = 0; i < usuarios.length; i++){
            usuarios[i] = novoUsuario;
            quantidadeUsuarios++;
        }
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
}

