package Pesquisa;

import exception.PesquisadoresNaoDaSupervisaoException;

public class CordenadorPesq extends Pesquisador{
PesqAssociados pesquisadores [];
CordenadorPesq cordenSupervisionado [];
Professor professores[];

public CordenadorPesq(String nome) {
	super(nome);
	this.pesquisadores = new PesqAssociados [4];
	this.cordenSupervisionado = new CordenadorPesq [4];
	this.professores = new Professor [4];
	
}
public void addPesquisadores(PesqAssociados pesquisador, int pos ) {
	for(int i = 0; i<4; i++) {
		pesquisadores[pos] = pesquisador;
	}
}
public

@Override
public void pesquisadoresEmSupervisao() throws PesquisadoresNaoDaSupervisaoException {
	int contador = 0;
	for(int i = 0; i < 4; i ++) {
		if(this.pesquisadores != null)  {
			contador = contador + 1;
		
		if(this.cordenSupervisionado != null)  {
			contador = contador + 1;
		
		if(this.professores != null)  {
			contador = contador + 1;
				}
			}
		}
	}
}

}
