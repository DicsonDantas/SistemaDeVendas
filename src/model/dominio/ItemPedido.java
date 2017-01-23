package model.dominio;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Entity
//@Table(name="tab_itens_pedido")
public class ItemPedido {
	/* @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="NUMERO_ITEM_PEDIDO", sequenceName="SEQ_NUMERO_ITEM_PEDIDO", allocationSize=1)
	@Column(name="numero_item_pedido")
	private Integer numeroItemPedido;
	
	@Column(name="quantidade")
	private Integer quantidade;
	
	@Column(name="preco_unidade")
	private Float precoUnidade;

	
	@ManyToOne
	@JoinColumn(name="fk_tab_pedido", nullable=false)
	@Basic(fetch=FetchType.LAZY)
	private Pedido pedido;

	
	public ItemPedido(Integer quantidade, Float precoUnidade) {
		super();
		this.quantidade = quantidade;
		this.precoUnidade = precoUnidade;
	
	}
	public ItemPedido(){
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Float getPrecoUnidade() {
		return precoUnidade;
	}
	public void setPrecoUnidade(Float precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	
	public void setPedido(Pedido pedido){
		this.pedido = pedido;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	

       */ 
}
	