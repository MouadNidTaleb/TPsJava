package cigma.tp10.services;

import cigma.tp10.DAO.IClientDao;
import cigma.tp10.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	private IClientDao dao;

	public ClientServiceImpl() {
		System.out.println("creation bean service");
	}

	@Override
	public void save(Client c) {
		dao.save(c);
	}
}