/**
 * 
 */
package control.controller;

import java.util.Collection;

import control.regra.RNUsuario;
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
public class ControlUsuario implements IControlUsuario {
	
	private RNUsuario rnu;
	
	public ControlUsuario() {
		rnu = new RNUsuario();
	}

	@Override
	public void cadastrar(Usuario usuario) throws ConexaoException,
			DAOException, InsercaoException, CampoException {
		rnu.valida(usuario);
    	rnu.verificar(usuario);
    	rnu.inserir(usuario);
	}

	@Override
	public void alterar(Usuario usuario) throws ConexaoException, DAOException, AtualizarException, CampoException {
		rnu.isIdValido(usuario);
    	rnu.verificarIdUsuario(usuario);
    	rnu.valida(usuario);
    	rnu.verificar(usuario);
    	rnu.alterar(usuario);
	}

	@Override
	public void excluir(Usuario usuario) throws ConexaoException, DAOException, RemocaoException, CampoException {
		rnu.isIdValido(usuario);
    	rnu.verificarIdUsuario(usuario);
    	rnu.excluir(usuario);		
	}

	@Override
	public Usuario pesquisar(Usuario usuario) throws ConexaoException,
			DAOException, BuscaException {
		return rnu.getUsuario(usuario);
	}

	@Override
	public Collection<Usuario> listar() throws ConexaoException, DAOException, ListaException {
		return rnu.lista();
	}

	@Override
	public Collection<Perfil> listarPerfil() throws ConexaoException,
			DAOException, ListaException {
		return rnu.listaPerfis();
	}

	@Override
	public Collection<Usuario> listarUsuariosPerfil(String abreviacao)
			throws ConexaoException, DAOException, ListaException {
		return rnu.listaUsuariosPerfil(abreviacao);
	}

	@Override
	public Collection<Usuario> pesquisaCriteria(Usuario usuario)
			throws ConexaoException, DAOException, ListaException {
		return rnu.pesquisarCriteria(usuario);
	}

	@Override
	public Collection<Usuario> pesquisarCriteriaJoin(Usuario usuario)
			throws ConexaoException, DAOException, ListaException {
		return rnu.pesquisarCriteriaJoin(usuario);
	}
	
	

}
