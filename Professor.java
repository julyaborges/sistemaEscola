public class Professor extends Pessoa{

    //Atributos
    private double salario;
    
    //Metodos
    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome:"+getNome()+
                            " CPF: "+getCpf()+
                            " Idade: "+getIdade()+
                            " Email: "+getEmail()+
                            " Usuario Ativo: "+getUsuarioAtivo()+
                            " Salario: "+salario);
    }
}