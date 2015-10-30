package control.utilitario;

import model.classes.Projeto;;

public class UtilitarioProjeto {
	
	//verificar Projeto
	public static boolean verificarTitulo(Projeto projeto) {
		return projeto.getTitulo().equals("") || projeto.getTitulo() == null || projeto.getTitulo().length() >60;
	}
	public static boolean verificarDataEnvio(Projeto projeto) {
		return projeto.getDataEnvio().equals("") || projeto.getDataEnvio() == null || projeto.getDataEnvio().length() >10;
	}
	public static boolean verificarDataFinal(Projeto projeto) {
		return projeto.getDataFinal().equals("") || projeto.getDataFinal() == null || projeto.getDataFinal().length() >10;
	}
	
	//Verificar Dura��o
	public static boolean verificarDuracao(Projeto projeto) {
		return projeto.getDuracao() <0 || projeto.getDuracao() >30;
	}
	
	//verificar Id
	public static boolean verificarIdProjeto(Projeto projeto) {
		return projeto.getIdProjeto() <=0 || projeto.getDuracao() == 0.0;
	}
	public static boolean verificarIdInstituicao(Projeto projeto) {
		return projeto.getInstituicao().getIdInstituicao() <=0 || projeto.getInstituicao().getIdInstituicao() == 0.0;
	}
	public static boolean verificarIdAssessor(Projeto projeto) {
		return projeto.getAssessor().getIdAssessor() <=0 || projeto.getAssessor().getIdAssessor() == 0.0;
	}
	public static boolean verificarIdPesquisador(Projeto projeto) {
		return projeto.getPesquisador().getIdPesquisador() <=0 || projeto.getPesquisador().getIdPesquisador() == 0.0;
	}
	public static boolean verificarIdAreaPesquisa(Projeto projeto) {
		return projeto.getAreaPesquisa().getIdAreaPesquisa() <=0 || projeto.getAreaPesquisa().getIdAreaPesquisa() == 0.0;
	}
	
	//isValido
	public static boolean isValidoTitulo(Projeto projeto) {
		return projeto.getTitulo() == null || projeto.getTitulo().isEmpty();
	}
	public static boolean isValidoDataEnvio(Projeto projeto) {
		return projeto.getDataEnvio() == null || projeto.getDataEnvio().isEmpty();
	}
	public static boolean isValidoDataFinal(Projeto projeto) {
		return projeto.getDataFinal() == null || projeto.getDataFinal().isEmpty();
	}
	
}
