package org.sid;

import org.sid.dao.ClientRepository;

import org.sid.enities.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class VotreBanqueApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(VotreBanqueApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		  Client c1=clientRepository.save(new Client("gust", "kamgagustave@gmamil.com"));
		  Client c2=clientRepository.save(new Client("toutou", "toutougustave@gmamil.com"));
		  Client c3=clientRepository.save(new Client("ngnie", "ngniegustave@gmamil.com"));
		  Client c4=clientRepository.save(new Client("leon", "leongustave@gmamil.com"));
	}

}
