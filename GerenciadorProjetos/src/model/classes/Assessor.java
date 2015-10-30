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
 * Classe responsável pela representação do Assessor do Projeto
 */
@Entity
public class Assessor extends Pessoa implements Serializable, Generica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idAssessor;
	private String grauCientifico;
	@OneToMany(mappedBy="assessor")
	private Collection<Projeto> colecaoProjeto;
	
	public Assessor() {
		super();
	}
	public int getIdAssessor() {
		return idAssessor;
	}
	public void setIdAssessor(int idAssessor) {
		this.idAssessor = idAssessor;
	}
	public String getGrauCientifico() {
		return grauCientifico;
	}
	public void setGrauCientifico(String grauCientifico) {
		this.grauCientifico = grauCientifico;
	}
	@Override
	public Object getChavePrimaria() {
		return getIdAssessor();
	}
	public Collection<Projeto> getColecaoProjeto() {
		return colecaoProjeto;
	}
	public void setColecaoProjeto(Collection<Projeto> colecaoProjeto) {
		this.colecaoProjeto = colecaoProjeto;
	}
	
}
