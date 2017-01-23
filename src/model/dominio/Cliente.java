package model.dominio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tab_pessoas")
public class Cliente implements Serializable { 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_pessoa",length=120, nullable=false, unique=true) 
    private Integer id;
	@Column(name="nome_pessoa",length=120, nullable=false, unique=false) 
	private String nome;
	@Column(name="email_pessoa",length=120, unique=true)
	private String email;
	@Column(name="data_nascimento_pessoa",length=120)
	private String datanasc;
	@Column(name="cpf_pessoa")
	private String cpf;	
    @Column(name="tel_pessoa")
    private String telefone; 
	


public Cliente(Integer id, String nome, String email, String datanasc, String cpf, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.datanasc = datanasc;
		this.cpf = cpf;
		this.telefone = telefone; 
		
	}



public String getTelefone() {
	return telefone;
}



public void setTelefone(String telefone) {
	this.telefone = telefone;
}



public Cliente() {
		super();

	}


/* pode ser avaliado este trecho de Um para muitos, 
 como no diagrama e no meu ponto de vista um cliente pode e 
 deve guardar os registros dos pedidos que ja teve durante sua existencia */ 



/*
@OneToMany   
@JoinColumn(name="fk_pedido")
List<Pedido> pedidos;
*/
        
        
public Integer getId() {
	return id;
}



public void setId(Integer id) {
	this.id = id;
}



public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getDatanasc() {
	return datanasc;
}



public void setDatanasc(String datanasc) {
	this.datanasc = datanasc;
}



public String getCpf() {
	return cpf;
}



public void setCpf(String cpf) {
	this.cpf = cpf;
}

}

