package cigma.tp10.controller;

import cigma.tp10.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import cigma.tp10.services.IClientService;

@Controller("ctrl")
public class ClientController {
	@Autowired
	private IClientService service;

	public void save(Client person) {
		service.save(person);
	}

	public ClientController() {
		System.out.println("creation bean controller");
	}
}