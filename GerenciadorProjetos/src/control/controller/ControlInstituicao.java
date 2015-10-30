/**
 * 
 */
package control.controller;

import java.util.Collection;

import model.classes.Instituicao;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;
import control.regra.RNInstituicao;

/**
 * @author marcio
 *
 */
public class ControlInstituicao implements IControlInstituicao{
	
	private RNInstituicao rni;
	
	public ControlInstituicao(){
		rni = new RNInstituicao();
	}

	@Override
	public void cadastrarInstituicao(Instituicao instituicao)
			throws ConexaoException, DAOException, CampoException, InsercaoException {
		rni.valida(instituicao);
    	rni.verificar(instituicao);
    	rni.verificarIdUsuario(instituicao);
    	rni.inserir(instituicao);
	}

	@Override
	public void atualizarInstituicao(Instituicao instituicao)
			throws ConexaoException, DAOException, AtualizarException, CampoException {
		rni.verificarIdInstituicao(instituicao);
    	rni.valida(instituicao);
    	rni.verificar(instituicao);
    	rni.alterar(instituicao);
	}

	@Override
	public void excluirInstituicao(Instituicao instituicao)
			throws ConexaoException, DAOException, RemocaoException, CampoException {
		rni.isValidarIdInstituicao(instituicao);
    	rni.verificarIdUsuario(instituicao);
    	rni.excluir(instituicao);
	}

	@Override
	public Instituicao pesquisarInstituicao(Instituicao instituicao)
			throws ConexaoException, DAOException, BuscaException, CampoException {
		return rni.getInstituicao(instituicao);
	}

	@Override
	public Collection<Instituicao> listarInstituicao() throws ConexaoException,
			DAOException, ListaException{
		return rni.lista();
	}
}
