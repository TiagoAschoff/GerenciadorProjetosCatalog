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

/**
 * @author marcio
 *
 */
public interface IControlProjeto {

	public void cadastrarProjeto(Projeto projeto)  throws ConexaoException, DAOException, InsercaoException, CampoException;
	
	public void atualizarProjeto(Projeto projeto)  throws ConexaoException, DAOException, AtualizarException, CampoException;
	
	public void excluirProjeto(Projeto projeto)  throws ConexaoException, DAOException, RemocaoException, CampoException;
	
	public Projeto pesquisarProjeto(Projeto projeto)  throws ConexaoException, DAOException, BuscaException, CampoException;
	
	public Collection<Projeto> listarProjeto() throws ConexaoException, DAOException, ListaException;
	
	public void atualizarSituacao(Projeto projeto) throws ConexaoException, DAOException, AtualizarException;
}
