public class Aluno extends Pessoa{

    //Atributos
    private int matricula;
    private int serie;
    
    //Metodos
    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public int getSerie(){
        return serie;
    }

    public void setSerie(int serie){
        this.serie = serie;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome:"+getNome()+
                            " CPF: "+getCpf()+
                            " Idade: "+getIdade()+
                            " Email: "+getEmail()+
                            " Usuario Ativo: "+getUsuarioAtivo()+
                            " Matricula: "+matricula+
                            " Serie: "+serie);
    }
}