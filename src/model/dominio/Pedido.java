package model.dominio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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
import javax.persistence.Table;


public class Pedido { 


	private int codigo;
	List<Item> itens;
	
	private Cliente cliente; 

	public Pedido() {
		this.itens = new ArrayList<Item>();
		
	} 
	
	public List<Item> getItens() {
		return itens;
	}
	
     public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

    

	
	




  
        
        
