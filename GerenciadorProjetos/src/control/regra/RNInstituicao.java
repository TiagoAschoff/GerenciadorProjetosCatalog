package control.regra;

import java.util.Collection;

import control.Controller;
import control.utilitario.UtilitarioInstituicao;
import model.classes.Instituicao;
import model.dao.DAOInstituicao;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

public class RNInstituicao {
	
	private DAOInstituicao daoIns;
	
	public RNInstituicao(){
		daoIns = new DAOInstituicao();
	}
	
	public boolean isValido(Instituicao instituicao){
		
		if((UtilitarioInstituicao.verificarEmail(instituicao))){
			return false;
		}

		if(UtilitarioInstituicao.verificarLogradouro(instituicao)){
			return false;			
		}
		
		if(UtilitarioInstituicao.verificarNome(instituicao)){
			return false;			
		}

		if(UtilitarioInstituicao.verificarTelefoneCelular(instituicao)){
			return false;			
		}

		if(UtilitarioInstituicao.verificarTelefoneResidencial(instituicao)){
			return false;			
		}

		return true;
	}
	
	public void verificar(Instituicao instituicao)throws CampoException{

		if(UtilitarioInstituicao.isValidoEmail(instituicao)){
			throw new CampoException("Informe o E-mail, campo inv�lid, ou quantidade de caracteres inv�lido");		
		}

		if(UtilitarioInstituicao.isValidoLogradouro(instituicao)){
			throw new CampoException("Informe o Logradouro, campo inv�lid, ou quantidade de caracteres inv�lido");			
		}

		if(UtilitarioInstituicao.isValidoNome(instituicao)){
			throw new CampoException("Informe o Nome, campo inv�lid, ou quantidade de caracteres inv�lido");
		}

		if(UtilitarioInstituicao.isValidoTelefoneCelular(instituicao)){
			throw new CampoException("Informe o Telefone Celular, campo inv�lid, ou quantidade de caracteres inv�lido");
		}

		if(UtilitarioInstituicao.isValidoTelefoneResidencial(instituicao)){
			throw new CampoException("Informe o Telefone Residencial, campo inv�lid, ou quantidade de caracteres inv�lido");
		}
	}
	public void valida(Instituicao instituicao) throws CampoException{
		if(!isValido(instituicao)){
			throw new CampoException("Campo inv�lido, certifique-se dos valores informados");
		}
	}
	public boolean isValidarIdUsuario(Instituicao instituicao){
		if(UtilitarioInstituicao.verificarIdUsuario(instituicao)){
			return true;
		}
		return false;
	}
	
	public boolean isValidarIdInstituicao(Instituicao instituicao){
		if(UtilitarioInstituicao.verificarIdInstituicao(instituicao)){
			return false;
		}
		return true;
	}
	
	public void verificarIdInstituicao(Instituicao instituicao) throws CampoException{
		if(UtilitarioInstituicao.verificarIdInstituicao(instituicao)){
			throw new CampoException("Informe o c�digo da Institui��o V�lido");
		}
	}
	
	public void verificarIdUsuario(Instituicao instituicao) throws CampoException{
		if(UtilitarioInstituicao.verificarIdUsuario(instituicao)){
			throw new CampoException("Informe o c�digo do Usu�rio V�lido");
		}
	}
	
	public void inserir(Instituicao instituicao) throws CampoException, InsercaoException {
		try{
			daoIns.inserir(instituicao);
		}catch(DAOException e){
			throw new InsercaoException("Erro na inser��o ao BD");
		}catch(ConexaoException ce){
			throw new InsercaoException("Erro na conex�o ao BD.");
		}
	}

	public void alterar(Instituicao instituicao) throws AtualizarException, CampoException{
		try{
			daoIns.alterar(instituicao);
		}catch(DAOException e){
			throw new AtualizarException("Erro na inser��o ao BD");
		}catch(ConexaoException ce){
			throw new AtualizarException("Erro na conex�o ao BD.");
		}
	}

	public Instituicao getInstituicao(Instituicao instituicao) throws BuscaException, CampoException{

		if(instituicao == null || instituicao.getIdInstituicao() <= 0){
			throw new BuscaException("Instituicao n�o existe ou inv�lido");
		}
		try{

			Instituicao inst = (Instituicao) daoIns.consultar(instituicao);
			if(inst == null){
				throw new BuscaException("Instituicao n�o encontrado, ou n�o existe");
			}else{
				return inst;
			}
		}catch(DAOException e){
			throw new BuscaException("Erro na busca ao BD");
		}catch(ConexaoException ce){
			throw new BuscaException("Erro na conex�o ao BD.");
		}
	}

	public void excluir(Instituicao instituicao) throws RemocaoException, CampoException{

		if(instituicao.getIdInstituicao() <= 0){
			throw new RemocaoException("Instituicao n�o encontrado, ou inv�lido");
		}
		try{
			daoIns.excluir(instituicao);
		}catch(DAOException e){
			throw new RemocaoException("Erro na exclus�o ao BD.");
		}catch(ConexaoException ce){
			throw new RemocaoException("Erro na conex�o ao BD.");
		}
	}

	public Collection<Instituicao> lista() throws ListaException{
		try{
			return daoIns.listar();
		}catch(DAOException e){
			throw new ListaException("Erro na inser��o ao BD.");
		}catch(ConexaoException ce){
			throw new ListaException("Erro na conex�o ao BD.");
		}
	}
}
