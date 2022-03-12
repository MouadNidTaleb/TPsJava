package ma.rest.demo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.rest.demo.DAO.IClientDAO;
import ma.rest.demo.Models.Client;

@SpringBootApplication
public class Tp12Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp12Application.class, args);
	}
	
}
