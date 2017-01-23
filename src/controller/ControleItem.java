package controller;
import java.util.ArrayList;
import java.util.List;
import model.dominio.Item;

public class ControleItem {
	
	List<Item> itens = new ArrayList<Item>();  
	
	
/* método comentado pois o cadastro de item passou a ficar na camada view 	
   public void	registrarItem(){
		
	   Item item1 = new Item(); 
	   Item item2 = new Item(); 
	   Item item3 = new Item();
	   Item item4 = new Item();

	        item1.setCodigo(1);
	   	    item1.setNome("Cachorro-Quente");
	    	item1.setDescricao("Cachorro-Quente Completo!"); 
	    	item1.setPreco((Double)4.00);
	    	
	        item2.setCodigo(2);
	   	    item2.setNome("Hamburguer");
	    	item2.setDescricao("X tudao completo!"); 
	    	item2.setPreco((Double)5.00);
	    	
	        item3.setCodigo(3);
	   	    item3.setNome("Refrigerante");
	    	item3.setDescricao("Cachorro-Quente Completo!"); 
	    	item3.setPreco((Double)3.00);
	    	
	        item2.setCodigo(2);
	   	    item2.setNome("Milk shake");
	    	item2.setDescricao("X tudao completo!"); 
	    	item2.setPreco((Double)6.00);
	    	
	   

	    	
	    	
            itens.add(item1);
            itens.add(item2);
            itens.add(item3);
            itens.add(item4);
                    

	}
*/ 
	public Item getItem(int id) {
		
		
		
	    for (Item item : itens) {
             if(item.getId() == id)
            	return item; 
            
	    	
	    	}
	    
	  
		return null;
	    
	  
	  
	}
		
}
   


			



     
   
      
	


