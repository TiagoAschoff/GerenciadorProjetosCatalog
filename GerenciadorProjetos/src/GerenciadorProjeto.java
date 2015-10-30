import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import antlr.collections.Enumerator;
import control.controller.ControlInstituicao;
import control.controller.ControlUsuario;
import model.classes.AreaPesquisa;
import model.classes.Assessor;
import model.classes.Endereco;
import model.classes.Instituicao;
import model.classes.Perfil;
import model.classes.Pesquisador;
import model.classes.Projeto;
import model.classes.Situacao;
import model.classes.Usuario;
import model.conexao.GerenciadorFactory;
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

/**
 * TODO - Falta verificar
 * 1 - O relacionamento N - N do Projeto com Situacao;
 * 2 - Verificar a Regra de Negócio
 */

/**
 * @author marcio
 * Classe responsável pela execução do projeto
 */
public class GerenciadorProjeto {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Instituicao i = new Instituicao();
		i.setNome("Nova Roma");
		i.setEmail("nova@email.com");
		
		try {
			new ControlInstituicao().cadastrarInstituicao(i);
		} catch (ConexaoException | DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CampoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsercaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Instituicao i = new Instituicao();
		i.setIdInstituicao(2);
		Pesquisador pe = new Pesquisador();
		pe.setIdPesquisador(1);
		Assessor a = new Assessor();
		a.setIdAssessor(1);
		AreaPesquisa ap = new AreaPesquisa();
		ap.setIdAreaPesquisa(2);
		
		Projeto p = new Projeto();
		p.setTitulo("Projeto Pedro");
		p.setDuracao(360);
		p.setInstituicao(i);
		p.setPesquisador(pe);
		p.setAreaPesquisa(ap);
		p.setAssessor(a);
		p.setIdProjeto(2);
		
		Situacao s = null;
		try {
			s = GerenciadorFactory.getFactory().conectar().find(Situacao.class, 2);
		} catch (ConexaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Collection<Situacao> si = new ArrayList<Situacao>();
		si.add(s);
		p.setColecaoSituacao(si);
		
		try {
			new DAOProjeto().informarSituacao(p);
			System.out.println("Cadastrado!");
		} catch (ConexaoException | DAOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		try {
			GerenciadorFactory.getFactory().desconectar();
		} catch (ConexaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("GerenciadorProj");
		EntityManager em = emf.createEntityManager();
		
		Situacao s = em.find(Situacao.class, 2);
		
		Collection<Situacao> si = new ArrayList<Situacao>();
		si.add(s);
		
		Projeto proj = em.find(Projeto.class, 2);
		proj.setColecaoSituacao(si);
		Collection<Projeto> col = new ArrayList<Projeto>();
		col.add(proj);
		s.setColecaoProjeto(col);
		
		em.getTransaction().begin();
		em.merge(proj);
		em.getTransaction().commit();
		
		em.close();
		emf.close();*/
		/*Perfil p = new Perfil();
		p.setIdPerfil(1);
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(1);
		usuario.setNome("Teste3");
		usuario.setPerfil(p);
		Collection<Usuario> u = new ArrayList<Usuario>();
		try {
			u = new DAOUsuario().pesquisarCriteriaJoin(usuario);
		} catch (ConexaoException | DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*Collection<Usuario> u = new ArrayList<Usuario>();
		try {
			u = new DAOUsuario().listarUsuariosPerfil("adm");
		} catch (ConexaoException | DAOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
