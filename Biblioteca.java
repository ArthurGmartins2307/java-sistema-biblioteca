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
            System.out.println("--------------------");
            livros[i].mostrarLivro();
        }
    }
    public void listarUsuarios(){
        for(int i = 0; i < quantidadeUsuarios; i++){
            System.out.println("--------------------");
            usuarios[i].mostrarUsuario();
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