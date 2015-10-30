/**
 * 
 */
package model.classes;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author marcio
 * Classe responsável por representar as áreas de pesquisa que os projetos fazem parte
 */
@Entity
public class AreaPesquisa implements Serializable, Generica {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAreaPesquisa;
	private String abreviacao;
	private String nome;
	@OneToMany(mappedBy="areaPesquisa")
	private Collection<Projeto> colecaoProjeto;
	
	public AreaPesquisa() {
		super();
	}
	public int getIdAreaPesquisa() {
		return idAreaPesquisa;
	}
	public void setIdAreaPesquisa(int idAreaPesquisa) {
		this.idAreaPesquisa = idAreaPesquisa;
	}
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public Object getChavePrimaria() {
		return getIdAreaPesquisa();
	}
	public Collection<Projeto> getColecaoProjeto() {
		return colecaoProjeto;
	}
	public void setColecaoProjeto(Collection<Projeto> colecaoProjeto) {
		this.colecaoProjeto = colecaoProjeto;
	}
}
