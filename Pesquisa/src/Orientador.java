public class Orientador extends Pesquisador{
    
    public Orientador(String nome, Pesquisador orientador) {
        super(nome, orientador);
    
    }

    @Override
    public void addEscravos() throws ProfessorNaoTemPesquisadores {
    
    }

    @Override
    public void listarEscravos() throws ProfessorNaoTemPesquisadores {
    }

    @Override
    public double pagamento() {
    }
    
}
