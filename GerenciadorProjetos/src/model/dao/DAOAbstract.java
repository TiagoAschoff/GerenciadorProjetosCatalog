/**
 * 
 */
package model.dao;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TransactionRequiredException;

import model.classes.Generica;
import model.conexao.GerenciadorFactory;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;

/**
 * @author marcio
 *
 */
public abstract class DAOAbstract implements IDAOAbstract{
	
	private GerenciadorFactory gFactory;
	
	public DAOAbstract(){
		gFactory = GerenciadorFactory.getFactory();
	}
	
	
	public void inserir(Object object) throws ConexaoException, DAOException{
		inserir(object, gFactory.conectar(), true);
	}
	
	private void inserir(Object obj, EntityManager em, boolean fecharEM) throws DAOException{
		try{
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
			
			if(fecharEM){
				em.close();
			}
		} catch (EntityExistsException | TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da inserção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new DAOException(e);
		}
		
	}
	
	public void alterar(Object object) throws ConexaoException, DAOException{
		alterar(object, gFactory.conectar(), true);
	}
	
	private void alterar(Object object, EntityManager em, boolean fecharEM) throws DAOException, ConexaoException{
		try{
			em.getTransaction().begin();
			em.merge(object);
			em.getTransaction().commit();
			
			if(fecharEM){
				em.close();
			}
		}catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da atualização do objeto " + exc.getMessage());
		}catch (Exception e){
			throw new ConexaoException(e);
		}
		
	}
	
	public void excluir(Generica generica) throws ConexaoException, DAOException{
		excluir(generica, gFactory.conectar(), true);
	}
	
	private void excluir(Generica generica, EntityManager em, boolean fecharEM) throws DAOException, ConexaoException{
		try{
			em.getTransaction().begin();
			
			Object object = em.find(generica.getClass(), generica.getChavePrimaria());
			
			em.remove(object);
			em.getTransaction().commit();
			
			if(fecharEM){
				em.close();
			}
		}catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
		
	}
	
	public Generica consultar(Generica generica) throws ConexaoException, DAOException{
		return consultar(generica, gFactory.conectar(), false);
	}
	
	private Generica consultar(Generica generica, EntityManager em, boolean fecharEM) throws DAOException, ConexaoException{
		try{
			Generica retorno = (Generica) em.find(generica.getClass(), 
					generica.getChavePrimaria());
			
			if(fecharEM){
				em.close();
			}
			
			return retorno;
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}
}
