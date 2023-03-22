import java.util.ArrayList;


public abstract class  Pesquisador {
    private String nome;
    private Pesquisador orientador;
    private ArrayList<Pesquisador> listaPesquisadores;

    
    public Pesquisador(String nome, Pesquisador orientador) {
        this.nome = nome;
        this.orientador = orientador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Pesquisador getOrientador() {
        return orientador;
    }
    public void setOrientador(Pesquisador orientador) {
        this.orientador = orientador;
    }
    public ArrayList<Pesquisador> getlistaPesquisadores() {
        return listaPesquisadores;
    }

    public abstract void  addPesquisadores(Pesquisador escravo) throws ProfessorNaoTemPesquisadores;
    public abstract void listarPesquisadores() throws ProfessorNaoTemPesquisadores;
    public abstract double pagamento();   

}
