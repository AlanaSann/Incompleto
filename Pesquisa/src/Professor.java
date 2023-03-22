public class Professor extends Pesquisador {

    public Professor(String nome, Pesquisador orientador) {
        super(nome, orientador);
    }

    @Override
    public void addPesquisadores() throws ProfessorNaoTemPesquisadores {
        throw new ProfessorNaoTemPesquisadores();
    }

    @Override
    public void listarPesquisadores() throws ProfessorNaoTemPesquisadores {
        throw new ProfessorNaoTemPesquisadores();
    }

    @Override
    public double pagamento() {
        //220 + 30% do Orientador
    return 220 +(30/100 * this.getOrientador().pagamento());
        
    }

    
    
}
