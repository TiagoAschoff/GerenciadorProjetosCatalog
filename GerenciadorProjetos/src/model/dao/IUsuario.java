package model.dao;

import java.util.Collection;

import model.classes.Perfil;
import model.classes.Usuario;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

/**
 * 
 * @author marcio
 * Interface responsável por representar o DAO do Usuário
 */
public interface IUsuario {
	
	//void inserir(Usuario usuario) throws ConexaoException, DAOException;
	
	//void alterar(Usuario usuario) throws ConexaoException, DAOException;
	
	//void remover(Usuario usuario) throws ConexaoException, DAOException;
	
	//void remover(Integer pCdUsuario) throws ConexaoException, DAOException;
	
	//Usuario pesquisar(Integer idUsuario) throws ConexaoException, DAOException;
	
	//Usuario pesquisar(Usuario usuario) throws ConexaoException, DAOException;
	
	Collection<Usuario> pesquisarCriteria(Usuario usuario) throws ConexaoException, DAOException;
	
	Collection<Usuario> pesquisarCriteriaJoin(Usuario usuario) throws ConexaoException, DAOException;
	
	Collection<Usuario> listar() throws ConexaoException, DAOException;
	
	Collection<Perfil> listarPerfil() throws ConexaoException, DAOException;
	
	Collection<Usuario> listarUsuariosPerfil(String abreviacaoPerfil) throws ConexaoException, DAOException;
}
