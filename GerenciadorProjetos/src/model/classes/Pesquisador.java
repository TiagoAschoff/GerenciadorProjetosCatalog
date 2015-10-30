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
 * Classe responsável por representar o pesquisador do projeto
 */
@Entity
public class Pesquisador extends Pessoa implements Serializable, Generica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPesquisador;
	private String grauCientifico;
	@OneToMany(mappedBy="pesquisador")
	private Collection<Projeto> colecaoProjeto;
	
	public Pesquisador() {
		super();
	}
	public int getIdPesquisador() {
		return idPesquisador;
	}
	public void setIdPesquisador(int idPesquisador) {
		this.idPesquisador = idPesquisador;
	}
	public String getGrauCientifico() {
		return grauCientifico;
	}
	public void setGrauCientifico(String grauCientifico) {
		this.grauCientifico = grauCientifico;
	}
	@Override
	public Object getChavePrimaria() {
		// TODO Auto-generated method stub
		return getIdPesquisador();
	}
	public Collection<Projeto> getColecaoProjeto() {
		return colecaoProjeto;
	}
	public void setColecaoProjeto(Collection<Projeto> colecaoProjeto) {
		this.colecaoProjeto = colecaoProjeto;
	}
}
