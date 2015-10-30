/**
 * 
 */
package model.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.excecoes.ConexaoException;

/**
 * @author marcio
 * Classe responsável por Gerenciar o Factory do JPA na aplicação
 * @implements Implementando a interface do Gerenciador Factory
 */
public class GerenciadorFactory implements IGerenciarFactory{

	private static GerenciadorFactory gerenciadorFactory;
	private EntityManagerFactory emf;
	private EntityManager em;
	
	private GerenciadorFactory() {
		
	}
	
	public static GerenciadorFactory getFactory(){
		if(gerenciadorFactory == null){
			gerenciadorFactory = new GerenciadorFactory();
		}
		return gerenciadorFactory;
	}
	
	@Override
	public EntityManager conectar() throws ConexaoException {
		emf = Persistence.createEntityManagerFactory("GerenciadorProj");
		return emf.createEntityManager();
	}

	@Override
	public void desconectar() throws ConexaoException {
		emf.close();
	}

}
