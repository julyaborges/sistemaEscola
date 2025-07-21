public class Pessoa {

    //Atributos
    private String nome;
    private String cpf;
    private int idade;
    private String email;
    private boolean usuarioAtivo;

    //Metodos Set e Get
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public boolean getUsuarioAtivo(){
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(boolean usuarioAtivo){
        this.usuarioAtivo = usuarioAtivo;
    }

    //Metodo exibir informações
    public void exibirInformacoes(){
        System.out.println("Nome:"+nome+
                            " CPF: "+cpf+
                            " Idade: "+idade+
                            " Email: "+email+
                            " Usuário Ativo: "+usuarioAtivo);
    }
}