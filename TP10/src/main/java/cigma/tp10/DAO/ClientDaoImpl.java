package cigma.tp10.DAO;


import cigma.tp10.models.Client;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImpl implements IClientDao {

	@PersistenceContext 
	private EntityManager entitymanager;

	public ClientDaoImpl(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}

	@Override
	public void save(Client p) {
		entitymanager.persist(p);
	}

	public ClientDaoImpl() {
		System.out.println("creation bean dao");
	}
}
