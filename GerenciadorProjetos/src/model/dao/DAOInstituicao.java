/**
 * 
 */
package model.dao;

import java.util.Collection;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.TransactionRequiredException;
import javax.persistence.TypedQuery;

import model.classes.Generica;
import model.classes.Instituicao;
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
 * Classe responsável por representar o DAO da Instituição
 */
public class DAOInstituicao extends DAOAbstract implements IInstituicao{

	private GerenciadorFactory gFactory;
	
	public DAOInstituicao() {
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
	
	@Override
	public Collection<Instituicao> listar() throws ConexaoException, DAOException {
		try {
			String query = "SELECT i FROM Instituicao i";
			EntityManager em = gFactory.conectar();
			TypedQuery<Instituicao> queryTpd = em.createQuery(query, Instituicao.class);
			Collection<Instituicao> colecaoInst = queryTpd.getResultList();
			em.close();
			return colecaoInst;
		} catch(TransactionRequiredException | IllegalArgumentException ex){
			throw new DAOException("Erro ao listar o objeto " + ex.getMessage());
		} catch (Exception e) {
			throw new ConexaoException(e);
		}
	}

}
