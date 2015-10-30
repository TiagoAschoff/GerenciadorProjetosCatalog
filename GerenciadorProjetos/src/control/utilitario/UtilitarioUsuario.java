package control.utilitario;

import model.classes.Usuario;

public class UtilitarioUsuario {
		
	public static boolean verificarDescricao(Usuario usuario) {
		return usuario.getPerfil().getDescricao().equals("") || usuario.getPerfil().getDescricao() == null || usuario.getPerfil().getDescricao().length() >60;
	}
	
	public static boolean verificarabreviacao(Usuario usuario) {
		return usuario.getPerfil().getAbreviacao().equals("") || usuario.getPerfil().getAbreviacao() == null || usuario.getPerfil().getAbreviacao().length() >20;
	}
	
	public static boolean verificarUf(Usuario usuario) {
		return usuario.getEndereco().getUf().equals("") || usuario.getEndereco().getUf() == null || usuario.getEndereco().getUf().length() !=2;
	}
	
	public static boolean verificarRua(Usuario usuario) {
		return usuario.getEndereco().getRua().equals("") || usuario.getEndereco().getRua() == null || usuario.getEndereco().getRua().length() >60;
	}
	
	public static boolean verificarEnderecoNumero(Usuario usuario) {
		return usuario.getEndereco().getNumero() <=0;
	}
	
	public static boolean verificarComplemento(Usuario usuario) {
		return usuario.getEndereco().getComplemento().equals("") || usuario.getEndereco().getComplemento() == null || usuario.getEndereco().getComplemento().length() >60;
	}
	
	public static boolean verificarCidade(Usuario usuario) {
		return usuario.getEndereco().getCidade().equals("") || usuario.getEndereco().getCidade() == null || usuario.getEndereco().getCidade().length() >60;
	}
	
	public static boolean verificarCep(Usuario usuario) {
		return usuario.getEndereco().getCep().equals("") || usuario.getEndereco().getCep() == null || usuario.getEndereco().getCep().length() !=8;
	}
	
	public static boolean verificarSexo(Usuario usuario) {
		return usuario.getSexo().equals("") || usuario.getSexo()== null || usuario.getSexo().length() <8 || usuario.getSexo().length()>16;
	}
	
	public static boolean verificarTamanhoSenha(Usuario usuario) {
		return usuario.getSenha().length() <6 || usuario.getSenha().length() >20;
	}
	
	public static boolean verificarSenha(Usuario usuario) {
		return usuario.getSenha().equals("") || usuario.getSenha()== null;
	}
	
	public static boolean verificarRg(Usuario usuario) {
		return usuario.getRg().equals("") || usuario.getRg() == null || usuario.getRg().length() !=7;
	}
	
	public static boolean verificarNome(Usuario usuario) {
		return usuario.getNome().equals("") || usuario.getNome() == null || usuario.getNome().length() >100;
	}
	
	public static boolean verificarLogin(Usuario usuario) {
		return usuario.getLogin().equals("") || usuario.getLogin() == null || usuario.getLogin().length() >30;
	}
	
	public static boolean verificarFoneResidencial(Usuario usuario) {
		return usuario.getFoneResidencial().equals("") || usuario.getFoneResidencial() == null || usuario.getFoneResidencial().length() !=10;
	}
	
	public static boolean verificarTelefoneCelular(Usuario usuario) {
		return usuario.getFoneCelular().equals("") || usuario.getFoneCelular() == null || usuario.getFoneCelular().length() !=11;
	}

	public static boolean verificarEmail(Usuario usuario) {
		return usuario.getEmail().equals("") || usuario.getEmail() == null || usuario.getEmail().length() >100;
	}

	public static boolean verificarDataNasc(Usuario usuario) {
		return usuario.getDataNascimento().equals("") || usuario.getDataNascimento() == null || usuario.getDataNascimento().length() !=8;
	}

	public static boolean verificarCPF(Usuario usuario) {
		return usuario.getCpf().equals("") || usuario.getCpf() == null || usuario.getCpf().length() !=11;
	}
	
	public static boolean verificarIdEndereco(Usuario usuario) {
		return usuario.getEndereco().getIdEndereco() <=0 || usuario.getEndereco().getIdEndereco() == 0.0;
	}
	
	public static boolean verificarIdUsuario(Usuario usuario) {
		return usuario.getIdUsuario() <=0 || usuario.getIdUsuario() == 0.0;
	}
	
	public static boolean verificarIdPerfil(Usuario usuario) {
		return usuario.getPerfil().getIdPerfil() <=0 || usuario.getPerfil().getIdPerfil() == 0.0;
	}
	
	public static boolean isValidoUsuario(Usuario usuario) {
		return usuario.getIdUsuario() <=0;
	}
	
	public static boolean isValidoDescricao(Usuario usuario) {
		return usuario.getPerfil().getDescricao() == null || usuario.getPerfil().getDescricao().isEmpty();
	}

	public static boolean isValidoAbreviacao(Usuario usuario) {
		return usuario.getPerfil().getAbreviacao() == null || usuario.getPerfil().getAbreviacao().isEmpty();
	}

	public static boolean isValidoEnderecoNumero(Usuario usuario) {
		return usuario.getEndereco().getNumero() <0;
	}
	
	public static boolean isValidoUf(Usuario usuario) {
		return usuario.getEndereco().getUf() == null || usuario.getEndereco().getUf().isEmpty();
	}

	public static boolean isValidoRua(Usuario usuario) {
		return usuario.getEndereco().getRua() == null || usuario.getEndereco().getRua().isEmpty();
	}

	public static boolean isValidoComplemento(Usuario usuario) {
		return usuario.getEndereco().getComplemento() == null || usuario.getEndereco().getComplemento().isEmpty();
	}

	public static boolean isValidoCidade(Usuario usuario) {
		return usuario.getEndereco().getCidade() == null || usuario.getEndereco().getCidade().isEmpty();
	}

	public static boolean isValidoCep(Usuario usuario) {
		return usuario.getEndereco().getCep() == null || usuario.getEndereco().getCep().isEmpty();
	}

	public static boolean isValidoSexo(Usuario usuario) {
		return usuario.getSexo().isEmpty() || usuario.getSexo() == null;
	}

	public static boolean isValidoSenha(Usuario usuario) {
		return usuario.getSenha().isEmpty()|| usuario.getSenha() == null;
	}

	public static boolean isValidoRg(Usuario usuario) {
		return usuario.getRg().isEmpty() || usuario.getRg() == null;
	}

	public static boolean isValidoLogin(Usuario usuario) {
		return usuario.getLogin().isEmpty()||usuario.getLogin() ==null;
	}

	public static boolean isValidoFoneResidencial(Usuario usuario) {
		return usuario.getFoneResidencial().isEmpty() || usuario.getFoneResidencial() == null;
	}

	public static boolean isValidoFoneCelular(Usuario usuario) {
		return usuario.getFoneCelular().isEmpty()|| usuario.getFoneCelular() == null;
	}

	public static boolean isValidoEmail(Usuario usuario) {
		return usuario.getEmail().isEmpty() || usuario.getEmail() == null;
	}

	public static boolean isValidoDataNasc(Usuario usuario) {
		return usuario.getDataNascimento().isEmpty() || usuario.getDataNascimento() == null;
	}

	public static boolean isValidoCpf(Usuario usuario) {
		return usuario.getCpf().isEmpty() || usuario.getCpf() == null;
	}

	public static boolean isValidoNome(Usuario usuario) {
		return usuario.getNome() == null || usuario.getNome().isEmpty();
	}
}
