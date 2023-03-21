package Pesquisa;

import exception.PesquisadoresNaoDaSupervisaoException;

public class Professor extends Pesquisador{
	CordenadorPesq cordenador;
	
	
	public Professor(String nome, CordenadorPesq cordenador) {
		super(nome);
		this.cordenador = cordenador;
	}

	@Override
	public void pesquisadoresEmSupervisao() throws PesquisadoresNaoDaSupervisaoException {
		throw new PesquisadoresNaoDaSupervisaoException();
	}

	public void mostrarCordenador() {
		System.out.println(this.cordenador.getNome());
	}

}
