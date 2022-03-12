package ma.gov.tp8.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.tp8.DAO.IClientDAO;
import ma.gov.tp8.models.Client;


@Service
public class ClientService implements IClientService {
	
	
	@Autowired
	IClientDAO clientDAO;
	
	
	
	public ClientService() {
		super();
		// TODO Auto-generated constructor stub
	}





	public ClientService(IClientDAO clientDAO) {
		super();
		this.clientDAO = clientDAO;
	}

	
	public Client save(Client clt) {
		return clientDAO.save(clt);
	}

}
