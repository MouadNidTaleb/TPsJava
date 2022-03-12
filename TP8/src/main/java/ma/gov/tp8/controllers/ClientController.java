package ma.gov.tp8.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.gov.tp8.Services.IClientService;
import ma.gov.tp8.models.Client;


@Controller
public class ClientController {
	
	
	@Autowired
	IClientService clientService;
	

	public IClientService getClientService() {
		return clientService;
	}

	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}

	public ClientController() {
		
	}

	public ClientController(IClientService clientService) {
		this.clientService = clientService;
		}

	public Client save(Client c) {
		return clientService.save(c);
	}
}
