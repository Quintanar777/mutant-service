package mx.meli.mutantservice;

import mx.meli.mutant.service.MutantManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MutantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MutantServiceApplication.class, args);
    }

    @Bean
    public MutantManager mutantManager() {
        return new MutantManager();
    }
}
