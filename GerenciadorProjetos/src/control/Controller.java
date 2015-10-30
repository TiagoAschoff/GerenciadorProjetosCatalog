package control;

import java.util.Collection;

import model.classes.Instituicao;
import model.classes.Perfil;
import model.classes.Projeto;
import model.classes.Situacao;
import model.classes.Usuario;
import model.dao.DAOInstituicao;
import model.dao.DAOProjeto;
import model.dao.DAOUsuario;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

public class Controller {
	//crud Usu�rio
	public void cadastrarUsuario(Usuario usuario) throws ConexaoException, DAOException{
		new DAOUsuario().inserir(usuario);
	}
	public void atualizarUsuario(Usuario usuario) throws ConexaoException, DAOException{
		new DAOUsuario().alterar(usuario);
	}
	public Usuario pesquisarUsuario(Usuario usuario) throws ConexaoException, DAOException{
		return (Usuario) new DAOUsuario().consultar(usuario);
	}
	public void excluirUsuario(Usuario usuario) throws ConexaoException, DAOException{
		new DAOUsuario().excluir(usuario);
	}
	public Collection<Usuario> listarUsuario() throws ConexaoException, DAOException{
		return new DAOUsuario().listar();
	}
	public Collection<Perfil> listarPerfil() throws ConexaoException, DAOException{
		return new DAOUsuario().listarPerfil();
	}
	public Collection<Usuario> listarUsuarioPerfil(String abreviacao) throws ConexaoException, DAOException{
		return new DAOUsuario().listarUsuariosPerfil(abreviacao);
	}
	public Collection<Usuario> pesquisaCriteria(Usuario usuario) throws ConexaoException, DAOException{
		return new DAOUsuario().pesquisarCriteria(usuario);
	}
	public Collection<Usuario> pesquisaCriteriaJoin(Usuario usuario) throws ConexaoException, DAOException{
		return new DAOUsuario().pesquisarCriteriaJoin(usuario);
	}
	
	// crud Institui��o
	public void cadastrarInstituicao(Instituicao instituicao) throws ConexaoException, DAOException{
		new DAOInstituicao().inserir(instituicao);
	}
	public void atualizarInstituicao(Instituicao instituicao) throws ConexaoException, DAOException{
		new DAOInstituicao().alterar(instituicao);
	}
	public Instituicao pesquisarInstituicao(Instituicao instituicao) throws ConexaoException, DAOException{
		return (Instituicao) new DAOInstituicao().consultar(instituicao);
	}
	public void excluirInstituicao(Instituicao instituicao) throws ConexaoException, DAOException{
		new DAOInstituicao().excluir(instituicao);
	}
	public Collection<Instituicao> listarInstituicao() throws ConexaoException, DAOException{
		return new DAOInstituicao().listar();
	}
	
	// crud Projeto
	public void cadastrarProjeto(Projeto projeto) throws ConexaoException, DAOException{
		new DAOProjeto().inserir(projeto);
	}
	public void atualizarProjeto(Projeto projeto) throws ConexaoException, DAOException{
		new DAOProjeto().alterar(projeto);
	}
	public Projeto pesquisarProjeto(Projeto projeto) throws ConexaoException, DAOException{
		return (Projeto) new DAOProjeto().consultar(projeto);
	}
	public void excluirProjeto(Projeto projeto) throws ConexaoException, DAOException{
		new DAOProjeto().excluir(projeto);
	}
	public Collection<Projeto> listarProjeto() throws ConexaoException, DAOException{
		return new DAOProjeto().listar();
	}	
	public void informarSituacao(Projeto projeto) throws ConexaoException, DAOException{
		new DAOProjeto().informarSituacao(projeto);
	}
}
