/**
 * 
 */
package model.classes;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

/**
 * @author marcio
 * Classe responsável pela representação do usuário criador de Projetos
 */
@Entity
@NamedQuery(
		name = Usuario.CONSULTA_USUARIO_ADM,
		query = "select u from Usuario u Join u.perfil p where p.abreviacao = 'adm'")
public class Usuario extends Pessoa implements Serializable, Generica {

	@TableGenerator(
			name="UsuarioTG",
			table="UsuarioGenerator",
			pkColumnValue="IdUsuarioGenerator")
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,
					generator="UsuarioTG")
	private int idUsuario;
	
	public static final String CONSULTA_USUARIO_ADM = "CONSULTA_USUARIO_ADM";
	private String login, senha;
	
	@ManyToOne
	private Perfil perfil;
	@OneToMany(mappedBy="usuario")
	private Collection<Instituicao> colecaoInstituicao;
	@OneToOne(cascade={CascadeType.ALL})
	private Endereco endereco;
	
	public Usuario(){
		
	}

	public Collection<Instituicao> getColecaoInstituicao() {
		return colecaoInstituicao;
	}

	public void setColecaoInstituicao(Collection<Instituicao> colecaoInstituicao) {
		this.colecaoInstituicao = colecaoInstituicao;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public Object getChavePrimaria() {
		return getIdUsuario();
	}
}
