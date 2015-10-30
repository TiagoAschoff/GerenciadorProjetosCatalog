/**
 * 
 */
package model.dao;

import java.util.Collection;

import model.classes.Projeto;
import model.classes.Situacao;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

/**
 * @author marcio
 * Interface responsável por representar o DAO do Projeto
 */
public interface IProjeto {

	/*public void inserir(Projeto projeto) throws ConexaoException, DAOException;
	
	public void alterar(Projeto projeto) throws ConexaoException, DAOException;
	
	public Projeto pesquisar(Integer idProjeto) throws ConexaoException, DAOException;
	
	public void remover(Projeto projeto) throws ConexaoException, DAOException;*/
	
	public void informarSituacao(Projeto projeto) throws ConexaoException, DAOException;
	
	public Collection<Projeto> listar() throws ConexaoException, DAOException;
	
}
