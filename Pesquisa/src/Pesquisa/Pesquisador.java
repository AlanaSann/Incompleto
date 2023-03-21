package Pesquisa;
import exception.PesquisadoresNaoDaSupervisaoException;
public abstract class Pesquisador {
private String nome;



public Pesquisador(String nome) {
	super();
	this.nome = nome;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public abstract void pesquisadoresEmSupervisao() throws PesquisadoresNaoDaSupervisaoException;

}
