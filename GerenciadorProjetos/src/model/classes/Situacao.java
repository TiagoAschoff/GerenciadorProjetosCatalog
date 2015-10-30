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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * @author marcio
 * Classe responsável por representar os estados que o projeto estará no decorrer de sua vida
 */
@Entity
public class Situacao implements Serializable, Generica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idSituacao")
	private int idSituacao;
	private String abreviacao;
	private String nome;
	@ManyToMany
	@JoinTable(
			name="Situacao_Projeto",
			joinColumns=
				@JoinColumn(name="idSituacao"),
			inverseJoinColumns=
				@JoinColumn(name="idProjeto")
			)
	private Collection<Projeto> colecaoProjeto;
	
	public Collection<Projeto> getColecaoProjeto() {
		return colecaoProjeto;
	}
	public void setColecaoProjeto(Collection<Projeto> colecaoProjeto) {
		this.colecaoProjeto = colecaoProjeto;
	}
	public Situacao() {
		super();
	}
	public int getIdSituacao() {
		return idSituacao;
	}
	public void setIdSituacao(int idSituacao) {
		this.idSituacao = idSituacao;
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
		return getIdSituacao();
	}
}
