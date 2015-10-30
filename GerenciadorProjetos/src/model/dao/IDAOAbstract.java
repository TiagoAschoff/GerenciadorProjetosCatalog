/**
 * 
 */
package model.dao;

import model.classes.Generica;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;

/**
 * @author marcio
 *
 */
public interface IDAOAbstract {

	public void inserir(Object object) throws ConexaoException, DAOException;
	
	public void alterar(Object object) throws ConexaoException, DAOException;
	
	public void excluir(Generica generica) throws ConexaoException, DAOException;
	
	public Generica consultar(Generica generica) throws ConexaoException, DAOException;
}
