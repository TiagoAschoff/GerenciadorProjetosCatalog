/**
 * 
 */
package model.dao;

import java.util.Collection;

import model.classes.Instituicao;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

/**
 * @author marcio
 * Interface responsável por representar o DAO da Instituição
 */
public interface IInstituicao {
		
	public Collection<Instituicao> listar() throws ConexaoException, DAOException;

}
