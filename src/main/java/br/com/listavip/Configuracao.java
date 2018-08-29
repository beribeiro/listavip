package br.com.listavip;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Configuracao {
	public static void main(String[] args) throws SQLException {
		SpringApplication.run(Configuracao.class, args);
	}

}
