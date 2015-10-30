package control.utilitario;

import model.classes.Instituicao;

public class UtilitarioInstituicao {
	
	//Verificar Institui��o
	public static boolean verificarNome(Instituicao instituicao) {
		return instituicao.getNome().equals("") || instituicao.getNome() == null || instituicao.getNome().length() >100;
	}
	public static boolean verificarEmail(Instituicao instituicao) {
		return instituicao.getEmail().equals("") || instituicao.getEmail() == null || instituicao.getEmail().length() >100;
	}
	public static boolean verificarTelefoneCelular(Instituicao instituicao) {
		return instituicao.getFone1().equals("") || instituicao.getFone1() == null || instituicao.getFone1().length() >11;
	}
	public static boolean verificarTelefoneResidencial(Instituicao instituicao) {
		return instituicao.getFone2().equals("") || instituicao.getFone2() == null || instituicao.getFone2().length() >10;
	}
	public static boolean verificarLogradouro(Instituicao instituicao) {
		return instituicao.getLogradouro().equals("") || instituicao.getLogradouro() == null || instituicao.getLogradouro().length() >60;
	}
	
	// Verificar Id
	public static boolean verificarIdInstituicao(Instituicao instituicao) {
		return instituicao.getIdInstituicao() <=0 || instituicao.getIdInstituicao() == 0.0;
	}
	public static boolean verificarIdUsuario(Instituicao instituicao) {
		return instituicao.getUsuario().getIdUsuario() <=0 || instituicao.getIdInstituicao() == 0.0;
	}
	
	// isValido
	public static boolean isValidoNome(Instituicao instituicao) {
		return instituicao.getNome() == null || instituicao.getNome().isEmpty();
	}
	public static boolean isValidoEmail(Instituicao instituicao) {
		return instituicao.getEmail() == null || instituicao.getEmail().isEmpty();
	}
	public static boolean isValidoTelefoneCelular(Instituicao instituicao) {
		return instituicao.getFone1() == null || instituicao.getFone1().isEmpty();
	}
	public static boolean isValidoTelefoneResidencial(Instituicao instituicao) {
		return instituicao.getFone2() == null || instituicao.getFone2().isEmpty();
	}
	public static boolean isValidoLogradouro(Instituicao instituicao) {
		return instituicao.getLogradouro() == null || instituicao.getLogradouro().isEmpty();
	}
}
