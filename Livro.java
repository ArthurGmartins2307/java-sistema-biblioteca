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