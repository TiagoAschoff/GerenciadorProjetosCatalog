/**
 * 
 */
package control.controller;

import java.util.Collection;

import model.classes.Projeto;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;
import control.regra.RNProjeto;

/**
 * @author marcio
 *
 */
public class ControlProjeto implements IControlProjeto{
	
	private RNProjeto rnp;
	
	public ControlProjeto(){
		rnp = new RNProjeto();
	}

	@Override
	public void cadastrarProjeto(Projeto projeto) throws ConexaoException,
			DAOException, InsercaoException, CampoException {
		rnp.valida(projeto );
    	rnp.verificar(projeto);
    	rnp.inserir(projeto);
	}

	@Override
	public void atualizarProjeto(Projeto projeto) throws ConexaoException,
			DAOException, AtualizarException, CampoException {
		rnp.validarIdProjeto(projeto);
    	rnp.validarIdInstituicao(projeto);
    	rnp.validarIdAreaPesquisa(projeto);
    	rnp.validarIdAssessor(projeto);
    	rnp.validarIdPesquisador(projeto);
    	rnp.valida(projeto);
    	rnp.verificar(projeto);
    	rnp.alterar(projeto);
	}

	@Override
	public void excluirProjeto(Projeto projeto) throws ConexaoException,
			DAOException, RemocaoException, CampoException {
		rnp.validarIdProjeto(projeto);
    	rnp.excluir(projeto);
	}

	@Override
	public Projeto pesquisarProjeto(Projeto projeto) throws ConexaoException,
			DAOException, BuscaException {
		return rnp.getProjeto(projeto);
	}

	@Override
	public Collection<Projeto> listarProjeto() throws ConexaoException,
			DAOException, ListaException {
		// TODO Auto-generated method stub
		return rnp.lista();
	}

	@Override
	public void atualizarSituacao(Projeto projeto) throws ConexaoException,
			DAOException, AtualizarException {
		rnp.atualizaSituacao(projeto);
	}
}
