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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author marcio
 * Classe responsavel por representar a Instituição dos projetos
 */
@Entity
public class Instituicao implements Serializable, Generica {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idInstituicao;
	private String nome;
	private String logradouro;
	private String fone1;
	private String fone2;
	private String email;
	@ManyToOne
	private Usuario usuario;
	@OneToMany(mappedBy="instituicao")
	private Collection<Projeto> colecaoProjeto;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Instituicao() {
		super();
	}
	public int getIdInstituicao() {
		return idInstituicao;
	}
	public void setIdInstituicao(int idInstituicao) {
		this.idInstituicao = idInstituicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getFone1() {
		return fone1;
	}
	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}
	public String getFone2() {
		return fone2;
	}
	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public Object getChavePrimaria() {
		return getIdInstituicao();
	}
	public Collection<Projeto> getColecaoProjeto() {
		return colecaoProjeto;
	}
	public void setColecaoProjeto(Collection<Projeto> colecaoProjeto) {
		this.colecaoProjeto = colecaoProjeto;
	}
}
