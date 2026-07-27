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