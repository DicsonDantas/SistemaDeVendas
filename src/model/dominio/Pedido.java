package model.dominio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tab_pedido")
public class Pedido { 

    @Id
    @SequenceGenerator(name="COD_COMPRA", sequenceName="SEQ_COD_COMPRA", allocationSize=1)
	private int codigo;
    
	@OneToMany
	@Basic(fetch=FetchType.LAZY)
	List<Item> itens;
	
	@Column(name="sub_total", scale=15, precision=2)
	private float subTotal; 
	
	@Temporal(value=TemporalType.DATE)
	private Date data ; 
	
    // Verificar este relacionamento 
	
	@ManyToOne
	@JoinColumn(name="fk_fornecedor", nullable=false)
	private Cliente cliente; 

	

	public Pedido(int codigo, List<Item> itens, float subTotal, Date data,
			Cliente cliente) {
		super();
		this.codigo = codigo;
		this.itens = itens;
		this.subTotal = subTotal;
		this.data = data;
		this.cliente = cliente;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public List<Item> getItens() {
		return itens;
	}


	public void setItens(List<Item> itens) {
		this.itens = itens;
	}


	public float getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Double getValorTotal() {
		//processamento
		Double resultado = 0.0; 
		
		for (Item item : itens) {
			resultado += (item.getPreco());
		}
		
		return resultado;
	}

    
	public void adicionarItem(Item it){
		itens.add(it);	
	    
	}
	
	
	
}

    

	
	




  
        
        
