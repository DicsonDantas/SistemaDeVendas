package model.dominio;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tab_itens")
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@SequenceGenerator(name="NUMERO_ITEM", sequenceName="SEQ_NUMERO_ITEM", allocationSize=1)
	@Column(name="id_item",length=100, nullable=false, unique=true) 
    private int id;
	@Column(name="nome_item")
	private String nome;
	@Column(name="preco_item")
	private Double preco ;
	@Column(name="descricao_item")
	private String descricao;
        



    public Item(int id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
      public Item() {
 
    }
  	
  	

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
    	Double p = Double.valueOf(preco);
        this.preco = p;
      
    }
    
    @Override
    public String toString() {
    	
    	return String.format("%s - %f",this.getNome(),this.getPreco());
    	
    }

      
	



}
