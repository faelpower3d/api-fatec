package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Categoriaa.Categoria;
import Categoriaa.CategoriaRepository;



@SpringBootApplication
	public class Application {
		@Bean
		public CommandLineRunner run(@Autowired CategoriaRepository cr) {
			return args -> {
				Categoria categoria = new Categoria();
				categoria.setNome("Alimento");			
				cr.save(categoria);	
				
				
			};
		};	
public static void main(String[] args) {
	SpringApplication.run(Application.class, args);		
	
}
	
}
