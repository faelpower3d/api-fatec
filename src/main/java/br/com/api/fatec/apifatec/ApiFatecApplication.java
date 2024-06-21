package br.com.api.fatec.apifatec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.api.fatec.apifatec.p2.Categoria;
import br.com.api.fatec.apifatec.p2.CategoriaRepository;

@SpringBootApplication
public class ApiFatecApplication {
    
    @Autowired
    private CategoriaRepository cr;
    
    public static void main(String[] args) {
        SpringApplication.run(ApiFatecApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner run() {
        return args -> {
            Categoria categoria1 = new Categoria();
            categoria1.setNome("Alimento");
            cr.save(categoria1);

            Categoria categoria2 = new Categoria();
            categoria2.setNome("Roupas");
            cr.save(categoria2);

            Categoria categoria3 = new Categoria();
            categoria3.setNome("Eletrônicos");
            cr.save(categoria3);
            
            Categoria categoria4 = new Categoria();
            categoria4.setNome("Casa");
            cr.save(categoria4);
            
            Categoria categoria5 = new Categoria();
            categoria5.setNome("Banho");
            cr.save(categoria5);
            
            Categoria categoria6 = new Categoria();
            categoria6.setNome("Decoração");
            cr.save(categoria6);
        };
    }
}
