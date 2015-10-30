/**
 * 
 */
package model.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.omg.CORBA.RepositoryIdHelper;

import model.classes.Generica;
import model.classes.Perfil;
import model.classes.Usuario;
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
 * Classe responsável por representar o DAO do Usuário
 */
public class DAOUsuario extends DAOAbstract implements IUsuario {
	
	private GerenciadorFactory gFactory;
	
	public DAOUsuario() {
		gFactory = GerenciadorFactory.getFactory();
	}
	
	@Override
	public void inserir(Object object) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		super.inserir(object);
	}
	
	/*@Override
	public void inserir(Usuario usuario) throws ConexaoException, DAOException {
		try {
			EntityManager em = gFactory.conectar();
			em.getTransaction().begin();
			em.persist(usuario);
			em.getTransaction().commit();
			em.close();
		} catch (EntityExistsException | TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da inserção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new DAOException(e);
		}
	}*/

	@Override
	public void alterar(Object object) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		super.alterar(object);
	}
	/*@Override
	public void alterar(Usuario usuario) throws ConexaoException, DAOException {
		try {
			EntityManager em = gFactory.conectar();
			em.getTransaction().begin();
			em.merge(usuario);
			em.getTransaction().commit();
			em.close();
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da atualização do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}		
	}*/
	
	@Override
	public void excluir(Generica generica) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		super.excluir(generica);
	}

	/*@Override
	public void remover(Usuario usuario) throws ConexaoException, DAOException {
		try {
			EntityManager em = gFactory.conectar();
			EntityTransaction t = em.getTransaction();
			t.begin();
			Usuario usuRet = em.find(Usuario.class, usuario.getIdUsuario());
			em.remove(usuRet);
			t.commit();
			em.close();
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}		
	}*/
	
	/*@Override
	public void remover(Integer pCdUsuario) throws ConexaoException, DAOException {
		try {
			EntityManager em = gFactory.conectar();
			EntityTransaction t = em.getTransaction();
			t.begin();
			Usuario u = em.find(Usuario.class, pCdUsuario);
			em.remove(u);
			t.commit();
			em.close();
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}		
	}*/
	
	@Override
	public Generica consultar(Generica generica) throws ConexaoException, DAOException {
		// TODO Auto-generated method stub
		return super.consultar(generica);
	}

	/*@Override
	public Usuario pesquisar(Integer idUsuario) throws ConexaoException, DAOException{
		try {
			EntityManager em = gFactory.conectar();
			Usuario usuario= em.find(Usuario.class, idUsuario);
			em.close();
			return usuario;
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}
	
	@Override
	public Usuario pesquisar(Usuario usuario) throws ConexaoException, DAOException{
		try{
			EntityManager em = gFactory.conectar();
			Usuario retUsuario= em.find(Usuario.class, usuario.getNome());
			em.close();
			return retUsuario;
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}	
	*/
	@Override
	public Collection<Usuario> listar() throws ConexaoException, DAOException {
		try {
			String query = "SELECT u FROM Usuario u";
			EntityManager em = gFactory.conectar();
			TypedQuery<Usuario> queryTpd = em.createQuery(query, Usuario.class);
			Collection<Usuario> colecaoUsuario = queryTpd.getResultList();
			em.close();
			return colecaoUsuario;
		} catch(TransactionRequiredException | IllegalArgumentException ex){
			throw new DAOException("Erro ao listar o objeto " + ex.getMessage());
		} catch (Exception e) {
			throw new ConexaoException(e);
		}
	}

	@Override
	public Collection<Perfil> listarPerfil() throws ConexaoException, DAOException{
		try{
			String query = "SELECT p FROM Perfil p";
			EntityManager em = gFactory.conectar();
			Query queryPerfil = em.createQuery(query, Perfil.class);
			Collection<Perfil> colecaoPerfil = queryPerfil.getResultList();
			em.close();
			return colecaoPerfil;
		}catch(TransactionRequiredException | IllegalArgumentException ex){
			throw new DAOException("Erro ao listar o objeto " + ex.getMessage());
		}catch(Exception e){
			throw new ConexaoException(e);
		}
	}

	@Override
	public Collection<Usuario> listarUsuariosPerfil(String abreviacaoPerfil)
			throws ConexaoException, DAOException {
		try {
			String query = "SELECT u FROM Usuario u Join u.perfil p where "
					+ "p.abreviacao = :abreviacao";
			EntityManager em = gFactory.conectar();
			TypedQuery<Usuario> queryTpd = em.createQuery(query, Usuario.class);
			queryTpd.setParameter("abreviacao", abreviacaoPerfil);
			Collection<Usuario> colecaoUsuario = queryTpd.getResultList();
			em.close();
			return colecaoUsuario;
		} catch(TransactionRequiredException | IllegalArgumentException ex){
			throw new DAOException("Erro ao listar o objeto " + ex.getMessage());
		} catch (Exception e) {
			throw new ConexaoException(e);
		}
	}

	

	@Override
	public Collection<Usuario> pesquisarCriteria(Usuario usuario) throws ConexaoException,
			DAOException {
		try{
			EntityManager em = gFactory.conectar();
			CriteriaBuilder builderCriteria = em.getCriteriaBuilder();
			CriteriaQuery<Usuario> queryCriteria = builderCriteria.createQuery(Usuario.class);
			Root<Usuario> usuarioCriteria = queryCriteria.from(Usuario.class);
			
			List<Predicate> condicoesWhere = new ArrayList<Predicate>();
			
			Path<String> atributoNome = usuarioCriteria.get("nome");
			queryCriteria.where(builderCriteria.equal(atributoNome, usuario.getNome()));
			Path<String> atributoId = usuarioCriteria.get("idUsuario");
			queryCriteria.where(builderCriteria.equal(atributoId, usuario.getIdUsuario()));
			
			Predicate[] arrayCondicionais = condicoesWhere.toArray(new Predicate[condicoesWhere.size()]);
			
			Predicate todosOsCond = builderCriteria.and(arrayCondicionais);
			queryCriteria.where(todosOsCond);
			
			TypedQuery<Usuario> queryUser = em.createQuery(queryCriteria);
			Collection<Usuario> usuRetorno = queryUser.getResultList();
			
			return usuRetorno;
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}
	
	@Override
	public Collection<Usuario> pesquisarCriteriaJoin(Usuario usuario) throws ConexaoException,
			DAOException {
		try{
			EntityManager em = gFactory.conectar();
			CriteriaBuilder builderCriteria = em.getCriteriaBuilder();
			CriteriaQuery<Usuario> queryCriteria = builderCriteria.createQuery(Usuario.class);
			Root<Usuario> usuarioCriteria = queryCriteria.from(Usuario.class);
			
			List<Predicate> condicoesWhere = new ArrayList<Predicate>();
			
			Path<String> atributoNome = usuarioCriteria.get("nome");
			queryCriteria.where(builderCriteria.equal(atributoNome, usuario.getNome()));
			Path<String> atributoId = usuarioCriteria.get("idUsuario");
			queryCriteria.where(builderCriteria.equal(atributoId, usuario.getIdUsuario()));
			
			Join<Usuario, Perfil> usuarioPerfil = usuarioCriteria.join("perfil");
			queryCriteria.where(builderCriteria.and(
					builderCriteria.equal(
							usuarioPerfil.get("idPerfil"), usuario.getPerfil().getIdPerfil()
							)
						)
					);
			
			Predicate[] arrayCondicionais = condicoesWhere.toArray(new Predicate[condicoesWhere.size()]);
			
			Predicate todosOsCond = builderCriteria.and(arrayCondicionais);
			queryCriteria.where(todosOsCond);
			
			TypedQuery<Usuario> queryUser = em.createQuery(queryCriteria);
			Collection<Usuario> usuRetorno = queryUser.getResultList();
			
			return usuRetorno;
		} catch (TransactionRequiredException | IllegalArgumentException exc) {
			throw new DAOException("Erro no momento da remoção do objeto " + exc.getMessage());
		} catch (Exception e){
			throw new ConexaoException(e);
		}
	}
}
