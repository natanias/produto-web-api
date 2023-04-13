package br.com.webapi.mvc.NatWill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NatWillApplication {

	public static void main(String[] args) {
		SpringApplication.run(NatWillApplication.class, args);
		
		System.out.println("Logado!");
	}

}
