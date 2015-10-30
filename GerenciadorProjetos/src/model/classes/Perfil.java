/**
 * 
 */
package model.classes;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author marcio
 * Classe responsável por representar o perfil de Usuários do Sistema
 * @implements Implementa a serialazação nativa
 * 
 */
@Entity
public class Perfil implements Serializable, Generica {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPerfil;
	private String descricao, abreviacao;
	
	public Perfil() {
		super();
	}
	public int getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	@Override
	public Object getChavePrimaria() {
		return getIdPerfil();
	}
}
