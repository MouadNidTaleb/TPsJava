package ma.gov.tp8.DAO;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.tp8.models.Client;


@Repository
public class ClientDAO implements IClientDAO {
	
	
	@Autowired
	IClientDAO clientDAO;
	
	
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	

    @Transactional
	public Client save(Client c) {
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return null;
	}

}
