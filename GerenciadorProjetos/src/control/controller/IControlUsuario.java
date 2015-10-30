/**
 * 
 */
package control.controller;

import java.util.Collection;

import model.classes.Perfil;
import model.classes.Usuario;
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
public interface IControlUsuario {

	public void cadastrar(Usuario usuario) throws ConexaoException, DAOException, InsercaoException, CampoException;
	
	public void alterar(Usuario usuario) throws ConexaoException, DAOException, AtualizarException, CampoException;
	
	public void excluir(Usuario usuario) throws ConexaoException, DAOException, RemocaoException, CampoException;
	
	public Usuario pesquisar(Usuario usuario) throws ConexaoException, DAOException, BuscaException;
		
	public Collection<Usuario> listar() throws ConexaoException, DAOException, ListaException;
	
	public Collection<Perfil> listarPerfil() throws ConexaoException, DAOException, ListaException;
	
	public Collection<Usuario> listarUsuariosPerfil(String abreviacao) throws ConexaoException, DAOException, ListaException;
	
	public Collection<Usuario> pesquisaCriteria(Usuario usuario) throws ConexaoException, DAOException, ListaException;
	
	public Collection<Usuario> pesquisarCriteriaJoin(Usuario usuario) throws ConexaoException, DAOException, ListaException;
}
