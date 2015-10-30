package control.regra;

import java.util.Collection;

import control.Controller;
import control.utilitario.UtilitarioUsuario;
import model.classes.Perfil;
import model.classes.Usuario;
import model.dao.DAOUsuario;
import model.excecoes.AtualizarException;
import model.excecoes.BuscaException;
import model.excecoes.CampoException;
import model.excecoes.ConexaoException;
import model.excecoes.DAOException;
import model.excecoes.InsercaoException;
import model.excecoes.ListaException;
import model.excecoes.RemocaoException;

public class RNUsuario {

	private DAOUsuario daoUsuario;
	private Usuario usuario;
	
	public RNUsuario(){
		daoUsuario = new DAOUsuario();
		usuario = new Usuario();
	}
	
	public boolean isValido(Usuario usuario){
		if(UtilitarioUsuario.isValidoNome(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoCpf(usuario)){
			return false;			
		}

		if(UtilitarioUsuario.isValidoDataNasc(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoEmail(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoFoneCelular(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoFoneResidencial(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoLogin(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoRg(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoSenha(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoSexo(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoCep(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoCidade(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoComplemento(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoRua(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoUf(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoEnderecoNumero(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoAbreviacao(usuario)){
			return false;
		}

		if(UtilitarioUsuario.isValidoDescricao(usuario)){
			return false;
		}

		return true;
	}


	public void verificar(Usuario usuario) throws CampoException{

		if(UtilitarioUsuario.verificarCPF(usuario)){
			throw new CampoException("Informe o CPF, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarDataNasc(usuario)){
			throw new CampoException("Informe a data de nascimento, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarEmail(usuario)){
			throw new CampoException("Informe o e-mail, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarTelefoneCelular(usuario)){
			throw new CampoException("Informe o telefone celular, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarFoneResidencial(usuario)){
			throw new CampoException("Informe o telefone residencial, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarLogin(usuario)){
			throw new CampoException("Informe o login, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarNome(usuario)){
			throw new CampoException("Informe o nome, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarRg(usuario)){
			throw new CampoException("Informe o RG, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarSenha(usuario)){
			throw new CampoException("Informe a senha, ou campo inv�lid");
		}

		if(UtilitarioUsuario.verificarTamanhoSenha(usuario)){
			throw new CampoException("Informe a senha tem que ser maiorque 6 caracteres ou menor que 20 caracteres");
		}

		if(UtilitarioUsuario.verificarSexo(usuario)){
			throw new CampoException("Informe sexo, ou campo inv�lid");
		}

		if(UtilitarioUsuario.verificarCep(usuario)){
			throw new CampoException("Informe o Cep, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarCidade(usuario)){
			throw new CampoException("Informe o Cidade, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarComplemento(usuario)){
			throw new CampoException("Informe o Complemento, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarEnderecoNumero(usuario)){
			throw new CampoException("Informe o n�mero da casa");
		}

		if(UtilitarioUsuario.verificarRua(usuario)){
			throw new CampoException("Informe a rua, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarUf(usuario)){
			throw new CampoException("Informe o UF, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarabreviacao(usuario)){
			throw new CampoException("Informe a Abrevia��o, campo inv�lid, ou quantidade de caracteres");
		}

		if(UtilitarioUsuario.verificarDescricao(usuario)){
			throw new CampoException("Informe a descri��o , campo inv�lid, ou quantidade de caracteres");
		}
	}

	public boolean isValidoIdPerfil(Usuario usuario){
		if(UtilitarioUsuario.verificarIdPerfil(usuario)){
			return false;
		}
		return true;
	}

	public boolean isValidarIdEndereco(Usuario usuario){
		if(UtilitarioUsuario.verificarIdEndereco(usuario)){
			return false;
		}
		return true;
	}

	public boolean isIdValido(Usuario usuario){
		if(UtilitarioUsuario.isValidoUsuario(usuario)){
			return false;
		}
		return true;
	}

	public void valida(Usuario usuario) throws CampoException{
		if(!isValido(usuario)){
			throw new CampoException("Campo inválido, certifique-se dos valores informados");
		}
	}

	public void validarId(Usuario usuario) throws CampoException{
		if(!isIdValido(usuario)){
			throw new CampoException("Certifique dos dados do Usuário");
		}
	}

	public void verificarIdUsuario(Usuario usuario) throws CampoException{
		if(UtilitarioUsuario.verificarIdUsuario(usuario)){
			throw new CampoException("Informe o código do Usuário válido");
		}
	}

	public void verificarIdPerfil(Usuario usuario) throws CampoException{
		if(UtilitarioUsuario.verificarIdPerfil(usuario)){
			throw new CampoException("Informe o c�digo do Perfil v�lido");
		}
	}

	public void verificarIdEndereco(Usuario usuario) throws CampoException{
		if(UtilitarioUsuario.verificarIdEndereco(usuario)){
			throw new CampoException("Informe o c�digo do Endere�o v�lido");
		}
	}
	
	public void inserir(Usuario usuario) throws InsercaoException {
		try{
			daoUsuario.inserir(usuario);
		}catch(DAOException e){
			throw new InsercaoException("Erro na inser��o ao BD");
		}catch(ConexaoException ce){
			throw new InsercaoException("Erro na conex�o ao BD.");
		}
	}

	public void alterar(Usuario usuario) throws AtualizarException{
		try{
			daoUsuario.alterar(usuario);
		}catch(DAOException e){
			throw new AtualizarException("Erro na atualização ao BD");
		}catch(ConexaoException ce){
			throw new AtualizarException("Erro na conex�o ao BD.");
		}
	}

	public Usuario getUsuario(Usuario usuario) throws BuscaException{

		if(usuario == null || usuario.getIdUsuario() <= 0){
			throw new BuscaException("Usuario n�o existe ou inv�lido");
		}
		try{

			usuario = (Usuario) daoUsuario.consultar(usuario);
			if(usuario == null){
				throw new BuscaException("Usu�rio n�o encontrado, ou n�o existe");
			}else{
				return usuario;
			}
		}catch(DAOException e){
			throw new BuscaException("Erro na busca ao BD");
		}catch(ConexaoException ce){
			throw new BuscaException("Erro na conex�o ao BD.");
		}
	}

	public void excluir(Usuario usuario) throws RemocaoException{

		if(usuario.getIdUsuario() <= 0){
			throw new RemocaoException("Cliente n�o encontrado, ou inv�lido");
		}
		try{
			daoUsuario.excluir(usuario);
		}catch(DAOException e){
			throw new RemocaoException("Erro na exclus�o ao BD.");
		}catch(ConexaoException ce){
			throw new RemocaoException("Erro na conex�o ao BD.");
		}
	}

	public Collection<Usuario> lista() throws ListaException{
		try{
			return daoUsuario.listar();
		}catch(DAOException e){
			throw new ListaException("Erro na inser��o ao BD.");
		}catch(ConexaoException ce){
			throw new ListaException("Erro na conex�o ao BD.");
		}
	}
	
	public Collection<Perfil> listaPerfis() throws ListaException{
		try{
			return daoUsuario.listarPerfil();
		}catch(DAOException e){
			throw new ListaException("Erro na inser��o ao BD.");
		}catch(ConexaoException ce){
			throw new ListaException("Erro na conex�o ao BD.");
		}
	}

	//Responsável por pegar usuários de acordo com o Perfil passado em parametro
	public Collection<Usuario> listaUsuariosPerfil(String abreviacaoPerfil) 
			throws ListaException{
		try{
			return daoUsuario.listarUsuariosPerfil(abreviacaoPerfil);
		}catch(DAOException e){
			throw new ListaException("Erro na inser��o ao BD.");
		}catch(ConexaoException ce){
			throw new ListaException("Erro na conex�o ao BD.");
		}
	}
	
	public Collection<Usuario> pesquisarCriteria(Usuario usuario) throws ListaException{
		try {
			return daoUsuario.pesquisarCriteria(usuario);
		} catch (ConexaoException | DAOException e) {
			throw new ListaException("Erro na listagem ao BD.");
		}
	}
	
	public Collection<Usuario> pesquisarCriteriaJoin(Usuario usuario) throws ListaException{
		try {
			return daoUsuario.pesquisarCriteriaJoin(usuario);
		} catch (ConexaoException | DAOException e) {
			// TODO Auto-generated catch block
			throw new ListaException("Erro na listagem ao BD");
		}
	}
}
