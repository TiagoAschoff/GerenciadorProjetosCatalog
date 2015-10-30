package fachada;

import java.util.Collection;

import control.controller.ControlInstituicao;
import control.controller.ControlProjeto;
import control.controller.ControlUsuario;
import control.regra.RNInstituicao;
import control.regra.RNProjeto;
import control.regra.RNUsuario;
import model.classes.Instituicao;
import model.classes.Perfil;
import model.classes.Projeto;
import model.classes.Situacao;
import model.classes.Usuario;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

public class Fachada {
		private static Fachada instancia;
		
		public static Fachada getInstancia(){
			if(instancia == null){
				return instancia = new Fachada();
			}
			return instancia;
		}
		
		ControlUsuario cUsuario = new ControlUsuario();
		ControlInstituicao cInstituicao = new ControlInstituicao();
		ControlProjeto cProjeto = new ControlProjeto();
			
		/**
	     * M�todo respons�vel por chamar o  controlador do Projeto , e consequentemente
	     * inserir o Projeto 
	     * @param projeto  - Projeto 
		 * @throws CampoException 
	     * @throws InsercaoException 
		 * @throws DAOException 
		 * @throws ConexaoException 
	     */
	    public void cadastrarProjeto (Projeto projeto) throws CampoException, InsercaoException, ConexaoException, DAOException{
	    	cProjeto.cadastrarProjeto(projeto);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do projeto, e consequentemente
	     * atualizar o projeto
	     * @param projeto - Projeto
	     * @throws AtualizarException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     * @throws CamposException
	     * @throws AtualizacaoException 
	     */
	    public void alterarProjeto(Projeto projeto) throws AtualizarException, CampoException, ConexaoException, DAOException {
	    	cProjeto.atualizarProjeto(projeto);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do projeto, e consequentemente
	     * Remover o projeto
	     * @param projeto - Projeto
	     * @throws CampoException 
	     * @throws CamposException
	     * @throws RemocaoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public void removerProjeto(Projeto projeto) throws CampoException, RemocaoException, ConexaoException, DAOException {
	    	cProjeto.excluirProjeto(projeto);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do projeto, e consequentemente
	     * pesquisar o projeto, atrav�s do ID passado em paramentro
	     * @param 
	     * @return 
	     * @throws BuscaException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public Projeto pesquisaProjeto(Projeto projeto) throws BuscaException, CampoException, ConexaoException, DAOException {
	        return cProjeto.pesquisarProjeto(projeto);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o  controlador do projeto, e consequentemente
	     * listar todos projeto
	     * @return retorna um Collection<projeto> 
	     * @throws ListaException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public Collection<Projeto> listaProjeto() throws ListaException, CampoException, ConexaoException, DAOException {
	        return cProjeto.listarProjeto();
	    }
	    
	    /**
	     * Método respons�vel por chamar o Controlador do projeto, e consequentemente
	     * atualizar a situação do projeto
	     * @param Situacao - situacao
	     * @throws CampoException 
	     * @throws AtualizarException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public void informarSituacao(Projeto projeto) throws CampoException, AtualizarException, ConexaoException, DAOException {
	    	cProjeto.atualizarSituacao(projeto);
	    }
	    
		/**
	     * M�todo respons�vel por chamar o  controlador do Instituicao, e consequentemente
	     * inserir a Instituicao
	     * @param instituicao - Instituicao
		 * @throws CampoException 
	     * @throws InsercaoException 
		 * @throws DAOException 
		 * @throws ConexaoException 
	     */
	    public void cadastrarInstituicao(Instituicao instituicao) throws CampoException, InsercaoException, ConexaoException, DAOException{
	    	cInstituicao.cadastrarInstituicao(instituicao);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do Instituicao, e consequentemente
	     * atualizar o Instituicao
	     * @param instituicao - Instituicao
	     * @throws AtualizarException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     * @throws CamposException
	     * @throws AtualizacaoException 
	     */
	    public void alterarInstituicao(Instituicao instituicao) throws AtualizarException, CampoException, ConexaoException, DAOException {
	    	cInstituicao.atualizarInstituicao(instituicao);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador da Instituicao, e consequentemente
	     * Remover a Instituicao
	     * @param instituicao - Instituicao
	     * @throws CampoException 
	     * @throws CamposException
	     * @throws RemocaoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public void removerInstituicao(Instituicao instituicao) throws CampoException, RemocaoException, ConexaoException, DAOException {
	    	cInstituicao.excluirInstituicao(instituicao);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do Instituicao, e consequentemente
	     * pesquisar a Instituicao, atrav�s do ID passado em paramentro
	     * @param 
	     * @return 
	     * @throws BuscaException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public Instituicao pesquisaInstituicao(Instituicao instituicao) throws BuscaException, CampoException, ConexaoException, DAOException {
	        return cInstituicao.pesquisarInstituicao(instituicao);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o  controlador da instituicao, e consequentemente
	     * listar todas instituicao
	     * @return retorna um Collection<instituicao> 
	     * @throws ListaException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public Collection<Instituicao> listaInstituicao() throws ListaException, ConexaoException, DAOException {
	        return cInstituicao.listarInstituicao();
	    }
	    
		
		/**
	     * M�todo respons�vel por chamar o  controlador do Usu�rio, e consequentemente
	     * inserir o Usu�rio
	     * @param usuario - Usuario
		 * @throws CampoException 
	     * @throws InsercaoException 
		 * @throws DAOException 
		 * @throws ConexaoException 
	     */
	    public void cadastrarUsuario(Usuario usuario) throws CampoException, InsercaoException, ConexaoException, DAOException{
	    	cUsuario.cadastrar(usuario);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do usu�rio, e consequentemente
	     * atualizar o usu�rio
	     * @param usuario - Usuario
	     * @throws AtualizarException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     * @throws CamposException
	     * @throws AtualizacaoException 
	     */
	    public void alterarUsuario(Usuario usuario) throws AtualizarException, CampoException, ConexaoException, DAOException {
	    	cUsuario.alterar(usuario);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do usu�rio, e consequentemente
	     * Remover o usu�rio
	     * @param usuario - Usuario
	     * @throws CampoException 
	     * @throws CamposException
	     * @throws RemocaoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public void removerUsuario(Usuario usuario) throws CampoException, RemocaoException, ConexaoException, DAOException {
	    	cUsuario.excluir(usuario);
	    }
	    
	    /**
	     * M�todo respons�vel por chamar o Controlador do usu�rio, e consequentemente
	     * pesquisar o Usu�rio, atrav�s do ID passado em paramentro
	     * @param 
	     * @return 
	     * @throws BuscaException 
	     * @throws CampoException 
	     * @throws DAOException 
	     * @throws ConexaoException 
	     */
	    public Usuario pesquisaUsuario(Usuario usuario) throws BuscaException, CampoException, ConexaoException, DAOException {
	        return cUsuario.pesquisar(usuario);
	    }
	    
	    public Collection<Usuario> listarUsuarios() throws ListaException, ConexaoException, DAOException{
	    	return cUsuario.listar();
	    }
	    
	    public Collection<Perfil> listarPerfis() throws ListaException, ConexaoException, DAOException{
	    	return cUsuario.listarPerfil();
	    }
	    
	    public Collection<Usuario> listarUsuarioPerfis(String abreviacaoPerfil) throws ListaException, ConexaoException, DAOException{
	    	return cUsuario.listarUsuariosPerfil(abreviacaoPerfil);
	    }
	    
	    public Collection<Usuario> pesquisarCriteria(Usuario usuario) throws ListaException, ConexaoException, DAOException{
	    	return cUsuario.pesquisaCriteria(usuario);
	    }
	    
	    public Collection<Usuario> pesquisarCriteriaJoin(Usuario usuario) throws ListaException, ConexaoException, DAOException{
	    	return cUsuario.pesquisarCriteriaJoin(usuario);
	    }
}
