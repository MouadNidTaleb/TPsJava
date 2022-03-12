package ma.gov.tp8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.gov.tp8.controllers.ClientController;
import ma.gov.tp8.models.Client;


public class MonApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController)context.getBean("ctrl");
		  Client clt = new Client("TST");
	        ctrl.save(clt);
	} 
}
