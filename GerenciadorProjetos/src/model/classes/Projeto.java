/**
 * 
 */
package model.classes;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * @author marcio
 * Classe responsável pela representação do Projeto da Instituição
 */
@Entity
public class Projeto implements Serializable, Generica  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idProjeto")
	private int idProjeto;
	private String titulo;
	private int duracao;
	private String dataEnvio;
	private String dataFinal;
	@ManyToOne
	private Instituicao instituicao;
	@ManyToOne
	private Assessor assessor;
	@ManyToOne
	private Pesquisador pesquisador;
	@ManyToOne
	private AreaPesquisa areaPesquisa;
	@ManyToMany(
			mappedBy="colecaoProjeto")	
	private Collection<Situacao> colecaoSituacao;
	
	public Collection<Situacao> getColecaoSituacao() {
		return colecaoSituacao;
	}
	public void setColecaoSituacao(Collection<Situacao> colecaoSituacao) {
		this.colecaoSituacao = colecaoSituacao;
	}
	public AreaPesquisa getAreaPesquisa() {
		return areaPesquisa;
	}
	public void setAreaPesquisa(AreaPesquisa areaPesquisa) {
		this.areaPesquisa = areaPesquisa;
	}
	public Pesquisador getPesquisador() {
		return pesquisador;
	}
	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}
	public Assessor getAssessor() {
		return assessor;
	}
	public void setAssessor(Assessor assessor) {
		this.assessor = assessor;
	}
	public Instituicao getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}
	public Projeto() {
		super();
	}
	public int getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	@Override
	public Object getChavePrimaria() {
		return getIdProjeto();
	}
	
}
