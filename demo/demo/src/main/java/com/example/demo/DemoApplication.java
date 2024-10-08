package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	NumeroRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	@GetMapping("/hello")
    public String hello()  {
      return "Hola Mundo";
    }
	@PostMapping("/api/secuence/collatz")
    public Numero createobjNum(@RequestBody Numero num)  {

		return repository.save(num);
    }
	@PutMapping("/api/fizzbuzz/")  
	private String PutNum(@RequestBody Numero numero)   
	{  
	numero.setNumero(15);
	return "Cambio hecho.";
	}
	
}
