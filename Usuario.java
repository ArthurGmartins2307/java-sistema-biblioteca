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