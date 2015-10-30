/**
 * 
 */
package model.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import model.excecoes.ConexaoException;

/**
 * @author marcio
 * Interface responsável por representar o gerenciamento do factory
 */
public interface IGerenciarFactory {
	
	public EntityManager conectar() throws ConexaoException;
	
	public void desconectar() throws ConexaoException;
}
