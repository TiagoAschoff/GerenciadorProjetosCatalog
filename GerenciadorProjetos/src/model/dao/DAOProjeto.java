/**
 * 
 */
package model.dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TransactionRequiredException;
import javax.persistence.TypedQuery;

import model.classes.Generica;
import model.classes.Projeto;
import model.classes.Situacao;
import model.conexao.GerenciadorFactory;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

/**
 * @author marcio
 * Classe responsável por representar o DAO do Projeto
 */
public class DAOProjeto extends DAOAbstract implements IProjeto{

	private GerenciadorFactory gFactory;
	
	public DAOProjeto() {
		gFactory = GerenciadorFactory.getFactory();
	}
	
	@Override
	public void inserir(Object object) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		super.inserir(object);
	}
	
	@Override
	public void alterar(Object object) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		super.alterar(object);
	}
	
	@Override
	public void excluir(Generica generica) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		super.excluir(generica);
	}
	
	@Override
	public Generica consultar(Generica generica) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		return super.consultar(generica);
	}	
	
	/*@Override
	public void inserir(Projeto projeto) throws ConexaoException, DAOException {
		try {
			EntityManager em = gFactory.conectar();
			em.getTransaction().begin();
			em.persist(projeto);
			em.getTransaction().commit();
			em.close();
		} catch (EntityExistsException | TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da inserção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}

	@Override
	public void alterar(Projeto projeto) throws ConexaoException, DAOException{
		try {
			EntityManager em = gFactory.conectar();
			em.getTransaction().begin();
			em.merge(projeto);
			em.getTransaction().commit();
			em.close();
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da atualização do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}	
	}

	@Override
	public void remover(Projeto projeto) throws ConexaoException, DAOException{
		try {
			EntityManager em = gFactory.conectar();
			em.getTransaction().begin();
			Projeto proj = em.find(Projeto.class, projeto.getIdProjeto());
			em.remove(proj);
			em.getTransaction().commit();
			em.close();
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}

	@Override
	public Projeto pesquisar(Integer idProjeto) throws ConexaoException, DAOException {
		try {
			EntityManager em = gFactory.conectar();
			Projeto projeto = em.find(Projeto.class, idProjeto);
			em.close();
			return projeto;
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}*/

	/*@Override
	public Projeto pesquisar(Integer idProjeto) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		return null;
	}*/
		
	@Override
	public void informarSituacao(Projeto projeto) throws ConexaoException,
			DAOException {
		try {
			EntityManager em = gFactory.conectar();
			Projeto projRet = em.find(Projeto.class, projeto.getIdProjeto());
			Situacao sit = em.find(Situacao.class, 3);
			Collection<Situacao> cSit = new ArrayList<>();
			cSit.add(sit);
			projeto.setColecaoSituacao(cSit);
			//projRet.setColecaoSituacao(projeto.getColecaoSituacao());
			em.getTransaction().begin();
			em.persist(projRet);
			em.getTransaction().commit();
			em.close();
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da atualização do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}

	@Override
	public Collection<Projeto> listar() throws ConexaoException, DAOException{
		try{
			EntityManager em = gFactory.conectar();
			String query = "select pr from Projeto pr";
			TypedQuery<Projeto> queryTpd = em.createQuery(query, Projeto.class);
			Collection<Projeto> colecaoProj = queryTpd.getResultList();
			em.close();
			return colecaoProj;
		} catch(TransactionRequiredException | IllegalArgumentException ex){
			throw new DAOException("Erro ao listar o objeto " + ex.getMessage());
		} catch(Exception e){
			throw new ConexaoException(e);
		}
	}
}
