import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.tp10.controller.*;
import cigma.tp10.models.*;

public class ApplicationRunner {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		ClientController ctr = (ClientController) ctx.getBean("ctrl");
	
		Client client = new Client("ClientPrototype");
		Client client1 = new ClientNormal("Client1",100);
		ClientNormal client2 = new ClientNormal("Client2",999);
		ClientVip client3 = new ClientVip("Client1","Electonics");
		//ctr.save(client);
		ctr.save(client1);
		ctr.save(client2);
		ctr.save(client3);
		
	    
	}

}
