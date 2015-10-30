package control.regra;

import java.util.Collection;

import control.Controller;
import control.utilitario.UtilitarioProjeto;
import model.classes.Projeto;
import model.classes.Situacao;
import model.dao.DAOProjeto;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

public class RNProjeto {
	
	private DAOProjeto daoP;
	
	public RNProjeto(){
		daoP = new DAOProjeto();
	}

	public boolean isValido(Projeto projeto){

		if((UtilitarioProjeto.verificarTitulo(projeto))){
			return false;
		}
		if((UtilitarioProjeto.verificarDataEnvio(projeto))){
			return false;
		}
		if((UtilitarioProjeto.verificarDataFinal(projeto))){
			return false;
		}
		if((UtilitarioProjeto.verificarIdProjeto(projeto))){
			return false;
		}
		return true;
	}
	public void verificar(Projeto projeto) throws CampoException{
		if(UtilitarioProjeto.isValidoDataEnvio(projeto)){
			throw new CampoException("Informe a data do envio, campo inv�lid, ou quantidade de caracteres inv�lido");
		}
		if(UtilitarioProjeto.isValidoDataFinal(projeto)){
			throw new CampoException("Informe a data final, campo inv�lid, ou quantidade de caracteres inv�lido");
		}
		if(UtilitarioProjeto.isValidoTitulo(projeto)){
			throw new CampoException("Informe o titulo, campo inv�lid, ou quantidade de caracteres inv�lido");
		}
	}
	public void valida(Projeto projeto) throws CampoException{
		if(!isValido(projeto)){
			throw new CampoException("Campo inv�lido, certifique-se dos valores informados");
		}
	}
	public boolean isValidarIdProjeto(Projeto projeto){
		if(UtilitarioProjeto.verificarIdProjeto(projeto)){
			return false;
		}
		return true;
	}
	public boolean isValidarIdInstituicao(Projeto projeto){
		if(UtilitarioProjeto.verificarIdInstituicao(projeto)){
			return false;
		}
		return true;
	}
	public boolean isValidarIdAreaPesquisa(Projeto projeto){
		if(UtilitarioProjeto.verificarIdAreaPesquisa(projeto)){
			return false;
		}
		return true;
	}	
	public boolean isValidarIdPesquisador(Projeto projeto){
		if(UtilitarioProjeto.verificarIdPesquisador(projeto)){
			return false;
		}
		return true;
	}
	public boolean isValidarIdAssessor(Projeto projeto){
		if(UtilitarioProjeto.verificarIdAssessor(projeto)){
			return false;
		}
		return true;
	}
	
	public void validarIdInstituicao(Projeto projeto) throws CampoException{
		if(!UtilitarioProjeto.verificarIdInstituicao(projeto)){
			throw new CampoException("Certifique dos dados da Institui��o");
		}
	}

	public void validarIdAreaPesquisa(Projeto projeto) throws CampoException{
		if(!UtilitarioProjeto.verificarIdAreaPesquisa(projeto)){
			throw new CampoException("Certifique dos dados da Area de Pesquisa");
		}
	}

	public void validarIdPesquisador(Projeto projeto) throws CampoException{
		if(!UtilitarioProjeto.verificarIdPesquisador(projeto)){
			throw new CampoException("Certifique dos dados do Pesquisador");
		}
	}

	public void validarIdProjeto(Projeto projeto) throws CampoException{
		if(!UtilitarioProjeto.verificarIdProjeto(projeto)){
			throw new CampoException("Certifique dos dados do Projeto");
		}
	}

	public void validarIdAssessor(Projeto projeto) throws CampoException{
		if(!UtilitarioProjeto.verificarIdAssessor(projeto)){
			throw new CampoException("Certifique dos dados do Assessor");
		}
	}
		
	public void inserir(Projeto projeto) throws InsercaoException {
		try{
			daoP.inserir(projeto);
		}catch(DAOException e){
			throw new InsercaoException("Erro na inser��o ao BD");
		}catch(ConexaoException ce){
			throw new InsercaoException("Erro na conex�o ao BD.");
		}
	}

	public void alterar(Projeto projeto) throws AtualizarException{
		try{
			daoP.alterar(projeto);
		}catch(DAOException e){
			throw new AtualizarException("Erro na inser��o ao BD");
		}catch(ConexaoException ce){
			throw new AtualizarException("Erro na conex�o ao BD.");
		}
	}

	public Projeto getProjeto(Projeto projeto) throws BuscaException{

		if(projeto == null || projeto.getIdProjeto() <= 0){
			throw new BuscaException("Projeto n�o existe ou inv�lido");
		}
		try{

			Projeto proj = (Projeto) daoP.consultar(projeto);
			if(proj == null){
				throw new BuscaException("Projeto n�o encontrado, ou n�o existe");
			}else{
				return proj;
			}
		}catch(DAOException e){
			throw new BuscaException("Erro na busca ao BD");
		}catch(ConexaoException ce){
			throw new BuscaException("Erro na conex�o ao BD.");
		}
	}

	public void excluir(Projeto projeto) throws RemocaoException{

		if(projeto.getIdProjeto() <= 0){
			throw new RemocaoException("Projeto n�o encontrado, ou inv�lido");
		}
		try{
			daoP.excluir(projeto);
		}catch(DAOException e){
			throw new RemocaoException("Erro na exclus�o ao BD.");
		}catch(ConexaoException ce){
			throw new RemocaoException("Erro na conex�o ao BD.");
		}
	}

	public Collection<Projeto> lista() throws ListaException{
		try{
			return daoP.listar();
		}catch(DAOException e){
			throw new ListaException("Erro na inser��o ao BD.");
		}catch(ConexaoException ce){
			throw new ListaException("Erro na conex�o ao BD.");
		}
	}
	
	public void atualizaSituacao(Projeto projeto) throws AtualizarException{
		if(projeto.getIdProjeto() <= 0){
			throw new AtualizarException("Erro na validação, certifique-se dos valores");
		}
		try{
			daoP.informarSituacao(projeto);
		}catch(DAOException e){
			throw new AtualizarException("Erro na atualização da situação ao BD");
		}catch(ConexaoException ce){
			throw new AtualizarException("Erro na conex�o ao BD.");
		}
	}
}
