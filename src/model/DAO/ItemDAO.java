package model.DAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.dominio.Item;

public class ItemDAO {

	private EntityManager manager = null;

	public ItemDAO() {
		super();

		// CRIAR UM FACTORY COM AS CONFIGURA합ES DO BANCO
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("masterdog");

		// CRIAR O ENTITY MANAGER PARA PERSISTIR OS OBJETOS
		this.manager = factory.createEntityManager();
	}

	public void incluir(Item item) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.persist(item);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void fecharConexao() {
		// FECHAR O ENTITY MANAGER
		this.manager.close();
	}

	public void alterar(Item item) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.merge(item);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public void remover(Item item) {
		// ABRIR TRANSA플O
		this.manager.getTransaction().begin();
		// INCLUIR PRODUTO
		this.manager.remove(item);
		// FECHAR TRANSA플O
		this.manager.getTransaction().commit();
	}

	public Item obter(Integer id) {
		// CARREGAR O PRODUTO PELA CHAVE PRIM핾IA
		Item retorno = this.manager.find(Item.class, id);
		return retorno;
	}
/*
	public List<Cliente> obterTodos() {
		List<Cliente> retorno = new ArrayList<Cliente>();
		return retorno;	

	}
	
*/

}
