import java.util.Date;

public class Professor{
    public static int numProfessores = 0;
    public static int numMaxProfessores = 5;
    private String nome;
    private String setor;
    private String senha;

    Professor(String nome, String setor, String senha){
        this.nome = nome;
        this.setor = setor;
        this.senha = senha;
        Professor.numProfessores++;
    }

    public void reservarSala(Date data, Date horarioInicio, Sala sala, Date horarioFim){
        sala.reservarSala(this.nome, this.setor, data, horarioInicio, horarioFim);
    }

    public boolean autenticar(String nome, String senha){
        if(this.nome.equals(nome) && this.senha.equals(senha)){
            return true;
        }
        else return false;
    }
}
