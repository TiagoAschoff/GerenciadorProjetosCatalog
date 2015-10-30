package control.controller;

import java.util.Collection;

import model.classes.Instituicao;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

public interface IControlInstituicao {

	public void cadastrarInstituicao(Instituicao instituicao) throws ConexaoException, DAOException, CampoException, InsercaoException;
	
	public void atualizarInstituicao(Instituicao instituicao) throws ConexaoException, DAOException, CampoException, AtualizarException;
	
	public void excluirInstituicao(Instituicao instituicao) throws ConexaoException, DAOException, CampoException, RemocaoException;
	
	public Instituicao pesquisarInstituicao(Instituicao instituicao) throws ConexaoException, DAOException, BuscaException, CampoException;
	
	public Collection<Instituicao> listarInstituicao() throws ConexaoException, DAOException, ListaException;
}
