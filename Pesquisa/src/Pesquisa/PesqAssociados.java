package Pesquisa;
import exception.PesquisadoresNaoDaSupervisaoException;

public class PesqAssociados extends Pesquisador{
CordenadorPesq cordenador;

public PesqAssociados(String nome,CordenadorPesq cordenador) {
	super(nome);
	this.cordenador = cordenador;
}
public PesqAssociados(String nome) {
	super(nome);
}
@Override
public void pesquisadoresEmSupervisao() throws PesquisadoresNaoDaSupervisaoException {
	throw new PesquisadoresNaoDaSupervisaoException();
}

public void mostrarCordenador() {
	System.out.println(this.cordenador.getNome());
}

}
